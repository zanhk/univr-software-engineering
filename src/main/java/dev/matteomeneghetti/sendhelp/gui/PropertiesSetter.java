package org.zank.sendhelp.gui;

import org.zank.sendhelp.utility.PropertyManager;
import org.zank.sendhelp.utility.Utility;
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
        sincroButton = new javax.swing.JToggleButton();
        alarmCheckbox = new javax.swing.JCheckBox();

        SBPSlider.setMaximum(300);
        SBPSlider.setMinimum(1);
        SBPSlider.setValue(120);

        BPMSlider.setMaximum(300);
        BPMSlider.setMinimum(1);
        BPMSlider.setValue(300);

        DBPSlider.setMaximum(300);
        DBPSlider.setMinimum(1);
        DBPSlider.setValue(120);

        jLabel1.setText("SBP");

        jLabel2.setText("DBP");

        jLabel3.setText("BPM");

        jLabel4.setText("TEMP");

        TEMPSlider.setMaximum(300);
        TEMPSlider.setMinimum(1);
        TEMPSlider.setValue(180);

        SBPLabel.setText("120");

        DBPLabel.setText("120");

        BPMLabel.setText("300");

        TEMPLabel.setText("180");

        confermaButton.setText("Conferma");

        annullaButton.setText("Annulla");

        sincroButton.setText("SBP & DBP");

        alarmCheckbox.setText("Allarmi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(confermaButton)
                        .addGap(39, 39, 39)
                        .addComponent(annullaButton)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarmCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sincroButton)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(sincroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alarmCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confermaButton)
                    .addComponent(annullaButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPMLabel;
    private javax.swing.JSlider BPMSlider;
    private javax.swing.JLabel DBPLabel;
    private javax.swing.JSlider DBPSlider;
    private javax.swing.JLabel SBPLabel;
    private javax.swing.JSlider SBPSlider;
    private javax.swing.JLabel TEMPLabel;
    private javax.swing.JSlider TEMPSlider;
    private javax.swing.JCheckBox alarmCheckbox;
    private javax.swing.JButton annullaButton;
    private javax.swing.JButton confermaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton sincroButton;
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
        if (slider != null && (slider.equals(SBPSlider) || slider.equals(DBPSlider)) && sincroButton.isSelected()) {
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
