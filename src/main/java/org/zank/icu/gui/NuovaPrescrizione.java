package org.zank.icu.gui;

import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Prescrizione;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class NuovaPrescrizione extends javax.swing.JPanel implements ActionListener {

    MainWindow main;
    Paziente paziente;

    public NuovaPrescrizione(Paziente paziente, MainWindow main) {
        this.main = main;
        this.paziente = paziente;
        initComponents();

        dataInizioSpinner.setEditor(new JSpinner.DateEditor(dataInizioSpinner, "dd/MM/yyyy"));
        dataFineSpinner.setEditor(new JSpinner.DateEditor(dataFineSpinner, "dd/MM/yyyy"));
        confermaButton.addActionListener(this);
        annullaButton.addActionListener(this);
        pazienteLabel.setText(paziente.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantitaDoseSpinner = new javax.swing.JSpinner();
        numeroDosiSpinnner = new javax.swing.JSpinner();
        annullaButton = new javax.swing.JButton();
        confermaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataInizioSpinner = new javax.swing.JSpinner();
        dataFineSpinner = new javax.swing.JSpinner();
        farmacoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 247, 247));
        setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 247, 247));
        jPanel3.setMinimumSize(null);
        jPanel3.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 247, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dosologia"));

        jLabel6.setText("Dose (g)");

        jLabel5.setText("Dosi giornaliere");

        quantitaDoseSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0f, 0.0f, null, 0.1f));

        numeroDosiSpinnner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(numeroDosiSpinnner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantitaDoseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroDosiSpinnner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quantitaDoseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        annullaButton.setBackground(new java.awt.Color(255, 247, 247));
        annullaButton.setText("Annulla");
        annullaButton.setBorderPainted(false);

        confermaButton.setBackground(new java.awt.Color(102, 0, 102));
        confermaButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confermaButton.setForeground(new java.awt.Color(255, 255, 255));
        confermaButton.setText("Conferma");
        confermaButton.setBorderPainted(false);

        jPanel1.setBackground(new java.awt.Color(255, 247, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Durata prescrizione"));

        jLabel3.setText("Data inizio");

        jLabel4.setText("Data fine");

        dataInizioSpinner.setModel(new javax.swing.SpinnerDateModel());

        dataFineSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataFineSpinner)
                    .addComponent(dataInizioSpinner))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataInizioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataFineSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome farmaco");

        pazienteLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pazienteLabel.setText("jLabel8");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Paziente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(pazienteLabel))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(farmacoField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pazienteLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(farmacoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JSpinner dataFineSpinner;
    private javax.swing.JSpinner dataInizioSpinner;
    private javax.swing.JTextField farmacoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner numeroDosiSpinnner;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JSpinner quantitaDoseSpinner;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Conferma":
                if (convalidaCampi()) {
                    salvaPrescrizione(creaPrescrizione());
                    Utility.chiudiDialog(ae);
                }
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
        }
    }

    private CartellaClinica getCartella() {
        for (CartellaClinica cartella : main.pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                return cartella;
            }
        }
        return null;
    }

    private boolean convalidaCampi() {
        return convalidaNome() && convalidaData();
    }

    private boolean convalidaNome() {
        String nomeFarmaco = farmacoField.getText();
        if (nomeFarmaco.isBlank()) {
            return false;
        } else {
            return true;
        }
    }

    private boolean convalidaData() {
        Date dataInizio = (Date) dataInizioSpinner.getValue();
        Date dataFine = (Date) dataFineSpinner.getValue();
        if (dataInizio.after(dataFine)) {
            JOptionPane.showMessageDialog(null, "Durata terapia impossibile", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    private Prescrizione creaPrescrizione() {
        Prescrizione prescrizione;
        prescrizione = new Prescrizione.PrescrizioneBuilderImpl()
                .setNomeFarmaco(farmacoField.getText())
                .setDataPrescrizione((Date) dataInizioSpinner.getValue())
                .setDataFineTerapia((Date) dataFineSpinner.getValue())
                .setNumeroDosiGiornaliere((int) numeroDosiSpinnner.getValue())
                .setQuantitaDose((float) quantitaDoseSpinner.getValue())
                .setMedico(main.getUtenteCorrente().getNome())
                .build();
        return prescrizione;
    }

    private void salvaPrescrizione(Prescrizione prescrizione) {
        CartellaClinica cartellaPaziente = getCartella();
        cartellaPaziente.addPrescrizione(prescrizione);
    }
}
