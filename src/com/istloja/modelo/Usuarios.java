/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

import java.util.Date;

//import java.sql.Date;




/**
 *
 * @author ANDRES
 */
public class Usuarios {
    private int idUsuarios;
    private String NombresSitioWeb; 
    private String DireccionWeb;
    private String Usuario;
    private String Contraseña;
    private String Correo_recuperacion;
    private Date fecha_registro;

    public Usuarios(int idUsuarios, String NombresSitioWeb, String DireccionWeb,
            String Usuario, String Contraseña, String Correo_recuperacion, Date fecha_registro) {
        this.idUsuarios = idUsuarios;
        this.NombresSitioWeb = NombresSitioWeb;
        this.DireccionWeb = DireccionWeb;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Correo_recuperacion = Correo_recuperacion;
        this.fecha_registro = fecha_registro;
    }

    public Usuarios() {
        
    }

    
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombresSitioWeb() {
        return NombresSitioWeb;
    }

    public void setNombresSitioWeb(String NombresSitioWeb) {
        this.NombresSitioWeb = NombresSitioWeb;
    }

    public String getDireccionWeb() {
        return DireccionWeb;
    }

    public void setDireccionWeb(String DireccionWeb) {
        this.DireccionWeb = DireccionWeb;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo_recuperacion() {
        return Correo_recuperacion;
    }

    public void setCorreo_recuperacion(String Correo_recuperacion) {
        this.Correo_recuperacion = Correo_recuperacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuarios=" + idUsuarios + ", NombresSitioWeb=" + NombresSitioWeb + ", DireccionWeb=" + DireccionWeb + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Correo_recuperacion=" + Correo_recuperacion + ", fecha_registro=" + fecha_registro + '}';
    }
    
    
}
