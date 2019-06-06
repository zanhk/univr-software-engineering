package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class Prescrizione {
    
    public interface PrescrizioneBuilder {
        Prescrizione build();
        PrescrizioneBuilder setNomeFarmaco(final String nomeFarmaco);
        PrescrizioneBuilder setDataPrescrizione(final Date dataPrescrizione);
        PrescrizioneBuilder setDataFineTerapia(final Date dataFineTerapia);
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
            prescrizione.setNomeFarmaco(prescrizioneTmp.getNomeFarmaco());
            prescrizione.setDataPrescrizione(prescrizioneTmp.getDataPrescrizione());
            prescrizione.setDataFineTerapia(prescrizioneTmp.getDataFineTerapia());
            prescrizione.setNumeroDosiGiornaliere(prescrizioneTmp.getNumeroDosiGiornaliere());
            prescrizione.setQuantitaDose(prescrizioneTmp.getQuantitaDose());
            prescrizione.setMedico(prescrizioneTmp.getMedico());
            return prescrizione;
        }

        @Override
        public PrescrizioneBuilder setNomeFarmaco(String nomeFarmaco) {
            prescrizioneTmp.setNomeFarmaco(nomeFarmaco);
            return this;
        }

        @Override
        public PrescrizioneBuilder setDataPrescrizione(Date dataPrescrizione) {
            prescrizioneTmp.setDataPrescrizione(dataPrescrizione);
            return this;
        }

        @Override
        public PrescrizioneBuilder setDataFineTerapia(Date dataFineTerapia) {
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
    private Date dataPrescrizione;
    private Date dataFineTerapia;
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
