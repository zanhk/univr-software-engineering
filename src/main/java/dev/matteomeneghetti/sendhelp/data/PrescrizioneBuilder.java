package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public interface PrescrizioneBuilder {
        Prescrizione build();
        PrescrizioneBuilder setNomeFarmaco(final String nomeFarmaco);
        PrescrizioneBuilder setDataPrescrizione(final Date dataPrescrizione);
        PrescrizioneBuilder setDataFineTerapia(final Date dataFineTerapia);
        PrescrizioneBuilder setNumeroDosiGiornaliere(final int numeroDosiGiornaliere);
        PrescrizioneBuilder setQuantitaDose(final float quantitaDose);
        PrescrizioneBuilder setMedico(final String medico);
    }