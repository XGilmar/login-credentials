package com.xgilmar.dao;

import com.xgilmar.modelo.Credenciales;
import com.xgilmar.util.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CredencialesDAO {

    private Connection getConnection() throws SQLException {
        return ConexionSQL.getConnectionPool();
    }

    public void guardarCredenciales(Credenciales valor) {
        String sql = "INSERT INTO credenciales (idcredenciales, usuario_credenciales, contrasena_credenciales) VALUES(?,?,?)";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, valor.getIdRecordar());
            stmt.setString(2, valor.getRecordarUsuario());
            stmt.setString(3, valor.getRecordarContrasena());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public Credenciales obtenerCredenciales() {
        Credenciales credenciales = new Credenciales();
        String sql = "SELECT usuario_credenciales, contrasena_credenciales FROM credenciales";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            try ( ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    credenciales.setRecordarUsuario(resultado.getString("usuario_credenciales"));
                    credenciales.setRecordarContrasena(resultado.getString("contrasena_credenciales"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return credenciales;
    }

    public boolean existeCredenciales() {
        String sql = "SELECT COUNT(*) FROM credenciales";
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

    public void eliminarCredenciales() {
        String sql = "DELETE FROM credenciales";
        try ( Connection conn = getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
