package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Prescrizione;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import dev.matteomeneghetti.sendhelp.gui.MainWindow;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

    private String text;
    private MainWindow main;

    public Report(MainWindow main) {
        text = "";
        this.main = main;
        createFile();
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
            testo += "<li>" + "Data di nascita: " + cartella.getPaziente().getDataDiNascita() + "</li>";
            testo += "<li>" + "Comune di nascita: " + cartella.getPaziente().getLuogoDiNascita() + "</li>";
            testo += "</ul>";
            testo += "<br/>";

            testo += "<li>" + "Prescrizioni" + "</li>";
            testo += "<ul>";
            for (Prescrizione prescrizione : cartella.getPrescrizioni()) {
                testo += "<li>" + prescrizione.toString() + "</li>";
                testo += "<ul>";
                testo += "<li>" + "Farmaco: " + prescrizione.getNomeFarmaco() + "</li>";
                testo += "<li>" + "Dose: " + prescrizione.getQuantitaDose() + "</li>";
                testo += "<li>" + "Dosi al giorno: " + prescrizione.getNumeroDosiGiornaliere() + "</li>";
                testo += "<li>" + "Data inizio terapia: " + prescrizione.getDataPrescrizione() + "</li>";
                testo += "<li>" + "Data fine terapia: " + prescrizione.getDataFineTerapia() + "</li>";
                testo += "<li>" + "Prescritta da " + prescrizione.getMedico() + "</li>";
                testo += "</ul>";
            }
            testo += "</ul>";
            testo += "<br/>";

            testo += "<li>" + "Somministrazioni" + "</li>";
            testo += "<ul>";
            for (Somministrazione somministrazione : cartella.getSomministrazioni()) {
                testo += "<li>" + somministrazione.toString() + "</li>";
                testo += "<ul>";
                testo += "<li>" + "Farmaco: " + somministrazione.getNomeFarmaco() + "</li>";
                testo += "<li>" + "Dose: " + somministrazione.getDoseSomministrata() + "</li>";
                testo += "<li>" + "Data di somministrazione: " + somministrazione.getDataSomministrazione() + "</li>";
                testo += "<li>" + "Note: " + somministrazione.getNote() + "</li>";
                testo += "</ul>";
            }
            testo += "</ul>";
        }
        testo += "</ul>";
        text += testo;
    }

    private void generaListaPazientiDimessi() {

    }

    private void createFile() {
        generateHead();
        generaListaPazienti();
        generateTail();

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
