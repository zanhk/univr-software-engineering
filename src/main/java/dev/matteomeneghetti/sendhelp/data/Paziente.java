package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

/*
La classe Paziente rappresenta un sunto delle generalita' del paziente ricoverato.
In fase di ricovero, il personale infermieristico si impegna a compilarle.
Solamente il medico puo' compilare la diagnosi d'ingresso
*/
public class Paziente {
    
    private CodiceFiscale codiceSanitario;     //codice univoco del paziente
    private String cognome;             //cognome
    private String nome;                //nome
    private char genere;
    private Date dataDiNascita;         //data di nascita
    private String luogoDiNascita;      //luogo di nascita
    
    private String diagnosiDiIngresso;  //diagnosi da compilare a cura del medico
    
    public Paziente() {
        
    }

    public CodiceFiscale getCodiceSanitario() {
        return codiceSanitario;
    }
    public void generaCodiceSanitario() {
        this.codiceSanitario = new CodiceFiscale(cognome, nome, dataDiNascita, genere, luogoDiNascita);
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenere() {
        return genere;
    }
    public void setGenere(char genere) {
        this.genere = genere;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getLuogoDiNascita() {
        return luogoDiNascita;
    }
    public void setLuogoDiNascita(String luogoDiNascita) {
        this.luogoDiNascita = luogoDiNascita;
    }

    public String getDiagnosiDiIngresso() {
        return diagnosiDiIngresso;
    }
    public void setDiagnosiDiIngresso(String diagnosiDiIngresso) {
        this.diagnosiDiIngresso = diagnosiDiIngresso;
    }   
}
