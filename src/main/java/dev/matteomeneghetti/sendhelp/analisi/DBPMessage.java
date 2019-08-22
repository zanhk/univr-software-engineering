package org.zank.sendhelp.analisi;

import java.util.Random;

public class DBPMessage implements Message {
    
    Integer value;

    @Override
    public void generaValore() {
        Random rand = new Random();
        value = rand.nextInt(10)+70;
    }

    @Override
    public Integer getValore() {
        return value;
    }
    
}
