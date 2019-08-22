package org.zank.sendhelp.analisi;

import java.util.Random;

public class BPMMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(80) + 40;
    }

    @Override
    public Integer getValore() {
        return value;
    }
    
}
