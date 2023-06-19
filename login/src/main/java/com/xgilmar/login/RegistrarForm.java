package com.xgilmar.login;

import com.xgilmar.dao.UsuarioDAO;
import com.xgilmar.modelo.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegistrarForm extends javax.swing.JFrame {

    private final Usuario usuario = new Usuario();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public RegistrarForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        //panelFancy1.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new componentes.PanelGradient();
        panelGradient2 = new componentes.PanelGradient();
        imageAvatar1 = new componentes.ImageAvatar();
        imageAvatar2 = new componentes.ImageAvatar();
        imageAvatar3 = new componentes.ImageAvatar();
        panelFancy1 = new componentes.PanelFancy();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_usuario = new componentes.TextFieldShadown();
        txt_password = new componentes.PasswordField();
        btn_registrar = new componentes.Button();
        minJframe = new javax.swing.JLabel();
        cerrarJframe = new javax.swing.JLabel();
        txt_nombreCompleto = new componentes.TextFieldShadown();
        jLabel36 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_volver = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(876, 604));
        setUndecorated(true);

        panelGradient1.setMinimumSize(new java.awt.Dimension(876, 604));
        panelGradient1.setRadius(20);

        panelGradient2.setBackground(new java.awt.Color(102, 102, 255));
        panelGradient2.setColorGradient(new java.awt.Color(178, 178, 255));
        panelGradient2.setRadius(20);

        imageAvatar1.setBorderSize(3);
        imageAvatar1.setBorderSpace(2);
        imageAvatar1.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Indian Man.png"))); // NOI18N
        panelGradient2.add(imageAvatar1);
        imageAvatar1.setBounds(270, 70, 120, 90);

        imageAvatar2.setBorderSize(3);
        imageAvatar2.setBorderSpace(2);
        imageAvatar2.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar2.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Western Man.png"))); // NOI18N
        panelGradient2.add(imageAvatar2);
        imageAvatar2.setBounds(30, 70, 120, 90);

        imageAvatar3.setBorderSize(3);
        imageAvatar3.setBorderSpace(2);
        imageAvatar3.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar3.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/College Student.png"))); // NOI18N
        panelGradient2.add(imageAvatar3);
        imageAvatar3.setBounds(150, 70, 120, 90);

        panelFancy1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/portada.JPG"))); // NOI18N
        panelGradient2.add(panelFancy1);
        panelFancy1.setBounds(10, 170, 420, 380);

        panelGradient1.add(panelGradient2);
        panelGradient2.setBounds(10, 10, 440, 585);

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(132, 132, 132));
        jLabel35.setText("Primer nombre y apellido");
        panelGradient1.add(jLabel35);
        jLabel35.setBounds(485, 180, 150, 17);

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(132, 132, 132));
        jLabel32.setText("Contraseña");
        panelGradient1.add(jLabel32);
        jLabel32.setBounds(485, 330, 150, 17);

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panelGradient1.add(txt_usuario);
        txt_usuario.setBounds(480, 270, 370, 45);

        txt_password.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panelGradient1.add(txt_password);
        txt_password.setBounds(480, 350, 370, 45);

        btn_registrar.setBackground(new java.awt.Color(102, 102, 255));
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        panelGradient1.add(btn_registrar);
        btn_registrar.setBounds(480, 410, 370, 50);

        minJframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minJframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minus.png"))); // NOI18N
        minJframe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minJframeMouseClicked(evt);
            }
        });
        panelGradient1.add(minJframe);
        minJframe.setBounds(785, 5, 40, 24);

        cerrarJframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarJframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/close_big.png"))); // NOI18N
        cerrarJframe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarJframeMouseClicked(evt);
            }
        });
        panelGradient1.add(cerrarJframe);
        cerrarJframe.setBounds(830, 5, 40, 24);

        txt_nombreCompleto.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panelGradient1.add(txt_nombreCompleto);
        txt_nombreCompleto.setBounds(480, 200, 370, 45);

        jLabel36.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(132, 132, 132));
        jLabel36.setText("Usuario");
        panelGradient1.add(jLabel36);
        jLabel36.setBounds(485, 250, 150, 17);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Empezar");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(480, 70, 190, 40);

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(132, 132, 132));
        jLabel33.setText("Cree su cuenta ahora");
        panelGradient1.add(jLabel33);
        jLabel33.setBounds(483, 130, 150, 17);

        btn_volver.setText("Volver");
        btn_volver.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        panelGradient1.add(btn_volver);
        btn_volver.setBounds(480, 470, 370, 45);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        registrarUsuario();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void minJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minJframeMouseClicked
        this.setState(RegistrarForm.ICONIFIED);
    }//GEN-LAST:event_minJframeMouseClicked

    private void cerrarJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarJframeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarJframeMouseClicked

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void registrarUsuario() {
        if (txt_usuario.getText().isEmpty() || txt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agrega un usuario y contraseña");
        } else {
            usuario.setNombreCompleto(txt_nombreCompleto.getText());
            usuario.setUsuario(txt_usuario.getText());
            usuario.setContrasena(txt_password.getText());
            usuarioDAO.registrarUsuario(usuario);
            limpiarCampos();
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
            this.dispose();
        }
    }

    private void limpiarCampos() {
        txt_nombreCompleto.setText("");
        txt_usuario.setText("");
        txt_password.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button btn_registrar;
    private componentes.Button btn_volver;
    private javax.swing.JLabel cerrarJframe;
    private componentes.ImageAvatar imageAvatar1;
    private componentes.ImageAvatar imageAvatar2;
    private componentes.ImageAvatar imageAvatar3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel minJframe;
    private componentes.PanelFancy panelFancy1;
    private componentes.PanelGradient panelGradient1;
    private componentes.PanelGradient panelGradient2;
    private componentes.TextFieldShadown txt_nombreCompleto;
    private componentes.PasswordField txt_password;
    private componentes.TextFieldShadown txt_usuario;
    // End of variables declaration//GEN-END:variables
}
