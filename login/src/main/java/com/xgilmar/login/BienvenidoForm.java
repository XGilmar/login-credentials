package com.xgilmar.login;

import java.awt.Color;

public class BienvenidoForm extends javax.swing.JDialog {

    public BienvenidoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new componentes.PanelGradient();
        button1 = new componentes.Button();
        jLabel2 = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelGradient1.setRadius(20);

        button1.setBackground(new java.awt.Color(102, 102, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Aceptar");
        button1.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panelGradient1.add(button1);
        button1.setBounds(145, 190, 110, 43);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(90, 50, 220, 40);

        LabelUser.setBackground(new java.awt.Color(255, 255, 255));
        LabelUser.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(153, 153, 153));
        LabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUser.setText("Anonimo");
        panelGradient1.add(LabelUser);
        LabelUser.setBounds(90, 130, 220, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabelUser;
    private componentes.Button button1;
    private javax.swing.JLabel jLabel2;
    private componentes.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables
}
