package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Somministrazione;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import java.io.File;
import javax.swing.DefaultListModel;

public class TelemetriaDettagliata extends javax.swing.JPanel {

    Paziente paziente;
    MainWindow main;
    DefaultListModel model;

    public TelemetriaDettagliata(Paziente paziente, MainWindow main) {
        initComponents();
        this.model = (DefaultListModel) listaPrescrizioni.getModel();
        this.paziente = paziente;
        this.main = main;
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
        listaPrescrizioni = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

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

        listaPrescrizioni.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listaPrescrizioni);

        jLabel2.setText("Telemetria ultime 2 ore");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPrescrizioni;
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
        for (Somministrazione somministrazione : cartella.getSomministrazioni())
            model.addElement(somministrazione);
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
