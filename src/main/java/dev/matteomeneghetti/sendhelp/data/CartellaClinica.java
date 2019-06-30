package dev.matteomeneghetti.sendhelp.data;

import java.util.TreeSet;
/** 
 *La cartella clinica e' il cuore pulsante della gestione dei dati.
 *Per ogni paziente in fase di ricovero viene aperta una cartella clinica,
 *nel quale sono inserite generalita' del paziente al momento del ricovero, 
 *in seguito possono venire aggiunte prescrizioni di medicinali 
 *e un record delle relative somministrazioni.
 *Al termine del ricovero, il primario compila una lettera di dimissioni 
 *riassuntiva di quanto avvenuto al paziente durante la permanenza e chiude in tal
 *modo la cartella clinica del paziente.
 */
public class CartellaClinica {
    
    private Paziente paziente;
    private TreeSet<Prescrizione> prescrizioni;
    private TreeSet<Somministrazione> somministrazioni;
    
    /**
     *Costruttore per la classe Cartella Clinica
     *@param paziente Necessario per costruire la cartella clinica
     *@see Paziente
     */
     
    public CartellaClinica(Paziente paziente) {
        setPaziente(paziente);
        this.prescrizioni = new TreeSet<Prescrizione>();
        this.somministrazioni = new TreeSet<Somministrazione>();
    }

    /** 
     * 
     *Ritorna il paziente relativo a questa cartella clinica
     *@return un oggetto di tipo paziente
     *@see Paziente
     *
     */

    public Paziente getPaziente() {
        return this.paziente;
    }

    @Override
    public String toString() {
        return this.paziente.toString();
    }

    /** 
     * 
     *Modifica il paziente per questa cartella clinica
     *@param paziente Un oggetto di tipo paziente 
     *@see Paziente
     *
     */

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

     /** 
     * 
     *Ritorna un TreeSet con le prescrizioni
     *@return tutte le prescrizioni di questa cartella clinica
     *@see Prescrizione
     *
     */
    
    public TreeSet<Prescrizione> getPrescrizioni() {
        return this.prescrizioni;
    }    

     /** 
     * 
     *Aggiunge una prescrizione al TreeSet prescrizioni e
     *ritorna un bool se è avvenuta correttamente
     *@param prescrizione La prescrizione da aggiungere
     *@return Un bool, TRUE se avvenuta, FALSE in caso contrario
     *@see Prescrizione
     *
     */

    public boolean addPrescrizione(Prescrizione prescrizione) {
        return this.prescrizioni.add(prescrizione);
    }

     /** 
     * 
     *Rimuove una prescrizione al TreeSet prescrizioni e
     *ritorna un bool se è avvenuta correttamente
     *@param prescrizione La prescrizione da togliere
     *@return Un bool, TRUE se avvenuta, FALSE in caso contrario
     *@see Prescrizione
     *
     */

    public boolean removePrescrizione(Prescrizione prescrizione) {
        return this.prescrizioni.remove(prescrizione);
    }    

    /** 
     * 
     *Ritorna un TreeSet con le somministrazioni
     *@return tutte le somministrazioni di questa cartella clinica
     *@see Somministrazione
     *
     */
    
    public TreeSet<Somministrazione> getSomministrazioni() {
        return this.somministrazioni;
    }

    /** 
     * 
     *Aggiunge una somministrazione al TreeSet somministrazioni e
     *ritorna un bool se è avvenuta correttamente
     *@param somministrazione La somministrazione da aggiungere
     *@return Un bool, TRUE se avvenuta, FALSE in caso contrario
     *@see Somministrazione
     *
     */

    public boolean addSomministrazione(Somministrazione somministrazione) {
        return this.somministrazioni.add(somministrazione);
    }

    /** 
     * 
     *Rimuove una somministrazione al TreeSet somministrazioni e
     *ritorna un bool se è avvenuta correttamente
     *@param somministrazione La somministrazione da togliere
     *@return Un bool, TRUE se avvenuta, FALSE in caso contrario
     *@see Somministrazione
     *
     */

    public boolean removeSomministrazione(Somministrazione somministrazione) {
        return this.somministrazioni.remove(somministrazione);
    }    
    
}
