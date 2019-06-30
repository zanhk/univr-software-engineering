package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Utente;
import dev.matteomeneghetti.sendhelp.utility.Analisi;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainWindow extends javax.swing.JFrame implements ActionListener {
   
    private Utente utenteCorrente;  //utente loggato, null se ospite
    public List<CartellaClinica> pazientiInCura;

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setUtenteCorrente(null);
        
        loginButton.addActionListener(this);
        nuovoPazienteButton.addActionListener(this);
        prescrizioneButton.addActionListener(this);
        somministrazioneButton.addActionListener(this);
        setVisible(true);
        try {
            new DefaultJDialog(new Alarm("3", "ipertrifosi", 2));
        } catch (InterruptedException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateGUI();
       
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPazienti = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaTelemetria = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nuovoPazienteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        utenteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ruoloLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        prescrizioneButton = new javax.swing.JButton();
        diagnosiButton = new javax.swing.JButton();
        dimettiButton = new javax.swing.JButton();
        somministrazioneButton = new javax.swing.JButton();
        storicoButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Send Help");

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        tabellaPazienti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Paziente", "SBP", "DBP", "BPM", "Temp (C)", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaPazienti.getTableHeader().setReorderingAllowed(false);
        tabellaPazienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabellaPazientiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabellaPazienti);
        if (tabellaPazienti.getColumnModel().getColumnCount() > 0) {
            tabellaPazienti.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Telemetria Paziente"));

        tabellaTelemetria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabellaTelemetria.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(tabellaTelemetria);

        jLabel6.setText("Paziente: ");

        pazienteLabel.setText("selezionare paz.");

        jButton6.setText("Ferma allarme");
        jButton6.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pazienteLabel)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Numero pazienti: 0 ");

        nuovoPazienteButton.setText("Nuovo Paziente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuovoPazienteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nuovoPazienteButton)))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dati utente", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        loginButton.setText("Login");

        utenteLabel.setText("Guest");

        jLabel4.setText("Ruolo");

        jLabel2.setText("Utente");

        ruoloLabel.setText("Guest");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ruoloLabel))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(utenteLabel)))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utenteLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ruoloLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(29, 29, 29))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Opzioni utente"));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opzioni medico"));

        prescrizioneButton.setText("Aggiungi prescrizione");

        diagnosiButton.setText("Diagnosi");

        dimettiButton.setText("Dimetti paziente");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dimettiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diagnosiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(prescrizioneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diagnosiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(prescrizioneButton)
                .addGap(24, 24, 24)
                .addComponent(dimettiButton))
        );

        somministrazioneButton.setText("Aggiungi somministrazione");

        storicoButton.setText("Visualizza storico");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(somministrazioneButton)
                    .addComponent(storicoButton))
                .addGap(90, 90, 90)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(storicoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(somministrazioneButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabellaPazientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaPazientiMouseClicked
        // TODO add your handling code here:
        updateTelemetria();
        
    }//GEN-LAST:event_tabellaPazientiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagnosiButton;
    private javax.swing.JButton dimettiButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton nuovoPazienteButton;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JButton prescrizioneButton;
    private javax.swing.JLabel ruoloLabel;
    private javax.swing.JButton somministrazioneButton;
    private javax.swing.JButton storicoButton;
    public javax.swing.JTable tabellaPazienti;
    private javax.swing.JTable tabellaTelemetria;
    private javax.swing.JLabel utenteLabel;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch(actionCommand) {
            case "Nuovo Paziente":
                new DefaultJDialog(new NuovoPaziente(this));
                updateGUI();
                break;
            case "Login":
                doLogin();
                break;
            case "Logout":
                doLogout();
                break;
            case "Aggiungi prescrizione":
                new DefaultJDialog(new NuovaPrescrizione(this));
                updateGUI();
                break;
            case "Aggiungi somministrazione":
                new DefaultJDialog(new NuovaSomministrazione(this));
                updateGUI();
                break;
            
        }
    }
    
    private void doLogin() {       
        new DefaultJDialog(new Login(this));
        updateGUI();
    }
    
    private void doLogout() {
        utenteCorrente = null;
        updateGUI();
    }
    
    public void setUtenteCorrente(Utente utente) {
        this.utenteCorrente = utente;
    }

    public Utente getUtenteCorrente() {
        return this.utenteCorrente;
    }
    
    // Aggiorna i dati su schermo dell'utente loggato, null = guest
    private void updateUtente() {
        if(utenteCorrente != null) {
            this.utenteLabel.setText(utenteCorrente.getNome());
            this.ruoloLabel.setText(utenteCorrente.getRuolo().toString());
            loginButton.setText("Logout");
        }
        else {
            utenteLabel.setText("Guest");
            ruoloLabel.setText("Guest");
            loginButton.setText("Login");
        }
    }

    // Aggiorna lo stato dei pulsanti in base ai privilegi dell'utente loggato
    private void updateButtons() {  //Aggiorna pulsanti in base all'utente loggato
        
        if(utenteCorrente == null) {
            dimettiButton.setEnabled(false);
            diagnosiButton.setEnabled(false);
            prescrizioneButton.setEnabled(false);
            storicoButton.setEnabled(false);
            somministrazioneButton.setEnabled(false);
            nuovoPazienteButton.setEnabled(false);
            return;
        }
            
        switch (utenteCorrente.getRuolo()) {
            case PRM:
                dimettiButton.setEnabled(true);
            case MED:
                diagnosiButton.setEnabled(true);
                prescrizioneButton.setEnabled(true);
            case INF:
                storicoButton.setEnabled(true);
                somministrazioneButton.setEnabled(true);
                nuovoPazienteButton.setEnabled(true);
                break;
        }
    }
    
    // Aggiorna l'oggetto che contiene le persone al momento in fase di ricovero
    private void aggiornaPazienti() {
        pazientiInCura = new ArrayList<>();
        String path = null;
        try {
            path = "resources" + File.separator + "Pazienti";
            File[] file = new File(path).listFiles(File::isDirectory);

        for(File name : file) {
            String dataPaziente = new CSVManager(path+File.separator+name.getName()+File.separator+"Analisi.csv", ";").getLineAt(0);
            pazientiInCura.add(new CartellaClinica(Utility.string2Paziente(dataPaziente)));
            new Analisi(name.getName(), this);
        }
         } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    // Aggiorna la tabella principale con i dati dell'oggetto
    private void updateTable(){
        aggiornaPazienti();
        int count = 0;
        for(CartellaClinica cartella : pazientiInCura) {
            tabellaPazienti.setValueAt(cartella.getPaziente(), count, 0);
            count++;
        }
    }
    
    private void updateTelemetria() {
        if (tabellaPazienti.getSelectedRow() < 0)
            return;
        int row = tabellaPazienti.getSelectedRow();
        int column = 0;
        Paziente paziente = (Paziente)tabellaPazienti.getValueAt(row, column);
        if (paziente!= null)
            pazienteLabel.setText(paziente.toString());
    }
    
    // Aggiorna tutta la grafica
    //public void updateAnalisi(int position, String key){
    public void updateAnalisi(String path, int position, String key){
        CSVManager wr = new CSVManager(path, ";");
        String paziente = path.substring(19, path.length()-12);
        
        for(int i=0; i<=10; i++)
        {
            if(tabellaPazienti.getValueAt(i,0).toString().equals(paziente)){
                String[] pingu = wr.find(key);
                int lenght = pingu.length;
                Integer number = Integer.parseInt(pingu[lenght-1]);
                tabellaPazienti.setValueAt(number, i, position);
                return;
                }
            
                
        }
       
       
    }
    
    public void updateGUI() {
        updateUtente();
        updateButtons();
        updateTable();
        updateTelemetria();
    }
}
