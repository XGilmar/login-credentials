package com.xgilmar.dao;

import com.xgilmar.modelo.Usuario;
import com.xgilmar.util.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection getConnection() throws SQLException {
        return ConexionSQL.getConnectionPool();
    }

    public int registrarUsuario(Usuario usuario) {
        int rsu = 0;
        String sql = "INSERT INTO usuarios" + "(nombre_completo, usuario, contrasena) VALUES(?, ?, ?)";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombreCompleto());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getContrasena());
            rsu = stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return rsu;
    }

    public Usuario validarDatos(String correo, String pass) {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            try ( ResultSet resultado = stmt.executeQuery()) {
                while (resultado.next()) {
                    usuario.setId(resultado.getInt("idusuarios"));
                    usuario.setNombreCompleto(resultado.getString("nombre_completo"));
                    usuario.setUsuario(resultado.getString("usuario"));
                    usuario.setContrasena(resultado.getString("contrasena"));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return usuario;
    }

    public boolean validarNuevoUsuario() {
        String sql = "SELECT COUNT(*) FROM usuarios";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql);  ResultSet resultado = stmt.executeQuery()) {
            if (resultado.next()) {
                int cantidadRegistros = resultado.getInt(1);
                return cantidadRegistros == 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
        return false;
    }

}
