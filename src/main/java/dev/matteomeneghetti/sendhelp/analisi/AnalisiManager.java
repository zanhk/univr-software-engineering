package dev.matteomeneghetti.sendhelp.analisi;

import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.gui.Alarm;
import dev.matteomeneghetti.sendhelp.gui.DefaultJDialog;
import dev.matteomeneghetti.sendhelp.gui.MainWindow;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.PropertyManager;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class AnalisiManager extends Thread {

    Paziente paziente;
    Timer timer;
    MainWindow main;
    PropertyManager properties;

    public AnalisiManager(Paziente paziente, MainWindow main) {
        this.paziente = paziente;
        this.main = main;
        properties = PropertyManager.getInstance();
    }

    public Timer getTimer() {
        return timer;
    }

    public void aggiornaTimer() {
        timer.cancel();
        timer = new Timer();
        setTimer();
    }

    private void setTimer() {
        timer.schedule(new SendMessage("BPM"), 0, Integer.parseInt(properties.getValue("BPM"))*1000);
        timer.schedule(new SendMessage("SBP"), 0, Integer.parseInt(properties.getValue("SBP"))*1000);
        timer.schedule(new SendMessage("DBP"), 0, Integer.parseInt(properties.getValue("DBP"))*1000);
        timer.schedule(new SendMessage("TEMP"), 0, Integer.parseInt(properties.getValue("TEMP"))*1000);
    }

    @Override
    public void run() {
        timer = new Timer();
        setTimer();
    }

    public class SendMessage extends TimerTask {

        String type;

        public SendMessage(String type) {
            this.type = type;
        }

        private Message generaMessaggio() {
            MessageFactory msgfactory = new MessageFactory();
            return msgfactory.getMessage(type);
        }

        private void salvaSuFile(Message msg) {
            String pathToFile = "resources" + File.separator + "Pazienti" + File.separator + paziente + File.separator + type + ".csv";
            CSVManager wr = new CSVManager(pathToFile, ";");
            int position = -1;
            switch (type) {
                case "SBP":
                    position = 1;
                    break;
                case "DBP":
                    position = 2;
                    break;
                case "BPM":
                    position = 3;
                    break;
                case "TEMP":
                    position = 4;
                    break;
            }
            String linea = "";
            linea += String.valueOf(msg.getValore());
            wr.append(linea);
            main.updateAnalisi(pathToFile, position, type, paziente.toString());
        }

        private void notifica(Message msg) {
            Integer value = msg.getValore();
            switch (type) {
                case "TEMP":
                    if (value >= 38) {
                        new DefaultJDialog(new Alarm(2, "Ipertermia"), "Allarme IPERTERMIA");
                    } else if (value <= 34) {
                        new DefaultJDialog(new Alarm(2, "Ipotermia"), "Allarme IPOTERMIA");
                    }
                    break;
                case "BPM":
                    if (value >= 120) {
                        new DefaultJDialog(new Alarm(3, "Fibrillazione ventricolare"), "Allarme FIBRILLAZIONE VENTRICOLARE");
                    } else if (value >= 110) {
                        new DefaultJDialog(new Alarm(1, "Tachicardia"), "Allarme TACHICARDIA");
                    } else if (value < 60) {
                        new DefaultJDialog(new Alarm(1, "Brachicardia"), "Allarme BRACHICARDIA");
                    }
                    break;
                case "DBP":
                    if (value >= 140) {
                        new DefaultJDialog(new Alarm(2, "Ipertensione"), "Allarme IPERTENSIONE");
                    }
                    break;
                case "SBP":
                    if (value <= 60) {
                        new DefaultJDialog(new Alarm(2, "Ipotensione"), "Allarme IPOTENSIONE");
                    }
            }
        }

        @Override
        public void run() {
            Message msg = generaMessaggio();
            msg.generaValore();
            salvaSuFile(msg);
            //notifica(msg);
        }

    }

}
