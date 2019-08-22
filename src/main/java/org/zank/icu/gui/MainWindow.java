package org.zank.icu.gui;

import org.zank.icu.analysis.AnalisiManager;
import org.zank.icu.data.CartellaClinica;
import org.zank.icu.data.Paziente;
import org.zank.icu.data.Utente;
import org.zank.icu.utility.CSVManager;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        propertiesButton.addActionListener(this);
        setVisible(true);
        updateGUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nuovoPazienteButton = new javax.swing.JButton();
        somministrazioneButton = new javax.swing.JButton();
        diagnosiButton = new javax.swing.JButton();
        prescrizioneButton = new javax.swing.JButton();
        dimettiButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reportButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaTelemetria = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        rapportoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPazienti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        storicoButton = new javax.swing.JButton();
        numeroPazientiLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        utenteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ruoloLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        propertiesButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitoraggio Terapia Intensiva");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 0, 102));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        nuovoPazienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_plus_25px.png"))); // NOI18N
        nuovoPazienteButton.setText("Nuovo Paziente");
        nuovoPazienteButton.setBorderPainted(false);

        somministrazioneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_treatment_plan_25px.png"))); // NOI18N
        somministrazioneButton.setText("Somministrazione");
        somministrazioneButton.setBorderPainted(false);

        diagnosiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_health_checkup_filled_25px.png"))); // NOI18N
        diagnosiButton.setText("Diagnosi");
        diagnosiButton.setBorderPainted(false);

        prescrizioneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_pill_filled_25px.png"))); // NOI18N
        prescrizioneButton.setText("Prescrizione");
        prescrizioneButton.setBorderPainted(false);

        dimettiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_remove_user_group_man_man_filled_25px.png"))); // NOI18N
        dimettiButton.setText("Dimetti paziente");
        dimettiButton.setBorderPainted(false);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opzioni infermiere");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opzioni medico");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Opzioni primario");

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_report_card_25px.png"))); // NOI18N
        reportButton.setText("Report settimanale");
        reportButton.setBorderPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(204, 204, 204))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(dimettiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(72, 72, 72))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prescrizioneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diagnosiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(somministrazioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(61, 61, 61)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(somministrazioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagnosiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescrizioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dimettiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(651, 651, 651))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 210, 530));

        jPanel8.setBackground(new java.awt.Color(255, 247, 247));

        jPanel4.setBackground(new java.awt.Color(255, 247, 247));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Paziente: ");

        pazienteLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pazienteLabel.setText("selezionare paz.");

        rapportoButton.setText("Rapp. dettagliato");
        rapportoButton.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rapportoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pazienteLabel)
                            .addComponent(jLabel3)
                            .addComponent(statusLabel)))
                    .addComponent(rapportoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 247, 247));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero pazienti: ");

        storicoButton.setText("Visualizza storico");
        storicoButton.setBorderPainted(false);
        storicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storicoButtonActionPerformed(evt);
            }
        });

        numeroPazientiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeroPazientiLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroPazientiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(storicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 213, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPazientiLabel)
                    .addComponent(storicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 630, 530));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Utente");

        utenteLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        utenteLabel.setForeground(new java.awt.Color(255, 255, 255));
        utenteLabel.setText("Guest");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ruolo");

        ruoloLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ruoloLabel.setForeground(new java.awt.Color(255, 255, 255));
        ruoloLabel.setText("Guest");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruoloLabel)
                    .addComponent(utenteLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(utenteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ruoloLabel))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        loginButton.setBackground(new java.awt.Color(102, 0, 102));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_lock_25px.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);

        propertiesButton.setBackground(new java.awt.Color(102, 0, 102));
        propertiesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        propertiesButton.setForeground(new java.awt.Color(255, 255, 255));
        propertiesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_settings_3_25px.png"))); // NOI18N
        propertiesButton.setText("Properties");
        propertiesButton.setBorderPainted(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertiesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propertiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_user_male_circle_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabellaPazientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaPazientiMouseClicked

        updateTelemetria();
    }//GEN-LAST:event_tabellaPazientiMouseClicked

    private void storicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storicoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storicoButtonActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel numeroPazientiLabel;
    private javax.swing.JButton nuovoPazienteButton;
    private javax.swing.JLabel pazienteLabel;
    private javax.swing.JButton prescrizioneButton;
    private javax.swing.JButton propertiesButton;
    private javax.swing.JButton rapportoButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel ruoloLabel;
    private javax.swing.JButton somministrazioneButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton storicoButton;
    public javax.swing.JTable tabellaPazienti;
    private javax.swing.JTable tabellaTelemetria;
    private javax.swing.JLabel utenteLabel;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Nuovo Paziente":
                doNuovoPaziente();
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
            case "Properties":
                doProperties();
                break;
        }
    }

    private void doNuovoPaziente() {
        if (pazientiInCura.size() >= 10) {
            JOptionPane.showMessageDialog(null,
                    "Impossibile inserire oltre 10 pazienti in reparto",
                    "Errore",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        new DefaultJDialog(new NuovoPaziente(this), "Nuovo paziente");
        updateGUI();
    }

    private void doProperties() {
        new DefaultJDialog(new PropertiesSetter(), "Properties");
        for (CartellaClinica cartella : pazientiInCura) {
            cartella.getManager().aggiornaTimer();
        }
    }

    private void doLogin() {
        new DefaultJDialog(new Login(this), "Login");
        updateGUI();
    }

    private void doLogout() {
        utenteCorrente = null;
        updateGUI();
    }

    private void doTelemetriaDettagliata() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            telemetriaDettagliata = new TelemetriaDettagliata(paziente, this);
            new DefaultJDialog(telemetriaDettagliata, "Telemetria " + paziente.toString());
        } else {
            mostraDialogErrore();
        }
    }

    private void doNuovaPrescrizione() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new NuovaPrescrizione(paziente, this), "Nuova Prescrizione");
        } else {
            mostraDialogErrore();
        }
    }

    private void doNuovaSomministrazione() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new NuovaSomministrazione(paziente, this), "Nuova Somministrazione");
        } else {
            mostraDialogErrore();
        }
    }

    private void doDimettiPaziente() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new DimettiPaziente(this, paziente), "Dimetti paziente");
        } else {
            mostraDialogErrore();
        }
    }

    private Paziente getPazienteSelezionato() {
        int row = tabellaPazienti.getSelectedRow();
        if (row < 0) {
            return null;
        }
        Paziente paziente = (Paziente) tabellaPazienti.getValueAt(row, 0);
        return paziente;
    }

    private void mostraDialogErrore() {
        JOptionPane.showMessageDialog(null,
                "Seleziona un paziente dalla Tabella Pazienti",
                "Errore",
                JOptionPane.WARNING_MESSAGE);
    }

    private void doDiagnosi() {
        Paziente paziente = getPazienteSelezionato();
        if (paziente != null) {
            new DefaultJDialog(new Diagnosi(paziente), "Diagnosi paziente");
        } else {
            mostraDialogErrore();
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
            rapportoButton.setEnabled(false);
            return;
        }

        switch (utenteCorrente.getRuolo()) {
            case PRM:
                dimettiButton.setEnabled(true);
                reportButton.setEnabled(true);
            case MED:
                diagnosiButton.setEnabled(true);
                prescrizioneButton.setEnabled(true);
                rapportoButton.setEnabled(true);
                storicoButton.setEnabled(true);
                somministrazioneButton.setEnabled(false);
                nuovoPazienteButton.setEnabled(false);
                break;
            case INF:
                rapportoButton.setEnabled(true);
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
            tabellaPazienti.setValueAt(cartella.getPaziente().getStatus(), count, 5);
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
            statusLabel.setText(paziente.getStatus());
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
