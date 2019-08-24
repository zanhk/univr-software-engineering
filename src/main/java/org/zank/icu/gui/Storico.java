package org.zank.icu.gui;

import org.zank.icu.data.Paziente;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
import java.io.File;
import javax.swing.DefaultListModel;

public class Storico extends javax.swing.JPanel {

    private DefaultListModel model;

    public Storico() {
        initComponents();
        model = (DefaultListModel) listaPazienti.getModel();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPazienti = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        cognomeLabel = new javax.swing.JLabel();
        dataNascitaLabel = new javax.swing.JLabel();
        dataDimissioneLabel = new javax.swing.JLabel();
        dataRicoveroLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        listaPazienti.setModel(new DefaultListModel());
        listaPazienti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPazientiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPazienti);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Pazienti dimessi");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Cognome");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Data di nascita");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Data di ricovero");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Data di dimissione");

        nomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nomeLabel.setText("jLabel8");

        cognomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cognomeLabel.setText("jLabel8");

        dataNascitaLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dataNascitaLabel.setText("jLabel8");

        dataDimissioneLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dataDimissioneLabel.setText("jLabel8");

        dataRicoveroLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dataRicoveroLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataRicoveroLabel)
                            .addComponent(dataDimissioneLabel)
                            .addComponent(dataNascitaLabel)
                            .addComponent(cognomeLabel)
                            .addComponent(nomeLabel)))
                    .addComponent(jLabel2))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cognomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNascitaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataRicoveroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataDimissioneLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaPazientiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPazientiValueChanged
        aggiorna();
    }//GEN-LAST:event_listaPazientiValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cognomeLabel;
    private javax.swing.JLabel dataDimissioneLabel;
    private javax.swing.JLabel dataNascitaLabel;
    private javax.swing.JLabel dataRicoveroLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPazienti;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration//GEN-END:variables

    private void init() {
        String path = path = "resources" + File.separator + "Pazienti_dimessi";
        try {
            File[] file = new File(path).listFiles(File::isDirectory);
            for (File name : file) {
                String dataPaziente = new CSVManager(path + File.separator + name.getName() + File.separator + "Analisi.csv", ";").getLineAt(0);
                Paziente paziente = Utility.string2Paziente(dataPaziente);
                model.addElement(paziente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        nomeLabel.setText("");
        cognomeLabel.setText("");
        dataNascitaLabel.setText("");
        dataRicoveroLabel.setText("");
        dataDimissioneLabel.setText("");
    }
    
    private void aggiorna() {
        if(listaPazienti.getSelectedIndex() < 0)
            return;
        Paziente pazienteSelezionato = (Paziente) model.getElementAt(listaPazienti.getSelectedIndex());
        nomeLabel.setText(pazienteSelezionato.getNome());
        cognomeLabel.setText(pazienteSelezionato.getCognome());
        dataNascitaLabel.setText(Utility.date2ReadableString(pazienteSelezionato.getDataDiNascita()));
        dataRicoveroLabel.setText(Utility.date2ReadableString(pazienteSelezionato.getDataDiRicovero()));
        
        CSVManager wr = new CSVManager("resources" + File.separator + "Pazienti_dimessi" + File.separator + pazienteSelezionato + File.separator + "Dimissione.txt",";");
        dataDimissioneLabel.setText(Utility.date2ReadableString(Utility.string2Date(wr.getLineAt(0))));
    }
}
