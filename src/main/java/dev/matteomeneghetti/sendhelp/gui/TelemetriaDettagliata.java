package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
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

        jLabel1.setText("Paziente");

        listaSomministrazioni.setModel(new DefaultListModel());
        listaSomministrazioni.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaSomministrazioniValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaSomministrazioni);

        jLabel2.setText("Telemetria ultime 2 ore");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dati somministrazione"));

        jLabel3.setText("Farmaco");

        jLabel4.setText("Dose (g)");

        jLabel5.setText("Data");

        farmacoLabel.setText("farmacoLabel");

        doseLabel.setText("doseLabel");

        dataLabel.setText("dataLabel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(34, 34, 34))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(35, 35, 35)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pazienteLabel.setText("pazienteLabel");

        jLabel6.setText("Somministrazioni");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(pazienteLabel))
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pazienteLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
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
    private javax.swing.JLabel doseLabel;
    private javax.swing.JLabel farmacoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaSomministrazioni;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JTable tabella;
    // End of variables declaration//GEN-END:variables

    public Paziente getPaziente() {
        return paziente;
    }

    public void inserisciValore(Integer valore, int riga, int colonna) {
        tabella.setValueAt(valore, riga, colonna);
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
            if (isLast2Days(somministrazione))
                model.addElement(somministrazione);
        }
    }
    
    private boolean isLast2Days(Somministrazione somministrazione) {
        Date adesso = new Date();
        Date dataSomministrazione = somministrazione.getDataSomministrazione();
        long diff = adesso.getTime() - dataSomministrazione.getTime();
        return ((diff/1000) <= 172800);
    }

    private void aggiornaDatiSomministrazione() {
        if (listaSomministrazioni.getSelectedIndex() < 0) {
            return;
        }
        Somministrazione currSomm = (Somministrazione) model.getElementAt(listaSomministrazioni.getSelectedIndex());
        farmacoLabel.setText(currSomm.getNomeFarmaco());
        dataLabel.setText(currSomm.getDataSomministrazione().toString());
        doseLabel.setText(String.valueOf(currSomm.getDoseSomministrata()));
    }

    public void aggiorna() {
        if (paziente == null) {
            return;
        }
        String path = "resources" + File.separator + "Pazienti" + File.separator + paziente + File.separator + "Analisi.csv";
        CSVManager wr = new CSVManager(path, ";");
        String[] SBP = wr.find("SBP");
        String[] DBP = wr.find("DBP");
        String[] BPM = wr.find("BPM");
        String[] temperature = wr.find("TEMP");

        for (int i = 0; i < 60 && i < SBP.length - 1; i++) {
            inserisciValore(Integer.parseInt(SBP[SBP.length - i - 1]), i, 0);
        }
        for (int i = 0; i < 60 && i < DBP.length - 1; i++) {
            inserisciValore(Integer.parseInt(DBP[DBP.length - i - 1]), i, 1);
        }
        for (int i = 0; i < 60 && i < BPM.length - 1; i++) {
            inserisciValore(Integer.parseInt(BPM[BPM.length - i - 1]), i, 2);
        }
        for (int i = 0; i < 60 && i < temperature.length - 1; i++) {
            inserisciValore(Integer.parseInt(temperature[temperature.length - i - 1]), i, 3);
        }
    }
}
