package org.zank.icu.gui;

import org.zank.icu.data.Paziente;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
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

        setBackground(new java.awt.Color(255, 255, 255));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(null);
        jScrollPane1.setViewportView(textArea);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Paziente");

        nomePazienteLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nomePazienteLabel.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Data di ricovero");

        dataRicoveroLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dataRicoveroLabel.setText("jLabel4");

        confermaButton.setBackground(new java.awt.Color(0, 83, 255));
        confermaButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        confermaButton.setForeground(new java.awt.Color(255, 255, 255));
        confermaButton.setText("Conferma");
        confermaButton.setBorderPainted(false);

        annullaButton.setBackground(new java.awt.Color(255, 255, 255));
        annullaButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        annullaButton.setText("Annulla");
        annullaButton.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annullaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePazienteLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataRicoveroLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePazienteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataRicoveroLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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
