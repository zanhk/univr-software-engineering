package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class Prescrizione {

    private String nomeFarmaco;
    private Date dataPrescrizione;
    private Date dataFineTerapia;
    private int numeroDosiGiornaliere;
    private float quantitaDose;
    private String medico;

    public Prescrizione() {

    }

    @Override
    public String toString() {
        return nomeFarmaco + " " + quantitaDose;
    }

    public String getNomeFarmaco() {
        return this.nomeFarmaco;
    }

    public void setNomeFarmaco(String nomeFarmaco) {
        this.nomeFarmaco = nomeFarmaco;
    }

    public Date getDataPrescrizione() {
        return this.dataPrescrizione;
    }

    public void setDataPrescrizione(Date dataPrescrizione) {
        this.dataPrescrizione = dataPrescrizione;
    }

    public Date getDataFineTerapia() {
        return this.dataFineTerapia;
    }

    public void setDataFineTerapia(Date dataFineTerapia) {
        this.dataFineTerapia = dataFineTerapia;
    }

    public int getNumeroDosiGiornaliere() {
        return this.numeroDosiGiornaliere;
    }

    public void setNumeroDosiGiornaliere(int numeroDosiGiornaliere) {
        this.numeroDosiGiornaliere = numeroDosiGiornaliere;
    }

    public float getQuantitaDose() {
        return this.quantitaDose;
    }

    public void setQuantitaDose(float quantitaDose) {
        this.quantitaDose = quantitaDose;
    }

    public String getMedico() {
        return this.medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
