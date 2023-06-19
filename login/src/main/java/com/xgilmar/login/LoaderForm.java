package com.xgilmar.login;

import com.xgilmar.dao.UsuarioDAO;
import com.xgilmar.util.ConexionSQL;
import com.xgilmar.util.MiUrl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoaderForm extends javax.swing.JFrame implements Runnable {

    private final Thread h1;
    private final ConexionSQL conexionSQL = new ConexionSQL();
    private final MiUrl miUrl = new MiUrl();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    private Connection obtenerConexion() throws SQLException {
        return ConexionSQL.getConnectionPool();

    }

    public LoaderForm() {
        initComponents();
        panelFancy1.start();
        h1 = new Thread(this);
        h1.start();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new componentes.PanelGradient();
        panelFancy1 = new componentes.PanelFancy();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTransFecha4 = new javax.swing.JLabel();
        lblTransFecha3 = new javax.swing.JLabel();
        inicioBarrita = new javax.swing.JProgressBar();
        lbl_inicioBarrita = new javax.swing.JLabel();
        lbl_redesOne = new javax.swing.JLabel();
        lbl_redesTwo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 293));
        setUndecorated(true);

        panelGradient1.setBackground(new java.awt.Color(31, 152, 214));
        panelGradient1.setColorGradient(new java.awt.Color(186, 231, 255));
        panelGradient1.add(panelFancy1);
        panelFancy1.setBounds(290, 50, 200, 180);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Versión: 2023.1");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(32, 50, 90, 15);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("BIENVENIDO");
        panelGradient1.add(jLabel1);
        jLabel1.setBounds(30, 70, 220, 40);

        lblTransFecha4.setForeground(new java.awt.Color(255, 255, 255));
        lblTransFecha4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTransFecha4.setText("Esta es una aplicación diseñada para");
        panelGradient1.add(lblTransFecha4);
        lblTransFecha4.setBounds(32, 110, 230, 16);

        lblTransFecha3.setForeground(new java.awt.Color(255, 255, 255));
        lblTransFecha3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTransFecha3.setText("brindarte una experiencia fácil y eficiente.");
        panelGradient1.add(lblTransFecha3);
        lblTransFecha3.setBounds(32, 127, 230, 16);

        inicioBarrita.setBackground(new java.awt.Color(31, 152, 214));
        inicioBarrita.setForeground(new java.awt.Color(255, 255, 255));
        panelGradient1.add(inicioBarrita);
        inicioBarrita.setBounds(30, 250, 160, 5);

        lbl_inicioBarrita.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        lbl_inicioBarrita.setForeground(new java.awt.Color(255, 255, 255));
        lbl_inicioBarrita.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_inicioBarrita.setText("Iniciando");
        panelGradient1.add(lbl_inicioBarrita);
        lbl_inicioBarrita.setBounds(30, 260, 320, 20);

        lbl_redesOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/GitHub.png"))); // NOI18N
        lbl_redesOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_redesOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_redesOneMouseClicked(evt);
            }
        });
        panelGradient1.add(lbl_redesOne);
        lbl_redesOne.setBounds(32, 150, 35, 35);

        lbl_redesTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linkedin.png"))); // NOI18N
        lbl_redesTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_redesTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_redesTwoMouseClicked(evt);
            }
        });
        panelGradient1.add(lbl_redesTwo);
        lbl_redesTwo.setBounds(70, 150, 34, 35);

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

    private void lbl_redesOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_redesOneMouseClicked
        miUrl.MiDireccion("https://github.com/XGilmar");
    }//GEN-LAST:event_lbl_redesOneMouseClicked

    private void lbl_redesTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_redesTwoMouseClicked
        miUrl.MiDireccion("https://www.linkedin.com/in/gilmarescudero/");
    }//GEN-LAST:event_lbl_redesTwoMouseClicked

    public void correrBarrita() throws Exception {
        for (int i = 0; i <= 100; i++) {
            if (i >= 1 && i <= 20) {
                clienteTask("Iniciando", i);
            } else if (i > 20 && i <= 50) {
                clienteTask("Cargando datos...", i);
                if (i == 21) {
                    obtenerConexion();
                    if (conexionSQL.isConectado()) {
                        FailedConexionForm failedConexion = new FailedConexionForm();
                        failedConexion.setVisible(true);
                        this.dispose();
                        break;
                    }
                }
            } else if (i > 50 && i <= 70) {
                clienteTask("Listando..", i);
            } else if (i > 70 && i <= 95) {
                clienteTask("Completando..", i);
            } else if (i > 95 && i <= 100) {
                clienteTask("Listo.", i);
                if (i == 100) {
                    if (usuarioDAO.validarNuevoUsuario()) {
                        RegistrarForm registrar = new RegistrarForm();
                        registrar.setVisible(true);
                    } else {
                        LoginForm inicio = new LoginForm();
                        inicio.setVisible(true);
                    }
                    this.dispose();
                }
            }
        }

    }

    private void clienteTask(String taskName, int progress) throws Exception {
        lbl_inicioBarrita.setText(taskName);
        Thread.sleep(100); //  For Test
        inicioBarrita.setValue(progress);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar inicioBarrita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel lblTransFecha3;
    public static javax.swing.JLabel lblTransFecha4;
    private javax.swing.JLabel lbl_inicioBarrita;
    private javax.swing.JLabel lbl_redesOne;
    private javax.swing.JLabel lbl_redesTwo;
    private componentes.PanelFancy panelFancy1;
    private componentes.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            correrBarrita();
        } catch (Exception ex) {
            Logger.getLogger(LoaderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
