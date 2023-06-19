package com.xgilmar.login;

import com.xgilmar.dao.CredencialesDAO;
import com.xgilmar.dao.UsuarioDAO;
import static com.xgilmar.login.BienvenidoForm.LabelUser;
import com.xgilmar.modelo.Credenciales;
import com.xgilmar.modelo.Usuario;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    private Usuario usuario = new Usuario();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private Credenciales credenciales = new Credenciales();
    private final CredencialesDAO credencialesDAO = new CredencialesDAO();
    private int intentosAD;

    public LoginForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        //panelFancy1.start();
        loginLoader.setVisible(false);
        validarCredenciales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new componentes.PanelGradient();
        panelGradient2 = new componentes.PanelGradient();
        imageAvatar2 = new componentes.ImageAvatar();
        imageAvatar3 = new componentes.ImageAvatar();
        imageAvatar1 = new componentes.ImageAvatar();
        panelFancy1 = new componentes.PanelFancy();
        jLabel2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl_registrarNuevaCuenta = new javax.swing.JLabel();
        txt_usuario = new componentes.TextFieldShadown();
        txt_password = new componentes.PasswordField();
        checkRecodar = new javax.swing.JCheckBox();
        btn_iniciarSesion = new componentes.Button();
        minJframe = new javax.swing.JLabel();
        cerrarJframe = new javax.swing.JLabel();
        loginLoader = new javax.swing.JProgressBar();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(876, 604));
        setUndecorated(true);

        panelGradient1.setMinimumSize(new java.awt.Dimension(876, 604));
        panelGradient1.setRadius(20);

        panelGradient2.setBackground(new java.awt.Color(102, 102, 255));
        panelGradient2.setColorGradient(new java.awt.Color(163, 163, 255));
        panelGradient2.setRadius(20);

        imageAvatar2.setBorderSize(3);
        imageAvatar2.setBorderSpace(2);
        imageAvatar2.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar2.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/image 12.png"))); // NOI18N
        panelGradient2.add(imageAvatar2);
        imageAvatar2.setBounds(30, 70, 120, 90);

        imageAvatar3.setBorderSize(3);
        imageAvatar3.setBorderSpace(2);
        imageAvatar3.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar3.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Western Man.png"))); // NOI18N
        panelGradient2.add(imageAvatar3);
        imageAvatar3.setBounds(150, 70, 120, 90);

        imageAvatar1.setBorderSize(3);
        imageAvatar1.setBorderSpace(2);
        imageAvatar1.setGradientColor1(new java.awt.Color(255, 255, 255));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 255, 255));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Indian Man.png"))); // NOI18N
        panelGradient2.add(imageAvatar1);
        imageAvatar1.setBounds(270, 70, 120, 90);

        panelFancy1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Sample 10.png"))); // NOI18N
        panelGradient2.add(panelFancy1);
        panelFancy1.setBounds(10, 170, 420, 380);

        panelGradient1.add(panelGradient2);
        panelGradient2.setBounds(10, 10, 440, 585);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Bienvenido");
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(480, 110, 190, 40);

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(132, 132, 132));
        jLabel33.setText("Inicia sesión con tu cuenta");
        panelGradient1.add(jLabel33);
        jLabel33.setBounds(485, 170, 170, 17);

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(132, 132, 132));
        jLabel35.setText("Usuario");
        panelGradient1.add(jLabel35);
        jLabel35.setBounds(485, 220, 150, 17);

        lbl_registrarNuevaCuenta.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        lbl_registrarNuevaCuenta.setForeground(new java.awt.Color(132, 132, 132));
        lbl_registrarNuevaCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_registrarNuevaCuenta.setText("Registrar nueva cuenta");
        lbl_registrarNuevaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_registrarNuevaCuenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_registrarNuevaCuentaMouseMoved(evt);
            }
        });
        lbl_registrarNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registrarNuevaCuentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_registrarNuevaCuentaMouseExited(evt);
            }
        });
        panelGradient1.add(lbl_registrarNuevaCuenta);
        lbl_registrarNuevaCuenta.setBounds(590, 460, 150, 17);

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panelGradient1.add(txt_usuario);
        txt_usuario.setBounds(480, 240, 370, 45);

        txt_password.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panelGradient1.add(txt_password);
        txt_password.setBounds(480, 320, 370, 45);

        checkRecodar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        checkRecodar.setForeground(new java.awt.Color(150, 150, 150));
        checkRecodar.setText("Recuérdame");
        checkRecodar.setFocusPainted(false);
        panelGradient1.add(checkRecodar);
        checkRecodar.setBounds(485, 370, 100, 19);

        btn_iniciarSesion.setBackground(new java.awt.Color(102, 102, 255));
        btn_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciarSesion.setText("Iniciar sesión");
        btn_iniciarSesion.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        btn_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarSesionActionPerformed(evt);
            }
        });
        panelGradient1.add(btn_iniciarSesion);
        btn_iniciarSesion.setBounds(480, 400, 370, 50);

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

        loginLoader.setBackground(new java.awt.Color(242, 243, 244));
        loginLoader.setForeground(new java.awt.Color(59, 140, 237));
        panelGradient1.add(loginLoader);
        loginLoader.setBounds(565, 500, 200, 4);

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(132, 132, 132));
        jLabel34.setText("Contraseña");
        panelGradient1.add(jLabel34);
        jLabel34.setBounds(485, 300, 150, 17);

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

    private void btn_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarSesionActionPerformed
        validarUsuario();
    }//GEN-LAST:event_btn_iniciarSesionActionPerformed

    private void minJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minJframeMouseClicked
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_minJframeMouseClicked

    private void cerrarJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarJframeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarJframeMouseClicked

    private void lbl_registrarNuevaCuentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarNuevaCuentaMouseMoved
        lbl_registrarNuevaCuenta.setForeground(new Color(31, 152, 214));
    }//GEN-LAST:event_lbl_registrarNuevaCuentaMouseMoved

    private void lbl_registrarNuevaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarNuevaCuentaMouseExited
        lbl_registrarNuevaCuenta.setForeground(new Color(132, 132, 132));
    }//GEN-LAST:event_lbl_registrarNuevaCuentaMouseExited

    private void lbl_registrarNuevaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registrarNuevaCuentaMouseClicked
        RegistrarForm registrar = new RegistrarForm();
        registrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_registrarNuevaCuentaMouseClicked

    private void validarUsuario() {
        String user = txt_usuario.getText();
        String pass = txt_password.getText();
        usuario.setUsuario(user);
        usuario.setContrasena(pass);
        if (!"".equals(user) || !"".equals(pass)) {
            usuario = usuarioDAO.validarDatos(user, pass);
            if (usuario.getUsuario() != null && usuario.getContrasena() != null) {
                finProcesoBarrita();
            } else {
                intentoUsuario();
            }
        } else {

            JOptionPane.showMessageDialog(null, "Complete el usuario y contraseña.");
        }
    }

    private void finProcesoBarrita() {
        Thread taskThread = new Thread(() -> {
            try {
                loginLoader.setVisible(true);
                correrBarrita();
                // Cuando la tarea ha finalizado, oculta el progressbar
            } catch (Exception ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        taskThread.start();
    }

    private void correrBarrita() throws Exception {
        for (int i = 0; i <= 100; i++) {
            usuarioTask(i);
        }
        BienvenidoForm bienvenidoForm = new BienvenidoForm(this, rootPaneCheckingEnabled);
        guardarCredenciales();
        mostrarNombreUsuario(usuario);
        bienvenidoForm.setVisible(true);
        loginLoader.setVisible(false);
        this.dispose();
    }

    private void mostrarNombreUsuario(Usuario role) {
        LabelUser.setText(role.getNombreCompleto());
    }

    private void usuarioTask(int progress) throws Exception {
        Thread.sleep(10); //  For Test
        loginLoader.setValue(progress);
    }

    private void intentoUsuario() {
        if (intentosAD == 3) {
            int option = JOptionPane.showOptionDialog(null, "Se han agotado todos sus intentos.", "Mensaje",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Aceptar"}, "Aceptar");

            if (option == JOptionPane.OK_OPTION) {
                System.exit(0);
                System.out.println("Botón Aceptar presionado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los datos son invalido, \nte queda " + (3 - intentosAD) + " intentos.");
            limpiarCampos();
            intentosAD++;
        }
    }

    private void validarCredenciales() {
        if (!credencialesDAO.existeCredenciales()) {
            checkRecodar.setSelected(true);
            credenciales = credencialesDAO.obtenerCredenciales();
            txt_usuario.setText(credenciales.getRecordarUsuario());
            txt_password.setText(credenciales.getRecordarContrasena());
        } else {
            checkRecodar.setSelected(false);
        }
    }

    private void guardarCredenciales() {
        boolean estadoCheckbox = checkRecodar.isSelected();
        credenciales.setRecordarUsuario(txt_usuario.getText());
        credenciales.setRecordarContrasena(txt_password.getText());
        if (estadoCheckbox && credencialesDAO.existeCredenciales()) {
            credencialesDAO.guardarCredenciales(credenciales);
        } else if (!estadoCheckbox && !credencialesDAO.existeCredenciales()) {
            credencialesDAO.eliminarCredenciales();
        }
    }

    private void limpiarCampos() {
        txt_usuario.setText("");
        txt_password.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button btn_iniciarSesion;
    private javax.swing.JLabel cerrarJframe;
    private javax.swing.JCheckBox checkRecodar;
    private componentes.ImageAvatar imageAvatar1;
    private componentes.ImageAvatar imageAvatar2;
    private componentes.ImageAvatar imageAvatar3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel lbl_registrarNuevaCuenta;
    private javax.swing.JProgressBar loginLoader;
    private javax.swing.JLabel minJframe;
    private componentes.PanelFancy panelFancy1;
    private componentes.PanelGradient panelGradient1;
    private componentes.PanelGradient panelGradient2;
    private componentes.PasswordField txt_password;
    private componentes.TextFieldShadown txt_usuario;
    // End of variables declaration//GEN-END:variables
}
