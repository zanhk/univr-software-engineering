package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Prescrizione;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class Utility {
    public static String date2String(Date data) {
        return data.getDate()+"/"+data.getMonth()+"/"+data.getYear();
    }
    public static Date string2Date(String stringa) {    // dd/MM/yyyy
        String[] stringaSplittata = stringa.split("/");
        return new Date(Integer.parseInt(stringaSplittata[2]), Integer.parseInt(stringaSplittata[1]), Integer.parseInt(stringaSplittata[0]));
    }
    
    public static Paziente string2Paziente(String stringa) {
        String[] campi = stringa.split(";");
        Paziente paziente = new Paziente();
        paziente.setCodiceSanitario(campi[0]);
        paziente.setCognome(campi[1]);
        paziente.setNome(campi[2]);
        paziente.setGenere(campi[3].charAt(0));
        paziente.setLuogoDiNascita(campi[4]);
        paziente.setDataDiNascita(string2Date(campi[5]));
        paziente.generaCodiceFiscale();
        return paziente;
    }
    
    public static String paziente2String(Paziente paziente) {
        String stringa = paziente.getCodiceSanitario()+";"
                        +paziente.getCognome()+";"
                        +paziente.getNome()+";"
                        +paziente.getGenere()+";"
                        +paziente.getLuogoDiNascita()+";"
                        +date2String(paziente.getDataDiNascita())+";"
                        +paziente.getCodiceFiscale();
        return stringa;
    }
    
    public static Prescrizione string2Prescrizione(String stringa) {
        String[] campi = stringa.split(";");
        Prescrizione prescrizione = new Prescrizione();
        prescrizione.setNomeFarmaco(campi[0]);
        prescrizione.setQuantitaDose(Float.parseFloat(campi[1]));
        prescrizione.setDataPrescrizione(Utility.string2Date(campi[2]));
        prescrizione.setDataFineTerapia(Utility.string2Date(campi[3]));
        prescrizione.setMedico(campi[4]);
        
        return prescrizione;
    }
    
    public static String prescrizione2String(Prescrizione prescrizione) {
        String stringa = prescrizione.getNomeFarmaco() + ";"
                + prescrizione.getQuantitaDose() + ";"
                + Utility.date2String(prescrizione.getDataPrescrizione()) + ";"
                + Utility.date2String(prescrizione.getDataFineTerapia()) + ";"
                + prescrizione.getMedico();
        return stringa;
    }
    
    public static Somministrazione string2Somministrazione(String stringa) {
        String[] campi = stringa.split(";");
        Somministrazione somministrazione = new Somministrazione();
        somministrazione.setNomeFarmaco(campi[0]);
        somministrazione.setDoseSomministrata(Float.parseFloat(campi[1]));
        somministrazione.setDataSomministrazione(Utility.string2Date(campi[2]));
        somministrazione.setNote(campi[3]);
        
        return somministrazione;
    }
    
    public static String somministrazione2String(Somministrazione somministrazione) {
        String stringa = ""
                + somministrazione.getNomeFarmaco() + ";"
                + somministrazione.getDoseSomministrata() + ";"
                + Utility.date2String(somministrazione.getDataSomministrazione()) + ";"
                + somministrazione.getNote();
        
        return stringa;
    }
    
    public static void chiudiDialog(ActionEvent e) {
            Component component = (Component) e.getSource();
            JDialog thisDialog = (JDialog) SwingUtilities.getRoot(component);
            thisDialog.dispose();            
    }
    public Object getRootFrameOrDialog(ActionEvent e){
        Component myComponent = (Component) e.getSource();
        return SwingUtilities.getRoot(myComponent);
    }
}
