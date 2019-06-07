package dev.matteomeneghetti.sendhelp.gui;
import javax.swing.JDialog;
import javax.swing.JPanel;

/*
Classe adibita a a fornire un jDialog pronto all'uso
*/


public class DefaultJDialog extends JDialog {
    
    public DefaultJDialog(JPanel contenuto) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
