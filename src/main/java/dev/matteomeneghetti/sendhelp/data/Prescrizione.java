package dev.matteomeneghetti.sendhelp.data;

import java.util.GregorianCalendar;

public class Prescrizione {
    private String nomeFarmaco;
    private GregorianCalendar dataPrescrizione;
    private GregorianCalendar dataFineTerapia;
    private int numeroDosiGiornaliere;
    private int quantitaDose;
    private String medico;
    
    public Prescrizione() {
        
    }
}
