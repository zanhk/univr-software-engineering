package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Utente;
import dev.matteomeneghetti.sendhelp.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Alarm extends javax.swing.JPanel implements ActionListener {

    String nome;
    int livello;
    int tempoIniziale;
    String tempo;
    MainWindow main;
    Paziente paziente;
    Timer timer;

    public Alarm(Paziente paziente, int livello, String nome, MainWindow main) {
        initComponents();
        jButton1.addActionListener(this);
        setVisible(true);

        this.main = main;
        this.livello = livello;
        this.paziente = paziente;
        this.nome = nome;
        tempoIniziale = getCountdown();

        this.livelloLabel.setText(String.valueOf(livello));
        this.tipoLabel.setText(nome);
        this.tempoLabel.setText(tempoIniziale + "minuti");
        timer = new Timer();
        timer.schedule(new countDown(this, tempoIniziale), 0, 1000);

    }

    private class countDown extends TimerTask {

        Alarm alarm;
        Integer minuti;
        Integer secondi = 0;

        public countDown(Alarm alarm, int tempoIniziale) {
            this.alarm = alarm;
            this.minuti = tempoIniziale;
        }

        @Override
        public void run() {

            paziente.setStatus(nome);
            main.updateGUI();

            if (secondi == 0) {
                secondi = 59;
                minuti--;
            }
            secondi--;
            if (minuti == 0) {
                this.alarm.tempoLabel.setText(secondi.toString() + " secondi");
            } else {
                this.alarm.tempoLabel.setText(minuti.toString() + " minuti e " + secondi.toString());
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        String message = e.getActionCommand();
        switch (message) {
            case "Conferma":
                if (canConferm()) {
                    timer.cancel();
                    paziente.setStatus("OK");
                    main.updateGUI();
                    Utility.chiudiDialog(e);
                }
                break;
        }
    }

    public boolean canConferm() {
        Utente utenteLoggato = main.getUtenteCorrente();
        if (utenteLoggato == null) {
            JOptionPane.showMessageDialog(null, "Nessun utente loggato", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (utenteLoggato.getRuolo() == Utente.RUOLO.INF) {
            JOptionPane.showMessageDialog(null, "L'utente non ha i privilegi necessari per fermare l'allarme", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (jTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserire l'operazione effettuata sul paziente", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tempoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        livelloLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();

        jButton1.setText("Conferma");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Inserire nell'area sottostante l'operazione effettuata sul paziente");

        jLabel2.setText("Tempo rimanente:");

        tempoLabel.setText("sometext");

        jLabel4.setText("Livello");

        livelloLabel.setText("livelloLabel");

        jLabel6.setText("Descrizione");

        tipoLabel.setText("tipoLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(livelloLabel)
                            .addComponent(tipoLabel))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(livelloLabel))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tempoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel livelloLabel;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables

    private int getCountdown() {
        switch (livello) {
            case 3:
                return 1;
            case 2:
                return 2;
            case 1:
                return 3;
        }
        return 5;
    }

}
