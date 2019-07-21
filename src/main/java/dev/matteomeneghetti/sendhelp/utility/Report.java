package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Prescrizione;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import dev.matteomeneghetti.sendhelp.gui.MainWindow;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private String text;
    private MainWindow main;

    public Report(MainWindow main) {
        text = "";
        this.main = main;
        generaTesto();
    }
    
    public String getTesto() {
        return text;
    }

    private void generateHead() {
        text += "<html><head><title>Report Settimanale</title></head><body>";
    }

    private void generateTail() {
        text += "</body></html>";
    }

    private void generaListaPazienti() {
        String testo = "<p>Pazienti ricoverati</p>";
        testo += "<ul>";
        for (CartellaClinica cartella : main.pazientiInCura) {
            testo += "<li>" + cartella.toString() + "</li>";
            testo += "<ul>";
            testo += "<li>" + "Dati anagrafici" + "</li>";
            testo += "<ul>";
            testo += "<li>" + "Paziente nr.: " + cartella.getPaziente().getCodiceSanitario() + "</li>";
            testo += "<li>" + "Nome: " + cartella.getPaziente().getNome() + "</li>";
            testo += "<li>" + "Cognome: " + cartella.getPaziente().getCognome() + "</li>";
            testo += "<li>" + "Data di nascita: " + Utility.date2ReadableString(cartella.getPaziente().getDataDiNascita()) + "</li>";
            testo += "<li>" + "Comune di nascita: " + cartella.getPaziente().getLuogoDiNascita() + "</li>";
            testo += "</ul>";
            testo += "<br/>";

            if (cartella.getPrescrizioni().size() > 0) {
                testo += "<li>" + "Prescrizioni" + "</li>";
                testo += "<ul>";
                for (Prescrizione prescrizione : cartella.getPrescrizioni()) {
                    testo += "<li>" + prescrizione.toString() + "</li>";
                    testo += "<ul>";
                    testo += "<li>" + "Farmaco: " + prescrizione.getNomeFarmaco() + "</li>";
                    testo += "<li>" + "Dose: " + prescrizione.getQuantitaDose() + "</li>";
                    testo += "<li>" + "Dosi al giorno: " + prescrizione.getNumeroDosiGiornaliere() + "</li>";
                    testo += "<li>" + "Data inizio terapia: " + Utility.date2ReadableString(prescrizione.getDataPrescrizione()) + "</li>";
                    testo += "<li>" + "Data fine terapia: " + Utility.date2ReadableString(prescrizione.getDataFineTerapia()) + "</li>";
                    testo += "<li>" + "Prescritta da " + prescrizione.getMedico() + "</li>";
                    testo += "</ul>";
                }
                testo += "</ul>";
                testo += "<br/>";
            }

            if (cartella.getSomministrazioni().size() > 0) {
                testo += "<li>" + "Somministrazioni" + "</li>";
                testo += "<ul>";
                for (Somministrazione somministrazione : cartella.getSomministrazioni()) {
                    testo += "<li>" + somministrazione.toString() + "</li>";
                    testo += "<ul>";
                    testo += "<li>" + "Farmaco: " + somministrazione.getNomeFarmaco() + "</li>";
                    testo += "<li>" + "Dose: " + somministrazione.getDoseSomministrata() + "</li>";
                    testo += "<li>" + "Data di somministrazione: " + Utility.date2ReadableString(somministrazione.getDataSomministrazione()) + "</li>";
                    testo += "<li>" + "Note: " + somministrazione.getNote() + "</li>";
                    testo += "</ul>";
                }
                testo += "</ul>";
                testo += "<br/>";
            }

        }
        testo += "</ul>";
        text += testo;
    }

    private void generaListaPazientiDimessi() {
        List<CartellaClinica> pazientiDimessi = new ArrayList<>();
        try {
            String path = "resources" + File.separator + "Pazienti_dimessi";
            File[] file = new File(path).listFiles(File::isDirectory);
            for (File name : file) {
                String dataPaziente = new CSVManager(path + File.separator + name.getName() + File.separator + "Analisi.csv", ";").getLineAt(0);
                CartellaClinica paziente = new CartellaClinica(Utility.string2Paziente(dataPaziente));
                pazientiDimessi.add(paziente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String testo = "";

        if (pazientiDimessi.size() > 0) {
            testo += "<p>Pazienti dimessi</p>";
            testo += "<ul>";
            for (CartellaClinica cartella : pazientiDimessi) {
                testo += "<li>" + cartella.getPaziente() + "</li>";
                testo += "<ul>";
                String path = "resources" + File.separator + "Pazienti_dimessi" + File.separator + cartella.getPaziente() + File.separator + "Dimissione.txt";
                String dataDimissione = Utility.date2ReadableString(Utility.string2Date(new CSVManager(path, ";").getLineAt(0)));
                testo += "<li>" + "Data di dimissione: " + dataDimissione + "</li>";
                testo += "<li>" + "Lettera di dimissione: " + new CSVManager(path, ";").getLineAt(1) + "</li>";
                testo += "</ul>";
            }
            testo += "</ul>";
        }
        text += testo;
    }

    private void generaTesto() {
        generateHead();
        generaListaPazienti();
        generaListaPazientiDimessi();
        generateTail();
    }

    public void createFile() {

        File file = new File("report.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(text);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
