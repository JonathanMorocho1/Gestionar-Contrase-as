/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ANDRES
 */
public class ConexionBD {
    private static final String Base = "gestionarcontraseñas";//NOMBRE DE LA BASE DE DATOS EN MYSQL
    private static final String usuario = "root";//USUARIO PARA INGRESAR A MYSQL
    private static final String contraseña = "1234";//CONTRASEÑA PARA INGRESAR A MYSQL
    private static final String lineaBase = "jdbc:mysql://localhost:3306/" + Base + "?serverTimezone=UTC";//DIRECCION PARA PODER CONECTARSE A MYSQL
    private Connection connect = null;//objeto utilizado para proporcionar un vínculo entre las bases de datos y una aplicación en Java

    public Connection ConexionBD() {
        try {   
            connect = DriverManager.getConnection(lineaBase, usuario, contraseña);//gestiona el conjunto de controladores Java 
                                                                                  //Database Connectivity (JDBC)
            if (connect != null) {
                System.out.println("Conexion Establecida");
                return connect;
            }
        } catch (Exception e) {
            System.out.println("Error al conectar\n" + e.getMessage());

        }
        return connect;
    }
}
