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

    public interface SomministrazioneBuilder {

        Somministrazione build();

        SomministrazioneBuilder setNomeFarmaco(String nomeFarmaco);

        SomministrazioneBuilder setDataSomministrazione(Date dataSomministrazione);

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
            somministrazione.setNomeFarmaco(somministrazioneTmp.getNomeFarmaco());
            somministrazione.setDataSomministrazione(somministrazioneTmp.getDataSomministrazione());
            somministrazione.setDoseSomministrata(somministrazioneTmp.getDoseSomministrata());
            somministrazione.setNote(somministrazioneTmp.getNote());
            return somministrazione;
        }

        @Override
        public SomministrazioneBuilder setNomeFarmaco(String nomeFarmaco) {
            somministrazioneTmp.setNomeFarmaco(nomeFarmaco);
            return this;
        }

        @Override
        public SomministrazioneBuilder setDataSomministrazione(Date dataSomministrazione) {
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

}
