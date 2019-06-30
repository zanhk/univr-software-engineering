package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.gui.MainWindow;
import java.io.File;
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

    public Analisi(String paziente, MainWindow main) throws IOException{
        this.paziente = paziente;
        String pathToFile = "resources" + File.separator + "Pazienti" + File.separator + paziente + File.separator + "Analisi.csv";
        CSVManager wr = new CSVManager(pathToFile, ";" );
        List<String> lines = Files.readAllLines(Path.of(pathToFile));
        b = new Battito(wr, lines, Path.of(pathToFile), main);
        ps = new PressSBP(wr, lines, Path.of(pathToFile), main);
        dp = new PressDBP(wr, lines, Path.of(pathToFile), main);
        temp = new Temperatura(wr, lines, Path.of(pathToFile), main);       
        
        Timer timer = new Timer();
        timer.schedule(b, 0, 3000);
        timer.schedule(ps, 0, 1200);
        timer.schedule(dp, 0, 1200);
        timer.schedule(temp, 0, 1800);
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
        int position = 3;
        String key = "BPM";
        List<String> lines;
        Path path;
        MainWindow main;
        public Battito(CSVManager wr, List<String> lines, Path path, MainWindow main){
            this.main=main;
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
            //Observerer.putOnTable(battito.toString(), 1, 1);
            linea+=battito.toString();
            lines.remove(position);
            lines.add(position, linea);
            try {
                Files.write(path, lines);
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
           main.updateAnalisi(path.toString(),position,key);
        }
    }
     private class PressSBP extends TimerTask{
        CSVManager wr;
        int position = 1;
        String key = "SBP";
        List<String> lines;
        Path path;
        Random rand = new Random();
        MainWindow main;
        
        public PressSBP(CSVManager wr, List<String> lines, Path path, MainWindow main){
            this.main=main;
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        
        @Override
        public void run(){
            Integer pressione = rand.nextInt(40)+80;
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
            main.updateAnalisi(path.toString(),position,key);
        }
    }
    private class PressDBP extends TimerTask{
        CSVManager wr;
        int position = 2;
        String key = "DBP";
        List<String> lines;
        Path path;
        Random rand = new Random();
        MainWindow main;
        public PressDBP(CSVManager wr, List<String> lines, Path path, MainWindow main){
            this.main=main;
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        
        @Override
        public void run(){
            Integer pressione = rand.nextInt(10)+70;
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
           main.updateAnalisi(path.toString(),position,key);
        }
    }
     private class Temperatura extends TimerTask{
         CSVManager wr;
         List<String> lines;
         String key = "TEMP";
         int position = 4;
         Path path;
         Random rand = new Random();
         MainWindow main;
         
        public Temperatura(CSVManager wr, List<String> lines, Path path, MainWindow main){
            this.main=main;
            this.wr = wr;
            this.lines = lines;
            this.path = path;
        }
        @Override
        public void run(){
           Integer temperatura = rand.nextInt(39)+30;
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
            main.updateAnalisi(path.toString(),position,key);
        }
        
    }
}