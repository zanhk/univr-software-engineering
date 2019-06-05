package dev.matteomeneghetti.sendhelp.data;

import java.util.GregorianCalendar;

public class Somministrazione {
    
    public interface SomministrazioneBuilder {
        Somministrazione build();
        SomministrazioneBuilder setDataSomministrazione(GregorianCalendar dataSomministrazione);
        SomministrazioneBuilder setDoseSomministrata(float doseSomministrata);
        SomministrazioneBuilder setNote(String note);
    }
    
    public static class SomministrazioneBuilderImpl implements SomministrazioneBuilder {
        
        private Somministrazione somministrazioneTmp;
        
        public SomministrazioneBuilderImpl() {
            somministrazioneTmp = new Somministrazione();
        }

        @Override
        public Somministrazione build() {
            Somministrazione somministrazione = new Somministrazione();
            somministrazione.setDataSomministrazione(somministrazioneTmp.getDataSomministrazione());
            somministrazione.setDoseSomministrata(somministrazioneTmp.getDoseSomministrata());
            somministrazione.setNote(somministrazioneTmp.getNote());
            return somministrazione;
        }

        @Override
        public SomministrazioneBuilder setDataSomministrazione(GregorianCalendar dataSomministrazione) {
            somministrazioneTmp.setDataSomministrazione(dataSomministrazione);
            return this;
        }

        @Override
        public SomministrazioneBuilder setDoseSomministrata(float doseSomministrata) {
            somministrazioneTmp.setDoseSomministrata(doseSomministrata);
            return this;
        }

        @Override
        public SomministrazioneBuilder setNote(String note) {
            somministrazioneTmp.setNote(note);
            return this;
        }
        
    }
    private GregorianCalendar dataSomministrazione;
    private float doseSomministrata;
    private String note;
    
    public Somministrazione() {
        
    }
    
    public GregorianCalendar getDataSomministrazione() {
        return this.dataSomministrazione;
    }
    public void setDataSomministrazione(GregorianCalendar dataSomministrazione) {
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
