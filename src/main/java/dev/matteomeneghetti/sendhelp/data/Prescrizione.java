package dev.matteomeneghetti.sendhelp.data;

import java.util.GregorianCalendar;

public class Prescrizione {
    
    public interface PrescrizioneBuilder {
        Prescrizione build();
        PrescrizioneBuilder setNomeFarmaco(final String nomeFarmaco);
        PrescrizioneBuilder setDataPrescrizione(final GregorianCalendar dataPrescrizione);
        PrescrizioneBuilder setDataFineTerapia(final GregorianCalendar dataFineTerapia);
        PrescrizioneBuilder setNumeroDosiGiornaliere(final int numeroDosiGiornaliere);
        PrescrizioneBuilder setQuantitaDose(final float quantitaDose);
        PrescrizioneBuilder setMedico(final String medico);
    }
    
    public static class PrescrizioneBuilderImpl implements PrescrizioneBuilder {
        private Prescrizione prescrizioneTmp;
        
        public PrescrizioneBuilderImpl(){
            prescrizioneTmp = new Prescrizione();
        }
        
        @Override
        public Prescrizione build() {
            Prescrizione prescrizione = new Prescrizione();
            return prescrizione;
        }

        @Override
        public PrescrizioneBuilder setNomeFarmaco(String nomeFarmaco) {
            prescrizioneTmp.setNomeFarmaco(nomeFarmaco);
            return this;
        }

        @Override
        public PrescrizioneBuilder setDataPrescrizione(GregorianCalendar dataPrescrizione) {
            prescrizioneTmp.setDataPrescrizione(dataPrescrizione);
            return this;
        }

        @Override
        public PrescrizioneBuilder setDataFineTerapia(GregorianCalendar dataFineTerapia) {
            prescrizioneTmp.setDataFineTerapia(dataFineTerapia);
            return this;
        }

        @Override
        public PrescrizioneBuilder setNumeroDosiGiornaliere(int numeroDosiGiornaliere) {
            prescrizioneTmp.setNumeroDosiGiornaliere(numeroDosiGiornaliere);
            return this;
        }

        @Override
        public PrescrizioneBuilder setQuantitaDose(float quantitaDose) {
            prescrizioneTmp.setQuantitaDose(quantitaDose);
            return this;
        }

        @Override
        public PrescrizioneBuilder setMedico(String medico) {
            prescrizioneTmp.setMedico(medico);
            return this;
        }
    }
    
    private String nomeFarmaco;
    private GregorianCalendar dataPrescrizione;
    private GregorianCalendar dataFineTerapia;
    private int numeroDosiGiornaliere;
    private float quantitaDose;
    private String medico;
    
    public Prescrizione() {
        
    }
    
    public String getNomeFarmaco() {
        return this.nomeFarmaco;
    }
    public void setNomeFarmaco(String nomeFarmaco) {
        this.nomeFarmaco = nomeFarmaco;
    }
    
    public GregorianCalendar getDataPrescrizione() {
        return this.dataPrescrizione;
    }
    public void setDataPrescrizione(GregorianCalendar dataPrescrizione) {
        this.dataPrescrizione = dataPrescrizione;
    }
    
    public GregorianCalendar getDataFineTerapia() {
        return this.dataFineTerapia;
    }
    public void setDataFineTerapia(GregorianCalendar dataFineTerapia) {
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
