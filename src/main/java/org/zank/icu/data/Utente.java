package org.zank.icu.data;

/*
    L'utente si identifica con colui che sta al momento utilizzando il sistema.
    E' appropriato che venga autenticato per accedervi, in modo da garantire che
    ogni utente possa accedere solo ai servizi a lui consoni.

    Il personale infermieristico e' tenuto a inserire i principali dati anagrafici
    del paziente al momento del ricovero e inserire i dati relativi
    alle somministrazioni.

    Il medico ha il compito di scrivere una diagnosi d'ingresso e compilare i dati delle
    prescrizioni.

    Entrambi possono visualizare i dati di tutti i pazienti ricoverati e il loro monitoraggio
    nelle due ore precedenti alla consultazione e le somministrazioni degli ultimi
    due giorni.
    
    Il primario puo' salvare e stampare un report riassuntivo della situazione di tutti
    i pazienti ricoverati per ogni settimana.
    Al termine del ricovero, inoltre, chiude la cartella clinica con una lettera di dimissioni.
*/

public class Utente {
    
    public static enum RUOLO {INF, MED, PRM};  //Infermiere, Medico, Primario
    private String nome;
    private String cognome;
    private String id;
    private String password;    //oh no
    private RUOLO ruolo;

    public Utente() {
        
    }
    
    public Utente(String nome, String cognome, String id, String password, RUOLO ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
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

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
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
