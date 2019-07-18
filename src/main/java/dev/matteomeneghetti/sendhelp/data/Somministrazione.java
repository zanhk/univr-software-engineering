package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class Somministrazione {

    private String nomeFarmaco;
    private Date dataSomministrazione;
    private float doseSomministrata;
    private String note;

    public Somministrazione() {

    }

    public String getNomeFarmaco() {
        return nomeFarmaco;
    }

    public void setNomeFarmaco(String nomeFarmaco) {
        this.nomeFarmaco = nomeFarmaco;
    }

    public Date getDataSomministrazione() {
        return this.dataSomministrazione;
    }

    public void setDataSomministrazione(Date dataSomministrazione) {
        this.dataSomministrazione = dataSomministrazione;
    }

    public float getDoseSomministrata() {
        return this.doseSomministrata;
    }

    public void setDoseSomministrata(float doseSomministrata) {
        this.doseSomministrata = doseSomministrata;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
