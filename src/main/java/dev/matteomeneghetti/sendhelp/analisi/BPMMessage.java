package dev.matteomeneghetti.sendhelp.analisi;

import java.util.Random;

public class BPMMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(30) + 60;
    }

    @Override
    public Integer getValore() {
        return value;
    }
    
}
