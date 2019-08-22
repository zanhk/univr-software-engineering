package org.zank.sendhelp.data;

import org.zank.sendhelp.analisi.AnalisiManager;
import org.zank.sendhelp.utility.CSVManager;
import org.zank.sendhelp.utility.Utility;
import java.io.File;
import java.util.ArrayList;

/**
 * La cartella clinica e' il cuore pulsante della gestione dei dati. Per ogni
 * paziente in fase di ricovero viene aperta una cartella clinica, nel quale
 * sono inserite generalita' del paziente al momento del ricovero, in seguito
 * possono venire aggiunte prescrizioni di medicinali e un record delle relative
 * somministrazioni. Al termine del ricovero, il primario compila una lettera di
 * dimissioni riassuntiva di quanto avvenuto al paziente durante la permanenza e
 * chiude in tal modo la cartella clinica del paziente.
 */
public class CartellaClinica {

    private Paziente paziente;
    private ArrayList<Prescrizione> prescrizioni;
    private ArrayList<Somministrazione> somministrazioni;
    private AnalisiManager manager;

    public CartellaClinica(Paziente paziente) {
        setPaziente(paziente);
        this.prescrizioni = new ArrayList<>();
        this.somministrazioni = new ArrayList<>();
        loadPrescrizioni();
        loadSomministrazioni();
    }

    public Paziente getPaziente() {
        return this.paziente;
    }

    @Override
    public String toString() {
        return this.paziente.toString();
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public ArrayList<Prescrizione> getPrescrizioni() {
        return this.prescrizioni;
    }

    private void loadPrescrizioni() {
        String path = "resources" + File.separator + "Pazienti" + File.separator + paziente.getCodiceFiscale() + File.separator + "Prescrizioni.csv";
        CSVManager wr = new CSVManager(path, ";");
        int rows = wr.getNumberOfRows();
        for (int i = 0; i < rows; i++) {
            prescrizioni.add(Utility.string2Prescrizione(wr.getLineAt(i)));
        }
    }

    public boolean addPrescrizione(Prescrizione prescrizione) {
        if (prescrizioni.contains(prescrizione)) {
            return false;
        } else {
            prescrizioni.add(prescrizione);
            String path = "resources" + File.separator + "Pazienti" + File.separator + this.paziente.getCodiceFiscale().toString() + File.separator + "Prescrizioni.csv";
            CSVManager wr = new CSVManager(path, ";");
            wr.append(Utility.prescrizione2String(prescrizione));
            return true;
        }
    }

    public void removePrescrizione(Prescrizione prescrizione) {
        this.prescrizioni.remove(prescrizione);
    }

    public ArrayList<Somministrazione> getSomministrazioni() {
        return this.somministrazioni;
    }

    private void loadSomministrazioni() {
        String path = "resources" + File.separator + "Pazienti" + File.separator + paziente.getCodiceFiscale() + File.separator + "Somministrazioni.csv";
        CSVManager wr = new CSVManager(path, ";");
        int rows = wr.getNumberOfRows();
        for (int i = 0; i < rows; i++) {
            somministrazioni.add(Utility.string2Somministrazione(wr.getLineAt(i)));
        }
    }

    public boolean addSomministrazione(Somministrazione somministrazione) {
        if (somministrazioni.contains(somministrazione)) {
            return false;
        } else {
            somministrazioni.add(somministrazione);
            String path = "resources" + File.separator + "Pazienti" + File.separator + this.paziente.getCodiceFiscale().toString() + File.separator + "Somministrazioni.csv";
            CSVManager wr = new CSVManager(path, ";");
            wr.append(Utility.somministrazione2String(somministrazione));
            return true;
        }
    }

    public void removeSomministrazione(Somministrazione somministrazione) {
        this.somministrazioni.remove(somministrazione);
    }

    public AnalisiManager getManager() {
        return manager;
    }

    public void setManager(AnalisiManager manager) {
        this.manager = manager;
    }
}
