package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public interface SomministrazioneBuilder {
        Somministrazione build();
        SomministrazioneBuilder setNomeFarmaco(String nomeFarmaco);
        SomministrazioneBuilder setDataSomministrazione(Date dataSomministrazione);
        SomministrazioneBuilder setDoseSomministrata(float doseSomministrata);
        SomministrazioneBuilder setNote(String note);
    }