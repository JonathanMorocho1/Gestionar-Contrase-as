/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import com.istloja.modelo.Usuarios;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ANDRES
 */
public class Contraseñas {
    private JTextField txtNombreSitioWeb;
    private JTextField txtDireccionSitioWeb;
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JTextField txtCorreoRecuperacion;
    private JFrame frameGestionarContraseñas;

    public Contraseñas(JTextField txtNombreSitioWeb, JTextField txtDireccionSitioWeb,
            JTextField txtUsuario, JPasswordField txtContraseña, JTextField txtCorreoRecuperacion, JFrame frameGestionarContraseñas) {
        this.txtNombreSitioWeb = txtNombreSitioWeb;
        this.txtDireccionSitioWeb = txtDireccionSitioWeb;
        this.txtUsuario = txtUsuario;
        this.txtContraseña = txtContraseña;
        this.txtCorreoRecuperacion = txtCorreoRecuperacion;
        this.frameGestionarContraseñas = frameGestionarContraseñas;
    }

    
    public JTextField getTxtNombreSitioWeb() {
        return txtNombreSitioWeb;
    }

    public void setTxtNombreSitioWeb(JTextField txtNombreSitioWeb) {
        this.txtNombreSitioWeb = txtNombreSitioWeb;
    }

    public JTextField getTxtDireccionSitioWeb() {
        return txtDireccionSitioWeb;
    }

    public void setTxtDireccionSitioWeb(JTextField txtDireccionSitioWeb) {
        this.txtDireccionSitioWeb = txtDireccionSitioWeb;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JPasswordField getTxtContraseña() {
        return txtContraseña;
    }

    public void setTxtContraseña(JPasswordField txtContraseña) {
        this.txtContraseña = txtContraseña;
    }

    public JTextField getTxtCorreoRecuperacion() {
        return txtCorreoRecuperacion;
    }

    public void setTxtCorreoRecuperacion(JTextField txtCorreoRecuperacion) {
        this.txtCorreoRecuperacion = txtCorreoRecuperacion;
    }

    public JFrame getFrameGestionarContraseñas() {
        return frameGestionarContraseñas;
    }

    public void setFrameGestionarContraseñas(JFrame frameGestionarContraseñas) {
        this.frameGestionarContraseñas = frameGestionarContraseñas;
    }
    
    public Usuarios guardarContraseñas(boolean EditarContraseñas){
        
        Usuarios usuarios = new Usuarios();
        usuarios.setNombresSitioWeb(txtNombreSitioWeb.getText());
        usuarios.setDireccionWeb(txtDireccionSitioWeb.getText());
        usuarios.setUsuario(txtUsuario.getText());
        usuarios.setContraseña(txtContraseña.getText());
        usuarios.setCorreo_recuperacion(txtCorreoRecuperacion.getText());
        usuarios.setFecha_registro(new Date());        
        System.out.println(usuarios.toString());
        //return usuarios;
        return usuarios;
    }
}
