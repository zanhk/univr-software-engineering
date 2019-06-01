package dev.matteomeneghetti.sendhelp.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Controller implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        String message = ae.getActionCommand();
        switch(message) {
            case "Annulla":
                JDialog myDialog = (JDialog) getRootFrameOrDialog(ae);
                myDialog.dispose();
                break;
            case "Esci":
                JFrame myFrame = (JFrame) getRootFrameOrDialog(ae);
                myFrame.dispose();
                break;
        }
    }
    
    private Object getRootFrameOrDialog(ActionEvent e){
        Component myComponent = (Component) e.getSource();
        return SwingUtilities.getRoot(myComponent);
    }
}