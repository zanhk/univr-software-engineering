package dev.matteomeneghetti.sendhelp.data;

import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.Utility;
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

    public CartellaClinica(Paziente paziente) {
        setPaziente(paziente);
        this.prescrizioni = new ArrayList<Prescrizione>();
        this.somministrazioni = new ArrayList<Somministrazione>();
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
}
