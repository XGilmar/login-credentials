package com.xgilmar.modelo;

public class Credenciales {

    private int idRecordar;
    private String recordarUsuario;
    private String recordarContrasena;

    public Credenciales() {
    }

    public Credenciales(int idRecordar, String recordarUsuario, String recordarContrasena) {
        this.idRecordar = idRecordar;
        this.recordarUsuario = recordarUsuario;
        this.recordarContrasena = recordarContrasena;
    }

    public int getIdRecordar() {
        return idRecordar;
    }

    public void setIdRecordar(int idRecordar) {
        this.idRecordar = idRecordar;
    }

    public String getRecordarUsuario() {
        return recordarUsuario;
    }

    public void setRecordarUsuario(String recordarUsuario) {
        this.recordarUsuario = recordarUsuario;
    }

    public String getRecordarContrasena() {
        return recordarContrasena;
    }

    public void setRecordarContrasena(String recordarContrasena) {
        this.recordarContrasena = recordarContrasena;
    }

}
