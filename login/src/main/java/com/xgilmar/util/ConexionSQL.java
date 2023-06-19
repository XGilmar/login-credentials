package com.xgilmar.util;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionSQL {

    private static final String url = "jdbc:mysql://localhost:3306/login_java?useTimeZone=true&serverTimeZone=UTC-5";
    private static final String username = "root";
    private static final String password = "root2001";
    private static BasicDataSource poolConexion;
    private static boolean conectado;

    public ConexionSQL() {
    }

    public static boolean isConectado() {
        return conectado;
    }

    public static void setConectado(boolean conectado) {
        ConexionSQL.conectado = conectado;
    }

    public static BasicDataSource getInstance() throws SQLException {
        if (poolConexion == null) {
            poolConexion = new BasicDataSource();
            poolConexion.setUrl(url);
            poolConexion.setUsername(username);
            poolConexion.setPassword(password);
            poolConexion.setInitialSize(1);// iniciamos con 3 conexiones abiertas
            poolConexion.setMinIdle(1); // minima de conexiones inactivas a esperar utilizar
            poolConexion.setMaxIdle(2); // 8 conexiones max inactivas
            poolConexion.setMaxTotal(2); //8 conexiones max activas

        }
        return poolConexion;
    }

    public static Connection getConnectionPool() throws SQLException {
        int maxIntentos = 1;
        int intentos = 0;
        while (intentos < maxIntentos) {
            try {
                return getInstance().getConnection();

            } catch (SQLException e) {
                System.err.println("Error al intentar conectar con la base de datos. Intento " + (intentos + 1) + " de " + maxIntentos);
                intentos++;
                try {
                    Thread.sleep(1000); // Pausa de 1 segundos antes de intentar de nuevo
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }

        }

        if (intentos == maxIntentos) {
            setConectado(true);
        }

        return null;

    }
}
