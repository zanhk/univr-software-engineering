/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.gui.MainWindow;
import static dev.matteomeneghetti.sendhelp.utility.Utility.date2String;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefano
 */
public class Analisi extends TimerTask{
     Battito b;
    PressSBP ps;
    PressDBP dp;
    Temperatura temp;
    String paziente;
    
    /*
    public Battito getB() {
        return b;
    }

    public void setB(Battito b) {
        this.b = b;
    }

    public PressSBP getPs() {
        return ps;
    }

    public void setPs(PressSBP ps) {
        this.ps = ps;
    }

    public PressDBP getDp() {
        return dp;
    }

    public void setDp(PressDBP dp) {
        this.dp = dp;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    public String getPaziente() {
        return paziente;
    }

    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }
    */
    public Analisi(String paziente) throws IOException{
        this.paziente = paziente;
        String pathToFile = "resources" + File.separator + "Pazienti" + File.separator + paziente + ".csv";
        CSVManager wr = new CSVManager(pathToFile, ";" );
        List<String> lines = Files.readAllLines(Path.of(pathToFile));
        b = new Battito(wr, lines, Path.of(pathToFile));
        ps = new PressSBP(wr, lines, Path.of(pathToFile));
        dp = new PressDBP(wr, lines, Path.of(pathToFile));
        temp = new Temperatura(wr, lines, Path.of(pathToFile));
        
        
        
        
        
        Timer timer = new Timer();
        timer.schedule(b, 0, 10000);
        timer.schedule(ps, 0, 12000);
        timer.schedule(dp, 0, 15000);
        timer.schedule(temp, 0, 17000);
    }
    public void print(String something){
       // String linea 
    }
    @Override
    public void run(){
        System.out.println("Ciao ne è passato di tempo");
    }
    
    private class Battito extends TimerTask{
        Random rand = new Random();
        CSVManager wr;
        int position = 2;
        String key = "BPM";
        List<String> lines;
        Path path;
        public Battito(CSVManager wr, List<String> lines, Path path){
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        
        @Override
        public void run(){
            Integer battito = ( rand.nextInt(30) + 60 );
            System.out.println("Battito:" + battito);
            String[] riga = wr.find(key);
            String linea="";
            for(int i = 0; i < riga.length; i++){
                linea+=riga[i]+";";
            }
            Observerer.putOnTable(battito.toString(), 1, 1);
            linea+=battito.toString();
            lines.remove(position);
            lines.add(position, linea);
            try {
                Files.write(path, lines);
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class PressSBP extends TimerTask{
        CSVManager wr;
        int position = 0;
        String key = "SBP";
        List<String> lines;
        Path path;
        Random rand = new Random();
        
        public PressSBP(CSVManager wr, List<String> lines, Path path){
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        
        @Override
        public void run(){
            Integer pressione = rand.nextInt(39+30);
            String[] riga = wr.find(key);
            String linea="";
            for(int i = 0; i < riga.length; i++){
                linea+=riga[i]+";";
            }
            linea+=pressione.toString();
            lines.remove(position);
            lines.add(position, linea);
            try {
                Files.write(path, lines);
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private class PressDBP extends TimerTask{
        CSVManager wr;
        int position = 1;
        String key = "DBP";
        List<String> lines;
        Path path;
        Random rand = new Random();
        public PressDBP(CSVManager wr, List<String> lines, Path path){
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        
        @Override
        public void run(){
             Integer pressione = rand.nextInt(39+30);
            String[] riga = wr.find(key);
            String linea="";
            for(int i = 0; i < riga.length; i++){
                linea+=riga[i]+";";
            }
            linea+=pressione.toString();
            lines.remove(position);
            lines.add(position, linea);
            try {
                Files.write(path, lines);
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     private class Temperatura extends TimerTask{
         CSVManager wr;
         List<String> lines;
         String key = "TEMP";
         int position = 3;
         Path path;
         Random rand = new Random();
         
        public Temperatura(CSVManager wr, List<String> lines, Path path){
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        @Override
        public void run(){
           Integer temperatura = rand.nextInt(39+30);
            String[] riga = wr.find(key);
            String linea="";
            for(int i = 0; i < riga.length; i++){
                linea+=riga[i]+";";
            }
            linea+=temperatura.toString();
            lines.remove(position);
            lines.add(position, linea);
            try {
                Files.write(path, lines);
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}