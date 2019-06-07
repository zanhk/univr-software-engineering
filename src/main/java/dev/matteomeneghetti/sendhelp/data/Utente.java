package dev.matteomeneghetti.sendhelp.data;

/*
L'utente si identifica con colui che sta al momento utilizzando il sistema.
E' appropriato che venga autenticato per accedervi, in modo da garantire che
ogni utente possa accedere solo ai servizi a lui consoni.
*/

public class Utente {
    
    private static enum RUOLO {INF, MED, PRM};
    private String nome;
    private String cognome;
    private String ID;
    private String password;    //oh no
    private RUOLO ruolo;

    public Utente(String nome, String cognome, String ID, String password, RUOLO ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.ID = ID;
        this.password = password;
        this.ruolo = ruolo;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RUOLO getRuolo() {
        return ruolo;
    }

    public void setRuolo(RUOLO ruolo) {
        this.ruolo = ruolo;
    }
    
    
}
