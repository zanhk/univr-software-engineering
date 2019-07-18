package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Prescrizione;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import dev.matteomeneghetti.sendhelp.data.SomministrazioneBuilderImpl;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NuovaSomministrazione extends javax.swing.JPanel implements ActionListener {

    MainWindow main;

    public NuovaSomministrazione(MainWindow main) {
        this.main = main;
        initComponents();

        confermaButton.addActionListener(this);
        listaPrescrizioni.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                DefaultListModel listModel = (DefaultListModel) listaPrescrizioni.getModel();
                Prescrizione currPres = (Prescrizione) listModel.getElementAt(listaPrescrizioni.getSelectedIndex());
                farmacoLabel.setText(currPres.getNomeFarmaco());
                doseLabel.setText(String.valueOf(currPres.getQuantitaDose()));
                dataInizioLabel.setText(Utility.date2String(currPres.getDataPrescrizione()));
                dataFineLabel.setText(Utility.date2String(currPres.getDataFineTerapia()));
                medicoLabel.setText(currPres.getMedico());

            }
        });
        aggiornaListaPrescrizioni();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pazientiBox = new javax.swing.JComboBox<>();
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

        pazientiBox.setModel(new DefaultComboBoxModel(this.main.pazientiInCura.toArray()));

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

        jLabel3.setText("Paziente");

        jLabel4.setText("Dose somministrata");

        doseSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0f, 0.0f, null, 0.1f));

        jLabel6.setText("Data Inizio");

        jLabel7.setText("Data fine");

        dataInizioLabel.setText("jLabel8");

        dataFineLabel.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(confermaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(annullaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pazientiBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dataFineLabel)
                                            .addComponent(doseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataInizioLabel)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dataInizioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dataFineLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(doseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(pazientiBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPrescrizioni;
    private javax.swing.JLabel medicoLabel;
    private javax.swing.JTextArea noteTextArea;
    private javax.swing.JComboBox<String> pazientiBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Conferma":
                // salvaSomministrazione(creaSomministrazione());
                Utility.chiudiDialog(ae);
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
        }
    }

    private Somministrazione creaSomministrazione() {
        Somministrazione somministrazione;
        somministrazione = new SomministrazioneBuilderImpl()
                .setDataSomministrazione(new Date())
                .setDoseSomministrata(1.0f)
                .setNote(noteTextArea.getText())
                .build();
        return somministrazione;
    }

    private void salvaSomministrazione(Somministrazione somministrazione) {
        CartellaClinica cartellaPaziente = (CartellaClinica) pazientiBox.getSelectedItem();
        for (CartellaClinica cartella : main.pazientiInCura) {
            if (cartellaPaziente.equals(cartella)) {
                cartella.addSomministrazione(somministrazione);
            }
        }
    }

    private void aggiornaListaPrescrizioni() {
        DefaultListModel listModel = (DefaultListModel) listaPrescrizioni.getModel();
        CartellaClinica cartellaBox = (CartellaClinica) pazientiBox.getSelectedItem();
        String path = "resources" + File.separator + "Pazienti" + File.separator + cartellaBox.getPaziente().getCodiceFiscale() + File.separator + "Prescrizioni.csv";
        CSVManager wr = new CSVManager(path, ";");
        int rows = wr.getNumberOfRows();
        for (int i = 0; i < rows; i++) {
            listModel.add(i, Utility.string2Prescrizione(wr.getLineAt(i)));
        }
    }
}
