package dev.matteomeneghetti.sendhelp.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    
    String pathToFile;

    public CSVReader(String path) {
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
            e.printStackTrace();
        }
        return null;
    }
}