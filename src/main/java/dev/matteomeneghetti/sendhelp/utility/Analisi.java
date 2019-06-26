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
    final int row;

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
    
    public Analisi(String paziente, MainWindow mainWindow, int row){
        b = new Battito();
        ps = new PressSBP();
        dp = new PressDBP();
        temp = new Temperatura();
        this.paziente = paziente;
        this.row = row;
        
        CSVManager writer = new CSVManager("resources" + File.separator + "Pazienti" + File.separator + paziente + ".csv", ";");
        Timer timer = new Timer();
        timer.schedule(b, 0, 10000);
        timer.schedule(ps, 0, 12000);
        timer.schedule(dp, 0, 15000);
        timer.schedule(temp, 0, 17000);
        //timer.schedule(NEW LINE, time);
        //OGNI TASK AGGIUNGE AL FILE, LA TASK NEW LINE SI ATTIVA OGNI TOT MINUTI E FA UNA NUOVA RIGA
       /* String linea = paziente.getCodiceSanitario()+";"
                      +paziente.getCognome()+";"
                      +paziente.getNome()+";"
                      +paziente.getLuogoDiNascita()+";"
                      +date2String(paziente.getDataDiNascita());
                      */
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
        
        
        @Override
        public void run(){
            
            System.out.println("Battito:" + (rand.nextInt(30)+60));
            CSVManager writer = new CSVManager("resources" + File.separator + "Pazienti" + File.separator + paziente + ".csv", ";");
            String pathToFile = "resources" + File.separator + "Pazienti" + File.separator + paziente + ".csv";
            BufferedWriter wr;
            try {
                wr = new BufferedWriter(new FileWriter(pathToFile, true));
                wr.write("ciao");
            } catch (IOException ex) {
                Logger.getLogger(Analisi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
     private class PressSBP extends TimerTask{
        
        @Override
        public void run(){
            System.out.println("Pressione SBP:150");
        }
    }
    private class PressDBP extends TimerTask{
        
        @Override
        public void run(){
            System.out.println("Pressione DBP:150");
        }
    }
     private class Temperatura extends TimerTask{
        
        @Override
        public void run(){
            System.out.println("Temperatura: 35°C");
        }
    }
    
}
