package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

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