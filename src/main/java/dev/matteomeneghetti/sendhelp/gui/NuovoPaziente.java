package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Utente;
import dev.matteomeneghetti.sendhelp.utility.Utility;
import static dev.matteomeneghetti.sendhelp.utility.Utility.date2String;
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
    
    private Paziente paziente;
    private Controller defaultController = new Controller();
    private NuovoPazienteController controller = new NuovoPazienteController();

    public NuovoPaziente(Utente utente) {
        initComponents();
        
        isMedico(utente);

        annullaButton.addActionListener(defaultController);
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
        jSeparator1 = new javax.swing.JSeparator();
        codiceFiscaleLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dataNascitaSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        codiceSanitarioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosiField = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 490));

        jLabel1.setText("Nome");

        jLabel2.setText("Cognome");

        jLabel3.setText("Genere");

        buttonGroup1.add(maschioRadio);
        maschioRadio.setSelected(true);
        maschioRadio.setText("Maschio");
        maschioRadio.setActionCommand("m");

        buttonGroup1.add(femminaRadio);
        femminaRadio.setText("Femmina");
        femminaRadio.setActionCommand("f");

        nomeField.setColumns(10);

        cognomeField.setColumns(10);

        jLabel4.setText("Data di nascita");

        jLabel5.setText("Comune di Nascita");

        luogoField.setColumns(10);

        confermaButton.setText("Conferma");
        confermaButton.setPreferredSize(new java.awt.Dimension(90, 28));

        annullaButton.setText("Annulla");
        annullaButton.setPreferredSize(new java.awt.Dimension(90, 28));

        codiceFiscaleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codiceFiscaleLabel.setText("CF");
        codiceFiscaleLabel.setFocusable(false);
        codiceFiscaleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("Nuovo Paziente");

        dataNascitaSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(631148400000L), null, null, java.util.Calendar.DAY_OF_MONTH));

        jLabel6.setText("Paziente num.");

        diagnosiField.setColumns(20);
        diagnosiField.setRows(5);
        diagnosiField.setEnabled(false);
        jScrollPane1.setViewportView(diagnosiField);

        jLabel8.setText("Diagnosi di ingresso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codiceFiscaleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cognomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maschioRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(femminaRadio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dataNascitaSpinner)
                                            .addComponent(luogoField)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(codiceSanitarioLabel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(codiceSanitarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codiceFiscaleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField luogoField;
    private javax.swing.JRadioButton maschioRadio;
    private javax.swing.JTextField nomeField;
    // End of variables declaration//GEN-END:variables
    
    private boolean saveToFile() {
        if(!canConfirm()){
            JOptionPane.showMessageDialog(null, "Dati incompleti", "Errore", JOptionPane.ERROR_MESSAGE   );
            return false;
        }
        
        CSVManager writer = new CSVManager("resources"+File.separator+"lista-pazienti.csv", ";");                        
        String linea = paziente.getCodiceSanitario()+";"
                      +paziente.getCognome()+";"
                      +paziente.getNome()+";"
                      +paziente.getLuogoDiNascita()+";"
                      +date2String(paziente.getDataDiNascita());
        writer.append(linea);
        try{
            File file = new File("resources"+File.separator+"Pazienti"+File.separator+paziente.getCodiceFiscale()+".csv");
            if(!file.createNewFile())
                return false;
            writer.setPathToFile(file.getAbsolutePath());
            writer.append("SBP");
            writer.append("DBP");
            writer.append("BPM");
            writer.append("TEMP");
        }catch(Exception e){
            System.out.println("Impossible creare");
            return false;
        }
        return true;
    }
    
    private boolean canConfirm() {
        return  !nomeField.getText().isEmpty()
                &&!cognomeField.getText().isEmpty()
                &&!luogoField.getText().isEmpty();
    }
    
    private void isMedico(Utente utente) {
        diagnosiField.setEnabled(!(utente.getRuolo() == Utente.RUOLO.INF));
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
            switch(arg0.getActionCommand()) {
                case "Conferma":
                    if(saveToFile())
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
            paziente.setDataDiNascita((Date)dataNascitaSpinner.getValue());
            paziente.setLuogoDiNascita(luogoField.getText());
            paziente.generaCodiceFiscale();
            codiceFiscaleLabel.setText(paziente.getCodiceFiscale().toString());
        }
    }
}
