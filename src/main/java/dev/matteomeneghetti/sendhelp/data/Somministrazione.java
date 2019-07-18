package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class Somministrazione {
    
    private Date dataSomministrazione;
    private float doseSomministrata;
    private String note;
    
    public Somministrazione() {
        
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
