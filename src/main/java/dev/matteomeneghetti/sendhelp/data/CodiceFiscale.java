package org.zank.sendhelp.data;

import org.zank.sendhelp.utility.CSVManager;
import java.io.File;
import java.util.Date;
import java.util.Set;

/**
 * 
 * Genera il codice fiscale del paziente
 * @see Paziente
 * @see <a href="https://www.gazzettaufficiale.it/eli/id/1987/12/31/087U0539/sg">Gazzetta ufficiale n.345 29-12-1976</a>
 * 
 */

public class CodiceFiscale {
    
    private static final Set<Character> VOCALI = Set.of('A', 'E', 'I', 'O', 'U');
    private static enum MESI {A, B, C, D, E, H, L, M, P, R, S, T};
    
    private String codice;
    private final String cognome;
    private final String nome;
    private final Date dataDiNascita;
    private final char sesso;
    private final String luogoDiNascita;
    
    /**
     * 
     * Costruttore della classe
     * @param cognome Stringa
     * @param nome Stringa
     * @param dataDiNascita Date
     * @param sesso Attenzione inserire "m","M","f","F" altri casi non gestiti
     * @param luogoDiNascita Stringa
     * 
     */
    
    public CodiceFiscale(String cognome, String nome, Date dataDiNascita, char sesso, String luogoDiNascita) {
        this.cognome = cognome.replaceAll("\\s+", "");
        this.nome = nome.replaceAll("\\s+", "");
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.luogoDiNascita = luogoDiNascita;
        
        codice = "";
        if(!this.cognome.isEmpty())
            codice+=generaCognome();
        if(!this.nome.isEmpty())
            codice+=generaNome();
        if(this.dataDiNascita!=null)
            codice+=generaData();
        if(!this.luogoDiNascita.isEmpty())
            codice+=generaComune();
        if((this.cognome!=null)&&(this.nome!=null)&&(this.dataDiNascita!=null)&&(this.luogoDiNascita!=null))
        codice+=generaCIN();
    }
    
    /**
     * 
     * Funzione di supporto che analizza se una lettera è una vocale
     * @param myChar lettera da anilizzare
     * @return TRUE se è una vocale, FALSE se non lo è
     * 
     */
    private static boolean isVocale(char myChar) {
        return VOCALI.contains(Character.toUpperCase(myChar));
    }
    
    /**
     * Funzione di supporto per determinare se il paziente è uomo o donna
     * @return TRUE se è donna, falso altrimenti
     */
    
    private boolean isFemale() {
        return (this.sesso=='f' || this.sesso=='F');
    }
    
    /**
     * Genera dal cognome le lettere necessarie per il codfiscale
     * @return Una stringa di lunghezza 3
     * 
     */
    
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
    
    /**
     * Genera dal nome le lettere necessarie per il codfiscale
     * @return Una stringa di lunghezza 3
     * 
     */
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
    
    /**
     * Genera dalla data i caratteri necessari per il codfiscale
     * @return Una stringa
     * 
     */
    private String generaData() {
        String anno = ""+dataDiNascita.getYear();
        String mese = ""+MESI.values()[dataDiNascita.getMonth()];
        String giorno = ""+(isFemale()? dataDiNascita.getDate()+40 : dataDiNascita.getDate());
        if(giorno.length()<2)
            giorno = "0" + giorno;
        return anno+mese+giorno;
    }
    
    /**
     * Confronta il comune con il file del database catastale e torna il codice catastale
     * @return Una stringa lunga 4
     * 
     */
    
    private String generaComune() {
        CSVManager csvreader = new CSVManager("resources" + File.separator + "lista-comuni.csv", ";");
        String[] codiceComune = csvreader.find(this.luogoDiNascita);
        if(codiceComune!=null)
        return codiceComune[1];
        else return "";
    }
    
    /**
     * Genera il carattere di controllo
     * @return Un char di controllo
     * 
     */
    
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
        CSVManager csvreader = new CSVManager("resources" + File.separator + "tabella-dispari.csv", ";");
        int sommaDispari = 0;
        for(int i = 0; i < dispari.length(); i++) {
            sommaDispari+=Integer.parseInt(csvreader.find(dispari.substring(i, i+1))[1]);
        }
        int sommaPari = 0;
        csvreader = new CSVManager("resources" + File.separator + "tabella-pari.csv", ";");
        for(int i = 0; i < pari.length(); i++) {
            sommaPari+=Integer.parseInt(csvreader.find(pari.substring(i, i+1))[1]);
        }
        int somma = sommaPari + sommaDispari;
        int resto = somma%26;
        return (char) (resto+65);
    }
    
    @Override
    public String toString() {
        return this.codice;
    }
}
