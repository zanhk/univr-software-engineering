package org.zank.icu.gui;

import org.zank.icu.utility.PropertyManager;
import org.zank.icu.utility.Utility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PropertiesSetter extends javax.swing.JPanel implements ChangeListener, ActionListener {

    PropertyManager properties;

    public PropertiesSetter() {
        initComponents();

        properties = PropertyManager.getInstance();

        DBPSlider.addChangeListener(this);
        SBPSlider.addChangeListener(this);
        BPMSlider.addChangeListener(this);
        TEMPSlider.addChangeListener(this);

        confermaButton.addActionListener(this);
        annullaButton.addActionListener(this);

        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        SBPSlider = new javax.swing.JSlider();
        BPMSlider = new javax.swing.JSlider();
        DBPSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TEMPSlider = new javax.swing.JSlider();
        SBPLabel = new javax.swing.JLabel();
        DBPLabel = new javax.swing.JLabel();
        BPMLabel = new javax.swing.JLabel();
        TEMPLabel = new javax.swing.JLabel();
        confermaButton = new javax.swing.JButton();
        annullaButton = new javax.swing.JButton();
        alarmCheckbox = new javax.swing.JCheckBox();
        SBPandDBP_Checkbox = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(255, 255, 255));

        SBPSlider.setBackground(new java.awt.Color(255, 255, 255));
        SBPSlider.setMaximum(300);
        SBPSlider.setMinimum(1);
        SBPSlider.setValue(120);

        BPMSlider.setBackground(new java.awt.Color(255, 255, 255));
        BPMSlider.setMaximum(300);
        BPMSlider.setMinimum(1);
        BPMSlider.setValue(300);

        DBPSlider.setBackground(new java.awt.Color(255, 255, 255));
        DBPSlider.setMaximum(300);
        DBPSlider.setMinimum(1);
        DBPSlider.setValue(120);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("SBP");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setText("DBP");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("BPM");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("TEMP");

        TEMPSlider.setBackground(new java.awt.Color(255, 255, 255));
        TEMPSlider.setMaximum(300);
        TEMPSlider.setMinimum(1);
        TEMPSlider.setValue(180);

        SBPLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        SBPLabel.setText("120");

        DBPLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        DBPLabel.setText("120");

        BPMLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        BPMLabel.setText("300");

        TEMPLabel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TEMPLabel.setText("180");

        confermaButton.setBackground(new java.awt.Color(0, 83, 255));
        confermaButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        confermaButton.setForeground(new java.awt.Color(255, 255, 255));
        confermaButton.setText("Conferma");
        confermaButton.setBorderPainted(false);

        annullaButton.setBackground(new java.awt.Color(255, 255, 255));
        annullaButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        annullaButton.setText("Annulla");
        annullaButton.setBorderPainted(false);

        alarmCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        alarmCheckbox.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        alarmCheckbox.setText("Allarmi");

        SBPandDBP_Checkbox.setBackground(new java.awt.Color(255, 255, 255));
        SBPandDBP_Checkbox.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        SBPandDBP_Checkbox.setText("SBP & DBP");
        SBPandDBP_Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBPandDBP_CheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alarmCheckbox)
                        .addGap(18, 18, 18)
                        .addComponent(SBPandDBP_Checkbox))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DBPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DBPLabel)
                            .addComponent(SBPLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TEMPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BPMSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BPMLabel)
                                .addComponent(TEMPLabel)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBPandDBP_Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TEMPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SBPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DBPSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BPMSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SBPLabel)
                                .addGap(18, 18, 18)
                                .addComponent(DBPLabel)
                                .addGap(18, 18, 18)
                                .addComponent(BPMLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEMPLabel)))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annullaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SBPandDBP_CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBPandDBP_CheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SBPandDBP_CheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPMLabel;
    private javax.swing.JSlider BPMSlider;
    private javax.swing.JLabel DBPLabel;
    private javax.swing.JSlider DBPSlider;
    private javax.swing.JLabel SBPLabel;
    private javax.swing.JSlider SBPSlider;
    private javax.swing.JCheckBox SBPandDBP_Checkbox;
    private javax.swing.JLabel TEMPLabel;
    private javax.swing.JSlider TEMPSlider;
    private javax.swing.JCheckBox alarmCheckbox;
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent ce) {
        JSlider slider = (JSlider) ce.getSource();
        updateGUI(slider);
    }

    private void init() {
        SBPSlider.setValue(Integer.parseInt(properties.getValue("SBP")));
        DBPSlider.setValue(Integer.parseInt(properties.getValue("DBP")));
        BPMSlider.setValue(Integer.parseInt(properties.getValue("BPM")));
        TEMPSlider.setValue(Integer.parseInt(properties.getValue("TEMP")));
        alarmCheckbox.setSelected(properties.getValue("alarm").equals("on"));
        updateGUI(null);
    }

    private void updateGUI(JSlider slider) {
        if (slider != null && (slider.equals(SBPSlider) || slider.equals(DBPSlider)) && SBPandDBP_Checkbox.isSelected()) {
            SBPSlider.setValue(slider.getValue());
            DBPSlider.setValue(slider.getValue());
            SBPLabel.setText(String.valueOf(slider.getValue()));
            DBPLabel.setText(String.valueOf(slider.getValue()));
        }
        SBPLabel.setText(String.valueOf(SBPSlider.getValue()));
        DBPLabel.setText(String.valueOf(DBPSlider.getValue()));
        BPMLabel.setText(String.valueOf(BPMSlider.getValue()));
        TEMPLabel.setText(String.valueOf(TEMPSlider.getValue()));
    }

    private void salvaProperties() {
        properties.setValue("SBP", String.valueOf(SBPSlider.getValue()));
        properties.setValue("DBP", String.valueOf(DBPSlider.getValue()));
        properties.setValue("BPM", String.valueOf(BPMSlider.getValue()));
        properties.setValue("TEMP", String.valueOf(TEMPSlider.getValue()));
        if(alarmCheckbox.isSelected())
            properties.setValue("alarm", "on");
        else
            properties.setValue("alarm", "off");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "Conferma":
                salvaProperties();
                Utility.chiudiDialog(ae);
                break;
            case "Annulla":
                Utility.chiudiDialog(ae);
                break;
        }
    }

}
