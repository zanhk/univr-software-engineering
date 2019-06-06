package dev.matteomeneghetti.sendhelp.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    Classe che permette la gestione di file CSV
*/

public class CSVManager {
    
    String pathToFile;

    public CSVManager(String path) {
        pathToFile = path;        
    }
    
    public String[] find(String key) {
        String line;
        String cvsSplitBy = ";";
        
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            while ((line = br.readLine()) != null) {
                String[] comune = line.split(cvsSplitBy);
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
    
    public void append(String linea) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathToFile, true))) {
            wr.write(linea);
            wr.newLine();
            wr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public int getNumberOfRows() {
        String line;
        String cvsSplitBy = ";";
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