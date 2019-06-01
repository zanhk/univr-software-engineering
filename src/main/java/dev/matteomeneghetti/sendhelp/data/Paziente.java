package dev.matteomeneghetti.sendhelp.data;

import java.util.GregorianCalendar;

/*
La classe Paziente rappresenta un sunto delle generalita' del paziente ricoverato.
In fase di ricovero, il personale infermieristico si impegna a compilarle.
*/
public class Paziente {
    private CodiceFiscale codiceSanitario;     //codice univoco del paziente
    private final String cognome;             //cognome
    private final String nome;                //nome
    private final char genere;
    private final GregorianCalendar dataDiNascita;         //data di nascita
    private final String luogoDiNascita;      //luogo di nascita
    
    private String diagnosiDiIngresso;  //diagnosi da compilare a cura del medico
    
    public Paziente(String cognome, String nome, GregorianCalendar dataDiNascita, char sesso, String luogoDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
        this.genere = sesso;
        this.luogoDiNascita = luogoDiNascita;
        generaCodiceSanitario();
    }
    
    @Override
    public String toString() {
        return this.nome + " " + this.cognome;
    }
    
    // a cura del medico
    public void setDiagnosi(String diagnosi) {
        this.diagnosiDiIngresso = diagnosi;
    }
    
    private void generaCodiceSanitario() {
        codiceSanitario = new CodiceFiscale(cognome, nome, dataDiNascita, genere, luogoDiNascita);
    }
}
