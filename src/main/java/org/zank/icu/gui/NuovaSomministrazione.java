package org.zank.icu.gui;

import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Prescrizione;
import org.zank.icu.data.Somministrazione;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NuovaSomministrazione extends javax.swing.JPanel implements ActionListener {

    MainWindow main;
    Paziente paziente;

    public NuovaSomministrazione(Paziente paziente, MainWindow main) {
        this.main = main;
        this.paziente = paziente;
        initComponents();

        confermaButton.addActionListener(this);
        annullaButton.addActionListener(this);
        listaPrescrizioni.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                aggiornaDati();
            }
        });
        init();
        aggiornaListaPrescrizioni();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrescrizioni = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        farmacoLabel = new javax.swing.JLabel();
        doseLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteTextArea = new javax.swing.JTextArea();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doseSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dataInizioLabel = new javax.swing.JLabel();
        dataFineLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();

        listaPrescrizioni.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listaPrescrizioni);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dosologia"));

        jLabel2.setText("Dose");

        jLabel1.setText("Farmaco");

        farmacoLabel.setText("jLabel3");

        doseLabel.setText("jLabel4");

        jLabel5.setText("Prescritta da");

        medicoLabel.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(farmacoLabel)
                            .addComponent(doseLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicoLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(farmacoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doseLabel))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(medicoLabel)))
        );

        noteTextArea.setColumns(20);
        noteTextArea.setRows(5);
        noteTextArea.setText("Note");
        jScrollPane2.setViewportView(noteTextArea);

        confermaButton.setText("Conferma");

        annullaButton.setText("Annulla");

        jLabel3.setText("Prescrizioni");

        jLabel4.setText("Dose somministrata (g)");

        doseSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0f, 0.0f, null, 0.1f));

        jLabel6.setText("Data Inizio");

        jLabel7.setText("Data fine");

        dataInizioLabel.setText("jLabel8");

        dataFineLabel.setText("jLabel9");

        jLabel8.setText("Paziente");

        pazienteLabel.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(confermaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pazienteLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel8)))
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dataFineLabel)
                                            .addComponent(doseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataInizioLabel))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(annullaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dataInizioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dataFineLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(doseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton)
                    .addComponent(annullaButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JLabel dataFineLabel;
    private javax.swing.JLabel dataInizioLabel;
    private javax.swing.JLabel doseLabel;
    private javax.swing.JSpinner doseSpinner;
    private javax.swing.JLabel farmacoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPrescrizioni;
    private javax.swing.JLabel medicoLabel;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JLabel pazienteLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Conferma":
                if (listaPrescrizioni.getSelectedIndex() >= 0) {
                    salvaSomministrazione(creaSomministrazione());
                    Utility.chiudiDialog(ae);
                }
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
            case "comboBoxChanged":
                aggiornaListaPrescrizioni();
                break;
        }
    }
    
    private void init() {
        farmacoLabel.setText("");
        doseLabel.setText("");
        medicoLabel.setText("");
        dataInizioLabel.setText("");
        dataFineLabel.setText("");
        pazienteLabel.setText(paziente.toString());
    }

    private CartellaClinica getCartella() {
        for (CartellaClinica cartella : main.pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                return cartella;
            }
        }
        return null;
    }

    private Somministrazione creaSomministrazione() {
        Somministrazione somministrazione;
        somministrazione = new Somministrazione.SomministrazioneBuilderImpl()
                .setNomeFarmaco(farmacoLabel.getText())
                .setDataSomministrazione(new Date())
                .setDoseSomministrata(1.0f)
                .setNote(noteTextArea.getText())
                .build();
        return somministrazione;
    }

    private void salvaSomministrazione(Somministrazione somministrazione) {
        CartellaClinica cartellaPaziente = getCartella();
        cartellaPaziente.addSomministrazione(somministrazione);
    }

    private void aggiornaListaPrescrizioni() {
        DefaultListModel listModel = (DefaultListModel) listaPrescrizioni.getModel();
        listaPrescrizioni.clearSelection();
        listModel.removeAllElements();
        CartellaClinica cartellaBox = getCartella();
        for (Prescrizione prescrizione : cartellaBox.getPrescrizioni()) {
            listModel.addElement(prescrizione);
        }
    }

    private void aggiornaDati() {
        DefaultListModel listModel = (DefaultListModel) listaPrescrizioni.getModel();
        if (listaPrescrizioni.getSelectedIndex() < 0) {
            return;
        }
        Prescrizione currPres = (Prescrizione) listModel.getElementAt(listaPrescrizioni.getSelectedIndex());
        farmacoLabel.setText(currPres.getNomeFarmaco());
        doseLabel.setText(String.valueOf(currPres.getQuantitaDose()));
        dataInizioLabel.setText(Utility.date2ReadableString(currPres.getDataPrescrizione()));
        dataFineLabel.setText(Utility.date2ReadableString(currPres.getDataFineTerapia()));
        medicoLabel.setText(currPres.getMedico());
    }
}
