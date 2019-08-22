package org.zank.icu.gui;

import org.zank.icu.data.Paziente;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Diagnosi extends javax.swing.JPanel implements ActionListener{

    Paziente paziente;

    public Diagnosi(Paziente paziente) {
        initComponents();
        this.paziente = paziente;
        init();
        annullaButton.addActionListener(this);
        confermaButton.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();

        jLabel1.setText("Paziente");

        pazienteLabel.setText("jLabel2");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        confermaButton.setText("Conferma");

        annullaButton.setText("Annulla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(confermaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annullaButton)
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pazienteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pazienteLabel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton)
                    .addComponent(annullaButton))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command) {
            case "Conferma":
                save();
                Utility.chiudiDialog(ae);
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
        }
    }
    
    private void init() {
        pazienteLabel.setText(paziente.toString());
        CSVManager writer = new CSVManager("resources"+File.separator+"Pazienti"+File.separator+paziente.getCodiceFiscale()+File.separator+"Diagnosi.txt", ";");
        String ultimaDiagnosi = writer.getLineAt(writer.getNumberOfRows()-1);
        textArea.setText(ultimaDiagnosi);
    }
    
    private void save() {
        CSVManager writer = new CSVManager("resources"+File.separator+"Pazienti"+File.separator+paziente.getCodiceFiscale()+File.separator+"Diagnosi.txt", ";");
        writer.append(textArea.getText());
    }
}
