package org.zank.icu.analisi;

import java.util.Random;

public class TEMPMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(5)+34;
    }

    @Override
    public Integer getValore() {
        return value;
    }
}
