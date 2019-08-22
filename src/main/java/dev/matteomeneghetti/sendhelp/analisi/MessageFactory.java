package org.zank.sendhelp.analisi;

public class MessageFactory {
    
    public Message getMessage(String tipo) {
        if (tipo == null)
            return null;
        if (tipo.equalsIgnoreCase("SBP"))
            return new SBPMessage();
        else if (tipo.equalsIgnoreCase("DBP"))
            return new DBPMessage();
        else if (tipo.equalsIgnoreCase("BPM"))
            return new BPMMessage();
        else if (tipo.equalsIgnoreCase("TEMP"))
            return new TEMPMessage();
        
        return null;
    }
}
