package org.zank.icu.analysis;

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
