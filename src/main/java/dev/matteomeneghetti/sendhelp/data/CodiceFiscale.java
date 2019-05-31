package dev.matteomeneghetti.sendhelp.data;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

public class CodiceFiscale {
    
    private static final Set<Character> VOCALI = Set.of('A', 'E', 'I', 'O', 'U');
    private static enum MESI {A, B, C, D, E, H, L, M, P, R, S, T};
    
    private String codice;
    private final String cognome;
    private final String nome;
    private final GregorianCalendar dataDiNascita;
    private final char sesso;
    private final String luogoDiNascita;
    
    public CodiceFiscale(String cognome, String nome, GregorianCalendar dataDiNascita, char sesso, String luogoDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.luogoDiNascita = luogoDiNascita;
        
        codice = "";
        codice+=generaCognome();
        codice+=generaNome();
        codice+=generaData();
        codice+=generaComune();
        codice+=generaCIN();
    }
    
    @Override
    public String toString() {
        return this.codice;
    }
    
    private static boolean isVocale(char myChar) {
        return VOCALI.contains(Character.toUpperCase(myChar));
    }
    private boolean isFemale() {
        return (this.sesso=='f' || this.sesso=='F');
    }
    
    private String generaCognome() {
        char[] cognomeArray = this.cognome.toCharArray();
        String siglaCognome = "";
        for(int i = 0; i < cognomeArray.length && siglaCognome.length() < 3; i++) {
            if(!isVocale(cognomeArray[i]))
                siglaCognome+=Character.toUpperCase(cognomeArray[i]);
        }
        if(siglaCognome.length() == 3)
            return siglaCognome;
        for(int i = 0; i < cognomeArray.length && siglaCognome.length() < 3; i++) {
            if(isVocale(cognomeArray[i]))
                siglaCognome+=Character.toUpperCase(cognomeArray[i]);
        }
        if (siglaCognome.length() == 3)
            return siglaCognome;
        while(siglaCognome.length() < 3)
            siglaCognome+='X';        
        return siglaCognome;
    }
    
    private String generaNome() {
        char[] nomeArray = this.nome.toCharArray();
        int numeroConsonanti = 0;
        for(var letteraCorrente : nomeArray) {
            if(!isVocale(letteraCorrente))
                numeroConsonanti++;
        }
        String siglaNome = "";
        boolean skip;
        if(numeroConsonanti >= 4) {
            // prima, terza, quarta consonante
            skip = true;       
        }
        else {
            //prima, seconda, terza consonante
            skip = false;
        }
        for(int i = 0; i < nomeArray.length && siglaNome.length() < 3; i++) {
            if(!isVocale(nomeArray[i])) {
                siglaNome+=Character.toUpperCase(nomeArray[i]);
                if(siglaNome.length() == 2 && skip) {
                    siglaNome = siglaNome.substring(0, siglaNome.length() - 1);
                    skip = false;
                }
            }
        }     
        if (siglaNome.length() == 3)
            return siglaNome;
        for(int i = 0; i < nomeArray.length && siglaNome.length() < 3; i++) {
            if(isVocale(nomeArray[i]))
                siglaNome+=Character.toUpperCase(nomeArray[i]);
        }
        if (siglaNome.length() == 3)
            return siglaNome;
        while(siglaNome.length() < 3)
            siglaNome+='X';        
        return siglaNome;
    }
    
    private String generaData() {
        String anno = ""+dataDiNascita.get(Calendar.YEAR);
        anno = anno.substring(2, anno.length());
        String mese = ""+MESI.values()[dataDiNascita.get(Calendar.MONTH)];
        String giorno = ""+(isFemale()? dataDiNascita.get(Calendar.DATE)+40 : dataDiNascita.get(Calendar.DATE));
        if(giorno.length()<2)
            giorno = "0" + giorno;
        return anno+mese+giorno;
    }
    
    private String generaComune() {
        CSVReader csvreader = new CSVReader("resources" + File.separator + "lista-comuni.csv");
        String[] codiceComune = csvreader.find(this.luogoDiNascita);
        return codiceComune[1];
    }
    
    private char generaCIN() {
        String dispari = "";
        String pari = "";
        for(int i = 0; i < this.codice.length(); i++) {
            if(i%2 == 0) {
                //dispari
                dispari+= this.codice.charAt(i);
            }
            else {
                //pari
                pari+= this.codice.charAt(i);
            }
        }
        CSVReader csvreader = new CSVReader("resources" + File.separator + "tabella-dispari.csv");
        int sommaDispari = 0;
        for(int i = 0; i < dispari.length(); i++) {
            sommaDispari+=Integer.parseInt(csvreader.find(dispari.substring(i, i+1))[1]);
        }
        int sommaPari = 0;
        csvreader = new CSVReader("resources" + File.separator + "tabella-pari.csv");
        for(int i = 0; i < pari.length(); i++) {
            sommaPari+=Integer.parseInt(csvreader.find(pari.substring(i, i+1))[1]);
        }
        int somma = sommaPari + sommaDispari;
        int resto = somma%26;
        return (char) (resto+65);
    }
}
