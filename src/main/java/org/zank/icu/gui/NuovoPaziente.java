package org.zank.icu.gui;

import org.zank.icu.data.CartellaClinica;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Utente;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NuovoPaziente extends javax.swing.JPanel {

    private MainWindow main;
    private Paziente paziente;
    private NuovoPazienteController controller = new NuovoPazienteController();

    public NuovoPaziente(MainWindow main) {
        initComponents();
        this.main = main;

        isMedico(this.main.getUtenteCorrente());

        annullaButton.addActionListener(controller);
        confermaButton.addActionListener(controller);
        nomeField.getDocument().addDocumentListener(controller);
        cognomeField.getDocument().addDocumentListener(controller);
        maschioRadio.addActionListener(controller);
        femminaRadio.addActionListener(controller);
        luogoField.getDocument().addDocumentListener(controller);
        dataNascitaSpinner.setEditor(new JSpinner.DateEditor(dataNascitaSpinner, "dd/MM/yyyy"));
        dataNascitaSpinner.addChangeListener(controller);

        paziente = new Paziente();
        codiceSanitarioLabel.setText(paziente.getCodiceSanitario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maschioRadio = new javax.swing.JRadioButton();
        femminaRadio = new javax.swing.JRadioButton();
        nomeField = new javax.swing.JTextField();
        cognomeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        luogoField = new javax.swing.JTextField();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();
        codiceFiscaleLabel = new javax.swing.JLabel();
        dataNascitaSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        codiceSanitarioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosiField = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Cognome");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Genere");

        maschioRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(maschioRadio);
        maschioRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        maschioRadio.setSelected(true);
        maschioRadio.setText("Maschio");
        maschioRadio.setActionCommand("m");

        femminaRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(femminaRadio);
        femminaRadio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        femminaRadio.setText("Femmina");
        femminaRadio.setActionCommand("f");

        nomeField.setColumns(10);
        nomeField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        cognomeField.setColumns(10);
        cognomeField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Data di nascita");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Comune di Nascita");

        luogoField.setColumns(10);
        luogoField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        confermaButton.setBackground(new java.awt.Color(0, 83, 255));
        confermaButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        confermaButton.setForeground(new java.awt.Color(255, 255, 255));
        confermaButton.setText("Conferma");
        confermaButton.setBorderPainted(false);
        confermaButton.setPreferredSize(new java.awt.Dimension(90, 28));

        annullaButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        annullaButton.setText("Annulla");
        annullaButton.setBorderPainted(false);
        annullaButton.setPreferredSize(new java.awt.Dimension(90, 28));

        codiceFiscaleLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        codiceFiscaleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codiceFiscaleLabel.setText("CF");
        codiceFiscaleLabel.setFocusable(false);
        codiceFiscaleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dataNascitaSpinner.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        dataNascitaSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(631148400000L), null, null, java.util.Calendar.DAY_OF_MONTH));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Paziente num.");

        codiceSanitarioLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        diagnosiField.setColumns(20);
        diagnosiField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        diagnosiField.setRows(5);
        diagnosiField.setEnabled(false);
        jScrollPane1.setViewportView(diagnosiField);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Diagnosi di ingresso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(maschioRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addComponent(femminaRadio))
                                .addComponent(nomeField)
                                .addComponent(cognomeField)
                                .addComponent(luogoField, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dataNascitaSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codiceFiscaleLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codiceSanitarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maschioRadio)
                    .addComponent(femminaRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataNascitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(luogoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(codiceSanitarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codiceFiscaleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel codiceFiscaleLabel;
    private javax.swing.JLabel codiceSanitarioLabel;
    private javax.swing.JTextField cognomeField;
    private javax.swing.JButton confermaButton;
    private javax.swing.JSpinner dataNascitaSpinner;
    private javax.swing.JTextArea diagnosiField;
    private javax.swing.JRadioButton femminaRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField luogoField;
    private javax.swing.JRadioButton maschioRadio;
    private javax.swing.JTextField nomeField;
    // End of variables declaration//GEN-END:variables

    private boolean saveToFile() {
        if (!canConfirm()) {
            JOptionPane.showMessageDialog(null, "Dati incompleti", "Errore", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        paziente.setDataDiRicovero(new Date());

        CSVManager writer = new CSVManager("resources" + File.separator + "lista-pazienti.csv", ";");
        String linea = Utility.paziente2String(paziente);
        writer.append(linea);
        try {
            boolean file = new File("resources" + File.separator + "Pazienti" + File.separator + paziente.getCodiceFiscale()).mkdirs();
            if (!file) {
                return false;
            }
            writer.setPathToFile("resources" + File.separator + "Pazienti" + File.separator + paziente.getCodiceFiscale() + File.separator + "Analisi.csv");
            writer.append(linea);
            writer.setPathToFile("resources" + File.separator + "Pazienti" + File.separator + paziente.getCodiceFiscale() + File.separator + "Diagnosi.txt");
            writer.append(diagnosiField.getText());
            main.aggiungiPazienteInCura(new CartellaClinica(paziente));
        } catch (Exception e) {
            System.out.println("Impossible creare nuovo paziente");
            return false;
        }
        return true;
    }

    private boolean canConfirm() {
        return !nomeField.getText().isEmpty()
                && !cognomeField.getText().isEmpty()
                && !luogoField.getText().isEmpty();
    }

    private void isMedico(Utente utente) {
        diagnosiField.setEnabled(!(utente.getRuolo() == Utente.RUOLO.Infermiere));
    }

    private class NuovoPazienteController implements DocumentListener, ChangeListener, ActionListener {

        @Override
        public void insertUpdate(DocumentEvent arg0) {
            update();
        }

        @Override
        public void removeUpdate(DocumentEvent arg0) {
            update();
        }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
            update();
        }

        @Override
        public void stateChanged(ChangeEvent arg0) {
            update();
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            switch (arg0.getActionCommand()) {
                case "Conferma":
                    if (saveToFile()) {
                        Utility.chiudiDialog(arg0);
                    }
                    break;
                case "Annulla":
                    Utility.chiudiDialog(arg0);
                    break;
                default:
                    update();
            }
        }

        private void update() {
            paziente.setNome(nomeField.getText());
            paziente.setCognome(cognomeField.getText());
            paziente.setGenere(buttonGroup1.getSelection().getActionCommand().charAt(0));
            paziente.setDataDiNascita((Date) dataNascitaSpinner.getValue());
            try {
                paziente.setLuogoDiNascita(luogoField.getText().toLowerCase());
                paziente.generaCodiceFiscale();
                codiceFiscaleLabel.setText(paziente.getCodiceFiscale().toString());
            } catch (Exception e) {
                codiceFiscaleLabel.setText("CF");
                paziente.setLuogoDiNascita("Roma");
            }

        }
    }
}
