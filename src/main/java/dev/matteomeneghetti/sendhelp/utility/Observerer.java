/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.gui.MainWindow;

/**
 *
 * @author cesar
 */
public class Observerer {
    MainWindow mainWindow;   
    
    public Observerer(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }
    public void putOnTable(String stringa, int row, int colums){
        mainWindow.tabellaPazienti.setValueAt(stringa, row, colums);
    }
    
}
