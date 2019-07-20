package dev.matteomeneghetti.sendhelp.analisi;

import java.util.Random;

public class TEMPMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(10)+30;
    }

    @Override
    public Integer getValore() {
        return value;
    }
}
