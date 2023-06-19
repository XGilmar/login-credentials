package com.xgilmar.login;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        FlatIntelliJLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaderForm().setVisible(true);

            }
        });
    }
}
