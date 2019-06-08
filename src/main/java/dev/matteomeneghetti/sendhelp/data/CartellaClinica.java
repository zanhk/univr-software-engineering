package dev.matteomeneghetti.sendhelp.data;

import java.util.TreeSet;
/*
    La cartella clinica e' il cuore pulsante della gestione dei dati.
    Per ogni paziente in fase di ricovero viene aperta una cartella clinica,
    nel quale sono inserite generalita' del paziente al momento del ricovero, 
    in seguito possono venire aggiunte prescrizioni di medicinali 
    e un record delle relative somministrazioni.
    Al termine del ricovero, il primario compila una lettera di dimissioni 
    riassuntiva di quanto avvenuto al paziente durante la permanenza e chiude in tal
    modo la cartella clinica del paziente.
*/
public class CartellaClinica {
    
    private Paziente paziente;
    private TreeSet<Prescrizione> prescrizioni;
    private TreeSet<Somministrazione> somministrazioni;
    
    public CartellaClinica(Paziente paziente) {
        setPaziente(paziente);
        this.prescrizioni = new TreeSet<Prescrizione>();
        this.somministrazioni = new TreeSet<Somministrazione>();
    }
    
    public Paziente getPaziente() {
        return this.paziente;
    }
    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }
    
    public TreeSet<Prescrizione> getPrescrizioni() {
        return this.prescrizioni;
    }    
    public boolean addPrescrizione(Prescrizione nuovaPrescrizione) {
        return this.prescrizioni.add(nuovaPrescrizione);
    }
    public boolean removePrescrizione(Prescrizione prescrizioneDaTogliere) {
        return this.prescrizioni.remove(prescrizioneDaTogliere);
    }    
    
    
    public TreeSet<Somministrazione> getSomministrazioni() {
        return this.somministrazioni;
    }
    public boolean addSomministrazione(Somministrazione nuovaSomministrazione) {
        return this.somministrazioni.add(nuovaSomministrazione);
    }
    public boolean removeSomministrazione(Somministrazione somministrazioneDaTogliere) {
        return this.somministrazioni.remove(somministrazioneDaTogliere);
    }    
    
}
