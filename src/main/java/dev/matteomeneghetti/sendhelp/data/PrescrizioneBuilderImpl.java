package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class PrescrizioneBuilderImpl implements PrescrizioneBuilder {
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