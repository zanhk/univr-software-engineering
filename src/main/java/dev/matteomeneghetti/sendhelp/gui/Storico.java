package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.Utility;
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

        listaPazienti.setModel(new DefaultListModel());
        listaPazienti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPazientiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPazienti);

        jLabel2.setText("Pazienti dimessi");

        jLabel3.setText("Nome");

        jLabel4.setText("Cognome");

        jLabel5.setText("Data di nascita");

        jLabel6.setText("Data di ricovero");

        jLabel7.setText("Data di dimissione");

        nomeLabel.setText("jLabel8");

        cognomeLabel.setText("jLabel8");

        dataNascitaLabel.setText("jLabel8");

        dataDimissioneLabel.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataDimissioneLabel)
                            .addComponent(dataNascitaLabel)
                            .addComponent(cognomeLabel)
                            .addComponent(nomeLabel))))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nomeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cognomeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dataNascitaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dataDimissioneLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaPazientiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPazientiValueChanged
        aggiorna();
    }//GEN-LAST:event_listaPazientiValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cognomeLabel;
    private javax.swing.JLabel dataDimissioneLabel;
    private javax.swing.JLabel dataNascitaLabel;
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
    }
    
    private void aggiorna() {
        if(listaPazienti.getSelectedIndex() < 0)
            return;
        Paziente pazienteSelezionato = (Paziente) model.getElementAt(listaPazienti.getSelectedIndex());
        nomeLabel.setText(pazienteSelezionato.getNome());
        cognomeLabel.setText(pazienteSelezionato.getCognome());
        dataNascitaLabel.setText(Utility.date2String(pazienteSelezionato.getDataDiNascita()));
        
        CSVManager wr = new CSVManager("resources" + File.separator + "Pazienti_dimessi" + File.separator + pazienteSelezionato + File.separator + "Dimissione.txt",";");
        dataDimissioneLabel.setText(wr.getLineAt(0));
    }
}
