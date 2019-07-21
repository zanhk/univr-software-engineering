package dev.matteomeneghetti.sendhelp.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;

/*
    Classe adibita a a fornire un jDialog pronto all'uso
 */
public class DefaultJDialog extends JDialog {

    public DefaultJDialog(JPanel contenuto) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public DefaultJDialog(JPanel contenuto, String titolo) {
        setTitle(titolo);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /*
        JDialog per gli alarm
     */
    public DefaultJDialog(JPanel contenuto, String titolo, boolean isModal) {
        setTitle(titolo);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setModal(isModal);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
