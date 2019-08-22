package dev.matteomeneghetti.sendhelp.data;

import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import java.io.File;
import java.util.Date;

/*
    La classe Paziente rappresenta un sunto delle generalita' del paziente ricoverato.
    In fase di ricovero, il personale infermieristico si impegna a compilarle.
    Solamente il medico puo' compilare la diagnosi d'ingresso
 */
public class Paziente {

    private CodiceFiscale codiceFiscale;
    private String codiceSanitario;
    private String cognome;
    private String nome;
    private char genere;
    private Date dataDiNascita;
    private Date dataDiRicovero;
    private String luogoDiNascita;
    private String status;

    private String diagnosiDiIngresso;  //diagnosi da compilare a cura del medico

    @Override
    public String toString() {
        return getCodiceFiscale().toString();
    }

    public Paziente() {
        setStatus("OK");
        setCodiceSanitario(generaCodiceSanitario());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }    

    public CodiceFiscale getCodiceFiscale() {
        return codiceFiscale;
    }

    public void generaCodiceFiscale() {
        this.codiceFiscale = new CodiceFiscale(cognome, nome, dataDiNascita, genere, luogoDiNascita);
    }

    public String getCodiceSanitario() {
        return codiceSanitario;
    }

    public void setCodiceSanitario(String codiceSanitario) {
        this.codiceSanitario = codiceSanitario;
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

    public Date getDataDiRicovero() {
        return dataDiRicovero;
    }

    public void setDataDiRicovero(Date dataDiRicovero) {
        this.dataDiRicovero = dataDiRicovero;
    }

    public String getLuogoDiNascita() {
        return luogoDiNascita;
    }

    public void setLuogoDiNascita(String luogoDiNascita) {
        String iniziale = "" + luogoDiNascita.substring(0, 1);
        String inizialeMaiuscola = iniziale.toUpperCase();
        this.luogoDiNascita = inizialeMaiuscola + luogoDiNascita.substring(1);
    }

    public String getDiagnosiDiIngresso() {
        return diagnosiDiIngresso;
    }

    public void setDiagnosiDiIngresso(String diagnosiDiIngresso) {
        this.diagnosiDiIngresso = diagnosiDiIngresso;
    }

    public String generaCodiceSanitario() {
        CSVManager reader = new CSVManager("resources" + File.separator + "lista-pazienti.csv", ";");
        int numeroRighe = reader.getNumberOfRows() + 1;
        String codice = Integer.toString(numeroRighe);
        while (codice.length() < 6) {
            codice = "0" + codice;
        }
        return codice;
    }
}
