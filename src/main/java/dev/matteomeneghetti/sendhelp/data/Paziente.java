package dev.matteomeneghetti.sendhelp.data;

import java.util.Date;

public class Paziente {
    private String codiceSanitario;     //codice univoco del paziente
    private String cognome;             //cognome
    private String nome;                //nome
    private Date dataDiNascita;         //data di nascita
    private String luogoDiNascita;      //luogo di nascita
    
    private String diagnosiDiIngresso;  //diagnosi da compilare a cura del medico
    
    public Paziente() {
        
    }
    
    private String generaCodiceSanitario() {
        
        return null;
    }
}
