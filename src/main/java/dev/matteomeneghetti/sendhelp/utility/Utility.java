package dev.matteomeneghetti.sendhelp.utility;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class Utility {
    public static String date2String(Date data) {
        return data.getDate()+"/"+data.getMonth()+"/"+data.getYear();
    }
    public static Date string2Date(String stringa) {    // dd/MM/yyyy
        String[] stringaSplittata = stringa.split("/");
        return new Date(Integer.parseInt(stringaSplittata[2]), Integer.parseInt(stringaSplittata[1]), Integer.parseInt(stringaSplittata[0]));
    }
    
    public static void chiudiDialog(ActionEvent e) {
            Component component = (Component) e.getSource();
            JDialog thisDialog = (JDialog) SwingUtilities.getRoot(component);
            thisDialog.dispose();            
    }
        public Object getRootFrameOrDialog(ActionEvent e){
        Component myComponent = (Component) e.getSource();
        return SwingUtilities.getRoot(myComponent);
    }
}
