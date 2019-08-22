package org.zank.sendhelp.gui;

import org.zank.sendhelp.data.Paziente;
import org.zank.sendhelp.utility.CSVManager;
import org.zank.sendhelp.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;

public class DimettiPaziente extends javax.swing.JPanel implements ActionListener {

    Paziente paziente;
    MainWindow main;

    public DimettiPaziente(MainWindow main, Paziente paziente) {
        initComponents();
        this.paziente = paziente;
        this.main = main;

        annullaButton.addActionListener(this);
        confermaButton.addActionListener(this);
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nomePazienteLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataRicoveroLabel = new javax.swing.JLabel();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel1.setText("Paziente");

        nomePazienteLabel.setText("jLabel2");

        jLabel3.setText("Data di ricovero");

        dataRicoveroLabel.setText("jLabel4");

        confermaButton.setText("Conferma");

        annullaButton.setText("Annulla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomePazienteLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dataRicoveroLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(confermaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(annullaButton)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePazienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataRicoveroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton)
                    .addComponent(annullaButton))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JLabel dataRicoveroLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomePazienteLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
            case "Conferma":
                if (!paziente.getStatus().equals("OK")) {
                    JOptionPane.showMessageDialog(null, "Impossibile dimettere un paziente in fase di allarme", "Errore", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                generaLettera();
                move(new File("resources" + File.separator + "Pazienti" + File.separator + paziente.toString()),
                        new File("resources" + File.separator + "Pazienti_dimessi" + File.separator + paziente.toString()));
                main.rimuoviPazienteInCura(paziente);
                Utility.chiudiDialog(ae);
                break;
        }
    }

    private void init() {
        nomePazienteLabel.setText(paziente.getCodiceFiscale().toString());
        dataRicoveroLabel.setText(Utility.date2ReadableString(paziente.getDataDiNascita()));
    }

    private void generaLettera() {
        CSVManager wr = new CSVManager("resources" + File.separator + "Pazienti" + File.separator + paziente + File.separator + "Dimissione.txt", ";");
        wr.append(Utility.date2String(new Date()));
        wr.append(textArea.getText());
    }

    private void move(File sourceFile, File destFile) {
        sourceFile.renameTo(destFile);
        sourceFile.delete();
    }
}
