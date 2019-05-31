package dev.matteomeneghetti.sendhelp.data;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

public class CodiceFiscale {
    
    private static final Set<Character> VOCALI = Set.of('A', 'E', 'I', 'O', 'U');
    private static enum MESI {A, B, C, D, E, H, L, M, P, R, S, T};
    
    private String codice;
    private String cognome;
    private String nome;
    private GregorianCalendar dataDiNascita;
    private char sesso;
    private String luogoDiNascita;
    
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
        CSVReader csvreader = new CSVReader("/home/mat/NetBeansProjects/progetto-ing-sw/src/main/java/dev/matteomeneghetti/sendhelp/data/lista-comuni.csv");
        String[] codice = csvreader.find(this.luogoDiNascita);
        return codice[1];
    }
    
    private String generaCIN() {
        
        return null;
    }
    
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar(1995, 4, 5);
        CodiceFiscale myCodice = new CodiceFiscale("Meneghetti", "Matteo", now, 'M', "Trieste");
        System.out.println(myCodice.codice);
    }
}
