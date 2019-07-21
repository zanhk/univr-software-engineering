package dev.matteomeneghetti.sendhelp.gui;

import dev.matteomeneghetti.sendhelp.analisi.AnalisiManager;
import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Paziente;
import dev.matteomeneghetti.sendhelp.data.Utente;
import dev.matteomeneghetti.sendhelp.utility.CSVManager;
import dev.matteomeneghetti.sendhelp.utility.Report;
import dev.matteomeneghetti.sendhelp.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class MainWindow extends javax.swing.JFrame implements ActionListener {

    private Utente utenteCorrente;  //utente loggato, null se ospite
    public List<CartellaClinica> pazientiInCura = new ArrayList<>();

    private TelemetriaDettagliata telemetriaDettagliata = null;

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setUtenteCorrente(null);
        loadPazienti();

        loginButton.addActionListener(this);
        nuovoPazienteButton.addActionListener(this);
        prescrizioneButton.addActionListener(this);
        somministrazioneButton.addActionListener(this);
        storicoButton.addActionListener(this);
        rapportoButton.addActionListener(this);
        dimettiButton.addActionListener(this);
        diagnosiButton.addActionListener(this);
        reportButton.addActionListener(this);
        setVisible(true);
        updateGUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPazienti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nuovoPazienteButton = new javax.swing.JButton();
        storicoButton = new javax.swing.JButton();
        numeroPazientiLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaTelemetria = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        rapportoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        utenteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ruoloLabel = new javax.swing.JLabel();
        somministrazioneButton = new javax.swing.JButton();
        diagnosiButton = new javax.swing.JButton();
        prescrizioneButton = new javax.swing.JButton();
        dimettiButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Send Help");

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

        jLabel1.setText("Numero pazienti: ");

        nuovoPazienteButton.setText("Nuovo Paziente");

        storicoButton.setText("Visualizza storico");

        numeroPazientiLabel.setText("0");

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
        jScrollPane2.setViewportView(tabellaTelemetria);

        jLabel6.setText("Paziente: ");

        pazienteLabel.setText("selezionare paz.");

        rapportoButton.setText("Rapp. dettagliato");

        jLabel3.setText("Status:");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rapportoButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pazienteLabel)
                    .addComponent(rapportoButton)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        somministrazioneButton.setText("Aggiungi somministrazione");

        diagnosiButton.setText("Diagnosi");

        prescrizioneButton.setText("Aggiungi prescrizione");

        dimettiButton.setText("Dimetti paziente");

        jLabel7.setText("Opzioni infermiere");

        jLabel8.setText("Opzioni medico");

        jLabel9.setText("Opzioni primario");

        reportButton.setText("Report settimanale");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroPazientiLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(storicoButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dimettiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(diagnosiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(somministrazioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(prescrizioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuovoPazienteButton)
                            .addComponent(somministrazioneButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diagnosiButton)
                            .addComponent(prescrizioneButton))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimettiButton)
                            .addComponent(reportButton))
                        .addGap(18, 18, 18))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPazientiLabel)
                    .addComponent(storicoButton))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabellaPazientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaPazientiMouseClicked

        updateTelemetria();
    }//GEN-LAST:event_tabellaPazientiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagnosiButton;
    private javax.swing.JButton dimettiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel numeroPazientiLabel;
    private javax.swing.JButton nuovoPazienteButton;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JButton prescrizioneButton;
    private javax.swing.JButton rapportoButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel ruoloLabel;
    private javax.swing.JButton somministrazioneButton;
    private javax.swing.JButton storicoButton;
    public javax.swing.JTable tabellaPazienti;
    private javax.swing.JTable tabellaTelemetria;
    private javax.swing.JLabel utenteLabel;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
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
                doNuovaPrescrizione();
                updateGUI();
                break;
            case "Aggiungi somministrazione":
                doNuovaSomministrazione();
                updateGUI();
                break;
            case "Visualizza storico":
                new DefaultJDialog(new Storico(), "Storico pazienti");
                break;
            case "Rapp. dettagliato":
                doTelemetriaDettagliata();
                break;
            case "Dimetti paziente":
                doDimettiPaziente();
                updateGUI();
                break;
            case "Diagnosi":
                doDiagnosi();
                break;
            case "Report settimanale":
                new DefaultJDialog(new ReportTest(this), "Report settimanale");
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

    private void doTelemetriaDettagliata() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            telemetriaDettagliata = new TelemetriaDettagliata(paziente, this);
            new DefaultJDialog(telemetriaDettagliata, "Telemetria " + paziente.toString());
        }
    }

    private void doNuovaPrescrizione() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            new DefaultJDialog(new NuovaPrescrizione(paziente, this));
        }
    }

    private void doNuovaSomministrazione() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            new DefaultJDialog(new NuovaSomministrazione(paziente, this));
        }
    }

    private void doDimettiPaziente() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            new DefaultJDialog(new DimettiPaziente(this, paziente), "Dimetti paziente");
        }
    }

    private void doDiagnosi() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            new DefaultJDialog(new Diagnosi(paziente), "Diagnosi paziente");
        }
    }

    public void setUtenteCorrente(Utente utente) {
        this.utenteCorrente = utente;
    }

    public Utente getUtenteCorrente() {
        return this.utenteCorrente;
    }

    // Aggiorna i dati su schermo dell'utente loggato, null = guest
    private void updateUtente() {
        if (utenteCorrente != null) {
            this.utenteLabel.setText(utenteCorrente.getNome());
            this.ruoloLabel.setText(utenteCorrente.getRuolo().toString());
            loginButton.setText("Logout");
        } else {
            utenteLabel.setText("Guest");
            ruoloLabel.setText("Guest");
            loginButton.setText("Login");
        }
    }

    // Aggiorna lo stato dei pulsanti in base ai privilegi dell'utente loggato
    private void updateButtons() {

        if (utenteCorrente == null) {
            dimettiButton.setEnabled(false);
            diagnosiButton.setEnabled(false);
            prescrizioneButton.setEnabled(false);
            storicoButton.setEnabled(false);
            somministrazioneButton.setEnabled(false);
            nuovoPazienteButton.setEnabled(false);
            reportButton.setEnabled(false);
            return;
        }

        switch (utenteCorrente.getRuolo()) {
            case PRM:
                dimettiButton.setEnabled(true);
                reportButton.setEnabled(true);
            case MED:
                diagnosiButton.setEnabled(true);
                prescrizioneButton.setEnabled(true);
            case INF:
                storicoButton.setEnabled(true);
                rapportoButton.setEnabled(true);
                somministrazioneButton.setEnabled(true);
                nuovoPazienteButton.setEnabled(true);
                break;
        }
    }

    /*
        Funzione da usare al primo avvio dell'applicazione, carica i pazienti precedentemente salvati
     */
    private void loadPazienti() {
        String path = path = "resources" + File.separator + "Pazienti";
        try {
            File[] file = new File(path).listFiles(File::isDirectory);
            for (File name : file) {
                String dataPaziente = new CSVManager(path + File.separator + name.getName() + File.separator + "Analisi.csv", ";").getLineAt(0);
                CartellaClinica paziente = new CartellaClinica(Utility.string2Paziente(dataPaziente));

                AnalisiManager manager = new AnalisiManager(paziente.getPaziente(), this);
                paziente.setManager(manager);
                pazientiInCura.add(paziente);
                manager.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        Funzione da usare per aggiungere a runtime un paziente alla lista dei pazienti in cura
     */
    public void aggiungiPazienteInCura(CartellaClinica paziente) {
        AnalisiManager manager = new AnalisiManager(paziente.getPaziente(), this);
        paziente.setManager(manager);
        pazientiInCura.add(paziente);
        manager.start();
    }

    public void rimuoviPazienteInCura(Paziente paziente) {
        CartellaClinica cartellaDaRimuovere = null;
        for (CartellaClinica cartella : pazientiInCura) {
            if (cartella.getPaziente().toString().equals(paziente.toString())) {
                cartellaDaRimuovere = cartella;
            }
        }
        cartellaDaRimuovere.getManager().getTimer().cancel();
        pazientiInCura.remove(cartellaDaRimuovere);
    }

    // Aggiorna la tabella principale con i dati dell'oggetto
    private void updateTable() {
        int count = 0;
        for (CartellaClinica cartella : pazientiInCura) {
            tabellaPazienti.setValueAt(cartella.getPaziente(), count, 0);
            count++;
        }
        numeroPazientiLabel.setText(String.valueOf(count));
        for (int i = count; i < 10; i++) {
            tabellaPazienti.setValueAt(null, i, 0);
            tabellaPazienti.setValueAt(null, i, 1);
            tabellaPazienti.setValueAt(null, i, 2);
            tabellaPazienti.setValueAt(null, i, 3);
            tabellaPazienti.setValueAt(null, i, 4);
            tabellaPazienti.setValueAt(null, i, 5);
        }
    }

    /*
    private void updateTelemetria(int position, String key) {
        String path = "resources" + File.separator + "Pazienti" + File.separator;
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            String nomePaziente = paziente.toString();
            pazienteLabel.setText(nomePaziente);
            path += paziente + File.separator + "Analisi.csv";
            CSVManager wr = new CSVManager(path, ";");
            String[] str = wr.find(key);
            int n = 7;
            tabellaTelemetria.setValueAt(Integer.parseInt(str[str.length - 1]), n - 1, position-1);
        }
    }*/
    private void updateTelemetria() {
        String path = "resources" + File.separator + "Pazienti" + File.separator;
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        if (paziente != null) {
            String nomePaziente = paziente.toString();
            pazienteLabel.setText(nomePaziente);
            path += paziente + File.separator;
            CSVManager wr = new CSVManager(path + "SBP.csv", ";");

            int i;
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 0);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 0);
            }
            wr.setPathToFile(path + "DBP.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 1);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 1);
            }
            wr.setPathToFile(path + "BPM.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 2);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 2);
            }
            wr.setPathToFile(path + "TEMP.csv");
            for (i = 0; i < 7 && i < wr.getNumberOfRows(); i++) {
                tabellaTelemetria.setValueAt(Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - i - 1)), i, 3);
            }
            for (; i < 7; i++) {
                tabellaTelemetria.setValueAt(null, i, 3);
            }
        }
    }
    
    //read this https://www.javamex.com/tutorials/threads/invokelater.shtml
    public void updateAnalisi(String path, int position, String key, String nomePaziente) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CSVManager wr = new CSVManager(path, ";");

                for (int i = 0; i < 10; i++) {
                    Paziente paziente = (Paziente) tabellaPazienti.getValueAt(i, 0);
                    if (paziente != null) {
                        if (paziente.toString().equals(nomePaziente)) {
                            int number = Integer.parseInt(wr.getLineAt(wr.getNumberOfRows() - 1));
                            tabellaPazienti.setValueAt(number, i, position);

                            if (tabellaPazienti.getSelectedRow() == i) {
                                updateTelemetria();
                            }

                            if (telemetriaDettagliata != null) {
                                if (telemetriaDettagliata.getPaziente().toString().equals(nomePaziente)) {
                                    telemetriaDettagliata.aggiorna();
                                }
                            }
                            return;
                        }
                    }
                }
            }
        });
    }

    public void updateGUI() {
        updateUtente();
        updateButtons();
        updateTable();
        updateTelemetria();
    }
}
