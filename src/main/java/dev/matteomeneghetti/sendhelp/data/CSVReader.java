package dev.matteomeneghetti.sendhelp.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    
    String csvFile;

    public CSVReader(String path) {
        csvFile = path;
        
    }
    
    public String[] find(String key) {
        String line = "";
        String cvsSplitBy = ";";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] comune = line.split(cvsSplitBy);
                if (comune[0].equals(key))
                    return comune;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}