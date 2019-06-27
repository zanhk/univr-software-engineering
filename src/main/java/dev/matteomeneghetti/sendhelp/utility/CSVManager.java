package dev.matteomeneghetti.sendhelp.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  Classe che permette la gestione di file CSV
 */

public class CSVManager {
    
    String pathToFile;
    String csvSplitBy;

    public CSVManager(String path, String splitBy) {
        pathToFile = path;   
        csvSplitBy = splitBy;
    }
    
    public void setPathToFile(String path){
        this.pathToFile=path;
    }
    /**
     *  Data una chiave, restituisce un array composto da ogni elemento della riga corrispondente
     */
    public String[] find(String key) {
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            while ((line = br.readLine()) != null) {
                String[] comune = line.split(csvSplitBy);
                if (comune[0].equals(key)){
                    br.close();
                    return comune;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    public boolean exist(String key){
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            while ((line = br.readLine()) != null) {
                 String[] comune = line.split(csvSplitBy);
                 for(int i =0; i< comune.length; i++){
                    if (comune[i].equals(key)) {
                        return true;
                    }
                 }
            }
            br.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    /**
     *  Appende una linea al file
     */
    public void append(String linea) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathToFile, true))) {
            wr.write(linea);
            wr.newLine();
            wr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    /**
     *  Restituisce il numero di righe del file
     */
    public int getNumberOfRows() {
        String line;
        int numberOfRows = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            while ((line = br.readLine()) != null) {
                numberOfRows++;
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return numberOfRows;
    }
}