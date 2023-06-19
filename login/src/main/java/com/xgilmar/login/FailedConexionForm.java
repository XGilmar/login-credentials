package com.xgilmar.login;

import com.xgilmar.util.ConexionSQL;

public class FailedConexionForm extends javax.swing.JFrame {

    private final ConexionSQL conexionSQL = new ConexionSQL();

    public FailedConexionForm() {
        initComponents();

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new componentes.PanelGradient();
        jLabel1 = new javax.swing.JLabel();
        lblTransFecha4 = new javax.swing.JLabel();
        lblTransFecha5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_reintentar = new componentes.Button();
        btn_salir = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 293));
        setUndecorated(true);

        panelGradient1.setBackground(new java.awt.Color(31, 152, 214));
        panelGradient1.setColorGradient(new java.awt.Color(186, 231, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FAILED CONEXIÓN");
        panelGradient1.add(jLabel1);
        jLabel1.setBounds(100, 20, 310, 40);

        lblTransFecha4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblTransFecha4.setForeground(new java.awt.Color(255, 255, 255));
        lblTransFecha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransFecha4.setText("No se pudo conectar con la base de datos.");
        panelGradient1.add(lblTransFecha4);
        lblTransFecha4.setBounds(100, 180, 310, 19);

        lblTransFecha5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lblTransFecha5.setForeground(new java.awt.Color(255, 255, 255));
        lblTransFecha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransFecha5.setText("Por favor, inténtalo de nuevo más tarde.");
        panelGradient1.add(lblTransFecha5);
        lblTransFecha5.setBounds(100, 195, 310, 19);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no-content.png"))); // NOI18N
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(100, 65, 310, 110);

        btn_reintentar.setText("Reintentar");
        btn_reintentar.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        btn_reintentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reintentarActionPerformed(evt);
            }
        });
        panelGradient1.add(btn_reintentar);
        btn_reintentar.setBounds(250, 225, 100, 41);

        btn_salir.setBackground(new java.awt.Color(51, 131, 255));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Cerrar");
        btn_salir.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panelGradient1.add(btn_salir);
        btn_salir.setBounds(150, 225, 100, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_reintentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reintentarActionPerformed
        LoaderForm loaderInicio = new LoaderForm();
        loaderInicio.setVisible(true);
        conexionSQL.setConectado(false);
        this.dispose();
    }//GEN-LAST:event_btn_reintentarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button btn_reintentar;
    private componentes.Button btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel lblTransFecha4;
    public static javax.swing.JLabel lblTransFecha5;
    private componentes.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables

}
