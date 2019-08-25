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
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        utenteLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ruoloLabel = new javax.swing.JLabel();
        propertiesButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nuovoPazienteButton = new javax.swing.JButton();
        somministrazioneButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        diagnosiButton = new javax.swing.JButton();
        prescrizioneButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dimettiButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaTelemetria = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPazienti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        numeroPazientiLabel = new javax.swing.JLabel();
        storicoButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pazienteLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rapportoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitoraggio Terapia Intensiva");
        setBackground(new java.awt.Color(255, 247, 247));
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(0, 57, 175));

        jPanel11.setBackground(new java.awt.Color(0, 57, 175));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Utente");

        utenteLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        utenteLabel.setForeground(new java.awt.Color(255, 255, 255));
        utenteLabel.setText("Guest");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ruolo");

        ruoloLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ruoloLabel.setForeground(new java.awt.Color(255, 255, 255));
        ruoloLabel.setText("Guest");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruoloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utenteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(utenteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ruoloLabel)
                .addContainerGap())
        );

        propertiesButton.setBackground(new java.awt.Color(0, 57, 175));
        propertiesButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        propertiesButton.setForeground(new java.awt.Color(255, 255, 255));
        propertiesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings_25px.png"))); // NOI18N
        propertiesButton.setText("Properties");
        propertiesButton.setBorderPainted(false);

        loginButton.setBackground(new java.awt.Color(0, 83, 255));
        loginButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter_25px.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel5.setToolTipText("");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guest.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(propertiesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)))
                .addGap(54, 54, 54)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propertiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 75, 225));

        jPanel8.setBackground(new java.awt.Color(0, 75, 225));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opzioni infermiere");

        nuovoPazienteButton.setBackground(new java.awt.Color(0, 83, 255));
        nuovoPazienteButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        nuovoPazienteButton.setForeground(new java.awt.Color(255, 255, 255));
        nuovoPazienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add User Male_25px.png"))); // NOI18N
        nuovoPazienteButton.setText("Nuovo Paziente");
        nuovoPazienteButton.setBorderPainted(false);

        somministrazioneButton.setBackground(new java.awt.Color(0, 83, 255));
        somministrazioneButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        somministrazioneButton.setForeground(new java.awt.Color(255, 255, 255));
        somministrazioneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pill_25px.png"))); // NOI18N
        somministrazioneButton.setText("Aggiungi somministrazione");
        somministrazioneButton.setBorderPainted(false);
        somministrazioneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somministrazioneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(somministrazioneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nuovoPazienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(somministrazioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 75, 225));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opzioni medico");

        diagnosiButton.setBackground(new java.awt.Color(0, 83, 255));
        diagnosiButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        diagnosiButton.setForeground(new java.awt.Color(255, 255, 255));
        diagnosiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Stethoscope_25px.png"))); // NOI18N
        diagnosiButton.setText("Diagnosi");
        diagnosiButton.setBorderPainted(false);

        prescrizioneButton.setBackground(new java.awt.Color(0, 83, 255));
        prescrizioneButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        prescrizioneButton.setForeground(new java.awt.Color(255, 255, 255));
        prescrizioneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Treatment_25px.png"))); // NOI18N
        prescrizioneButton.setText("Aggiungi prescrizione");
        prescrizioneButton.setBorderPainted(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(diagnosiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prescrizioneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(diagnosiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prescrizioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(0, 75, 225));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Opzioni primario");

        dimettiButton.setBackground(new java.awt.Color(0, 83, 255));
        dimettiButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        dimettiButton.setForeground(new java.awt.Color(255, 255, 255));
        dimettiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Denied_25px.png"))); // NOI18N
        dimettiButton.setText("Dimetti paziente");
        dimettiButton.setBorderPainted(false);

        reportButton.setBackground(new java.awt.Color(0, 83, 255));
        reportButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Schedule_25px.png"))); // NOI18N
        reportButton.setText("Report settimanale");
        reportButton.setBorderPainted(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(reportButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dimettiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(dimettiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        tabellaTelemetria.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tabellaTelemetria.setModel(new javax.swing.table.DefaultTableModel(
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabellaPazienti.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
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
                {null, null, null, null, null, null},
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("Numero pazienti: ");

        numeroPazientiLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        numeroPazientiLabel.setText("0");

        storicoButton.setBackground(new java.awt.Color(0, 83, 255));
        storicoButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        storicoButton.setForeground(new java.awt.Color(255, 255, 255));
        storicoButton.setText("Visualizza storico");
        storicoButton.setBorderPainted(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("Paziente: ");

        pazienteLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        pazienteLabel.setText("selezionare paz.");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Status:");

        rapportoButton.setBackground(new java.awt.Color(0, 83, 255));
        rapportoButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rapportoButton.setForeground(new java.awt.Color(255, 255, 255));
        rapportoButton.setText("Rapp. dettagliato");
        rapportoButton.setBorderPainted(false);
        rapportoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapportoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pazienteLabel)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rapportoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(numeroPazientiLabel)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPazientiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pazienteLabel)
                    .addComponent(jLabel3)
                    .addComponent(rapportoButton)
                    .addComponent(storicoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somministrazioneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somministrazioneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_somministrazioneButtonActionPerformed

    private void tabellaPazientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabellaPazientiMouseClicked

        updateTelemetria();
    }//GEN-LAST:event_tabellaPazientiMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void rapportoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapportoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rapportoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagnosiButton;
    private javax.swing.JButton dimettiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
            switch(utenteCorrente.getRuolo().toString()){
                case "Infermiere":
                    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inferm.png")));
                    break;
                case "Medico":
                    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doc.png")));
                    break;
                case "Primario":
                    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primario.png")));
                    break;
            }
            loginButton.setText("Logout");
            loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit_25px.png")));
        } else {
            utenteLabel.setText("Guest");
            ruoloLabel.setText("Guest");
            loginButton.setText("Login");
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guest.png")));
            loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter_25px.png")));
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
            case Primario:
                dimettiButton.setEnabled(true);
                reportButton.setEnabled(true);
            case Medico:
                diagnosiButton.setEnabled(true);
                prescrizioneButton.setEnabled(true);
                rapportoButton.setEnabled(true);
                storicoButton.setEnabled(true);
                somministrazioneButton.setEnabled(false);
                nuovoPazienteButton.setEnabled(false);
                break;
            case Infermiere:
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
