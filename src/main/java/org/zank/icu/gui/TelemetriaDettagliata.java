package org.zank.icu.gui;

import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Somministrazione;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
import java.io.File;
import java.util.Date;
import javax.swing.DefaultListModel;

public class TelemetriaDettagliata extends javax.swing.JPanel {

    Paziente paziente;
    MainWindow main;
    DefaultListModel model;

    public TelemetriaDettagliata(Paziente paziente, MainWindow main) {
        initComponents();
        this.model = (DefaultListModel) listaSomministrazioni.getModel();
        this.paziente = paziente;
        this.main = main;

        pazienteLabel.setText(paziente.toString());
        nomePazienteLabel.setText(paziente.getNome() + " " + paziente.getCognome());
        dataNascitaLabel.setText(Utility.date2ReadableString(paziente.getDataDiNascita()));
        dataRicoveroLabel.setText(Utility.date2ReadableString(paziente.getDataDiRicovero()));
        farmacoLabel.setText("");
        doseLabel.setText("");
        dataLabel.setText("");
        aggiornaListaSomministrazioni();
        aggiorna();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabella = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSomministrazioni = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        farmacoLabel = new javax.swing.JLabel();
        doseLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomePazienteLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dataRicoveroLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dataNascitaLabel = new javax.swing.JLabel();

        tabella.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tabella.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SBP", "DBP", "BPM", "Temp (C)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabella.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabella);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Paziente:");

        listaSomministrazioni.setBackground(new java.awt.Color(240, 240, 240));
        listaSomministrazioni.setModel(new DefaultListModel());
        listaSomministrazioni.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaSomministrazioniValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaSomministrazioni);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Telemetria ultime 2 ore");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dati somministrazione"));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Farmaco");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("Dose (g)");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Data");

        farmacoLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        farmacoLabel.setText("farmacoLabel");

        doseLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        doseLabel.setText("doseLabel");

        dataLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        dataLabel.setText("dataLabel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLabel)
                    .addComponent(doseLabel)
                    .addComponent(farmacoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(farmacoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(doseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pazienteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pazienteLabel.setText("pazienteLabel");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Somministrazioni");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Nome:");

        nomePazienteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomePazienteLabel.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Data di ricovero:");

        dataRicoveroLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataRicoveroLabel.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Data di nascita:");

        dataNascitaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataNascitaLabel.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomePazienteLabel)
                                            .addComponent(pazienteLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dataNascitaLabel)
                                            .addComponent(dataRicoveroLabel)))
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pazienteLabel)
                    .addComponent(jLabel8)
                    .addComponent(dataRicoveroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nomePazienteLabel)
                    .addComponent(jLabel9)
                    .addComponent(dataNascitaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaSomministrazioniValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaSomministrazioniValueChanged
        aggiornaDatiSomministrazione();
    }//GEN-LAST:event_listaSomministrazioniValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel dataNascitaLabel;
    private javax.swing.JLabel dataRicoveroLabel;
    private javax.swing.JLabel doseLabel;
    private javax.swing.JLabel farmacoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaSomministrazioni;
    private javax.swing.JLabel nomePazienteLabel;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JTable tabella;
    // End of variables declaration//GEN-END:variables

    public Paziente getPaziente() {
        return paziente;
    }

    private CartellaClinica getCartella() {
        for (CartellaClinica cartella : main.pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                return cartella;
            }
        }
        return null;
    }

    private void aggiornaListaSomministrazioni() {
        CartellaClinica cartella = getCartella();
        for (Somministrazione somministrazione : cartella.getSomministrazioni()) {
            if (isLast2Days(somministrazione)) {
                model.addElement(somministrazione);
            }
        }
    }

    private boolean isLast2Days(Somministrazione somministrazione) {
        Date adesso = new Date();
        Date dataSomministrazione = somministrazione.getDataSomministrazione();
        long diff = adesso.getTime() - dataSomministrazione.getTime();
        return ((diff / 1000) <= 172800);
    }

    private void aggiornaDatiSomministrazione() {
        if (listaSomministrazioni.getSelectedIndex() < 0) {
            return;
        }
        Somministrazione currSomm = (Somministrazione) model.getElementAt(listaSomministrazioni.getSelectedIndex());
        farmacoLabel.setText(currSomm.getNomeFarmaco());
        dataLabel.setText(Utility.date2ReadableStringDettagliata(currSomm.getDataSomministrazione()));
        doseLabel.setText(String.valueOf(currSomm.getDoseSomministrata()));
    }

    public void aggiorna() {
        if (paziente == null) {
            return;
        }
        String path = "resources" + File.separator + "Pazienti" + File.separator + paziente + File.separator;
        CSVManager wr = new CSVManager(path + "SBP.csv", ";");
        helper(wr, 0);
        wr.setPathToFile(path + "DBP.csv");
        helper(wr, 1);
        wr.setPathToFile(path + "BPM.csv");
        helper(wr, 2);
        wr.setPathToFile(path + "TEMP.csv");
        helper(wr, 3);
    }

    private void helper(CSVManager wr, int colonna) {
        for (int i = 0; i < 60 && i < wr.getNumberOfRows(); i++) {
            inserisciValore(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, colonna);
        }
    }

    public void inserisciValore(Integer valore, int riga, int colonna) {
        tabella.setValueAt(valore, riga, colonna);
    }
}
