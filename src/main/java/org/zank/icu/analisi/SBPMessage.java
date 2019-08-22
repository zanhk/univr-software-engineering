package org.zank.icu.analisi;

import java.util.Random;

public class SBPMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(40)+80;
    }

    @Override
    public Integer getValore() {
        return value;
    }
    
}
