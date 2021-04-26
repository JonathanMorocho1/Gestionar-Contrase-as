/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexion.ConexionBD;
import com.istloja.modelo.Usuarios;
import com.istloja.modelo.Utilidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRES
 */
public class Contraseñasbd {
    
    public Utilidades utilidades;

    public Contraseñasbd() {
        utilidades = new Utilidades();
    }
    
    public boolean RegistrarContraseña(Usuarios usuarios){
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos
        Connection con = null;
        //INSERT INTO gestionarcontraseñas
        String sql;
        sql = "INSERT INTO `gestionarcontraseñas`.`usuarios` (`idUsuarios`,`Nombre_sitio_web`,`Direccion_web`, `Usuario`,"
                + " `Contraseña`, `Correo_de_recuperacion`,`fecha_registro`) "
                + "VALUES ('" + String.valueOf(usuarios.getIdUsuarios()) + "','"
                + "" + usuarios.getNombresSitioWeb()+ "', '"
                + "" + usuarios.getDireccionWeb()+ "', '"
                + "" + usuarios.getUsuario()+ "', '"
                + "" + usuarios.getContraseña()+ "', '"
                + "" + usuarios.getCorreo_recuperacion()+ "', '"
                + "" + utilidades.devolverFecha(usuarios.getFecha_registro())+"');";
        try{
            ConexionBD conexion = new ConexionBD();//CREACION DEL OBJETO PARA LLAMAR EL METODO DE CONEXION.
            con = conexion.ConexionBD();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
            //return  true;
        
        }catch(SQLException e){
            System.out.println("Error Clase crear: " +e.getMessage());
        }
        return registrar;
    }//Fin Registrar
    
    
    //Metodo que sirve para obtener todos los registros de la base de datos
    public List<Usuarios> obtenerRegistros() {
        //Conexion con base de datos
        Connection co = null;
        //Preparar los datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM gestionarcontraseñas.usuarios;";
        List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        try {
            co = new ConexionBD().ConexionBD();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Usuarios c = new Usuarios();
                c.setIdUsuarios(rs.getInt(1));
                c.setNombresSitioWeb(rs.getString(2));
                c.setDireccionWeb(rs.getString(3));
                c.setUsuario(rs.getString(4));
                c.setContraseña(rs.getString(5));
                c.setCorreo_recuperacion(rs.getString(6));
                c.setFecha_registro(rs.getDate(7));
                listaUsuarios.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        return listaUsuarios;
    }//Fin traer datos
    
    public boolean editarContraseña(Usuarios usuarios) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `gestionarcontraseñas`.`usuarios` SET `Nombre_sitio_web` = '" + usuarios.getNombresSitioWeb()+ 
               "', `Direccion_web` = '" + usuarios.getDireccionWeb()+ 
               "', `Usuario` = '" + usuarios.getUsuario()+ 
               "', `Contraseña` = '" + usuarios.getContraseña()+ 
               "', `Correo_de_recuperacion` = '" + usuarios.getCorreo_recuperacion()+
                "' WHERE (`idUsuarios` = '"+ usuarios.getIdUsuarios()+ "');";
        try {
            ConexionBD con = new ConexionBD();
            connect = con.ConexionBD();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }
    
    public List<Usuarios> buscarContraseñaNombreSitioWebCombo(String nombre) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Usuarios c = null;
        List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        String sql = "Select * from usuarios WHERE Nombre_sitio_web like \"%"+nombre+"%\";";
        try {
            co = new ConexionBD().ConexionBD();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Usuarios();
                c.setIdUsuarios(rs.getInt(1));
                c.setNombresSitioWeb(rs.getString(2));
                c.setDireccionWeb(rs.getString(3));
                c.setUsuario(rs.getString(4));
                c.setContraseña(rs.getString(5));
                c.setCorreo_recuperacion(rs.getString(6));
                c.setFecha_registro(rs.getDate(7));
                listaUsuarios.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        return listaUsuarios;
    }
    
    public List<Usuarios> buscarUsuariosCombo(String usuario) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Usuarios c = null;
        List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        String sql = "Select * from usuarios WHERE Usuario like \"%"+usuario+"%\";";
        try {
            co = new ConexionBD().ConexionBD();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Usuarios();
                c.setIdUsuarios(rs.getInt(1));
                c.setNombresSitioWeb(rs.getString(2));
                c.setDireccionWeb(rs.getString(3));
                c.setUsuario(rs.getString(4));
                c.setContraseña(rs.getString(5));
                c.setCorreo_recuperacion(rs.getString(6));
                c.setFecha_registro(rs.getDate(7));

                listaUsuarios.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }
        return listaUsuarios;
    }
    
    //Metodo que resive para eliminar una persona
    public boolean EliminarRegistro(Usuarios usuarios){
        boolean eliminar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos
        Connection con = null;
        //INSERT INTO ejercici
        
        
        String sql = "DELETE from `gestionarcontraseñas`.`usuarios` where (`idUsuarios` = '"+String.valueOf(usuarios.getIdUsuarios())+"');";
        try{
            ConexionBD conexion = new ConexionBD();
            con = conexion.ConexionBD();
            stm = con.createStatement();
            stm.execute(sql);
            //eliminar = true;
            //stm.close();
            //con.close();
        
        }catch(SQLException e){
            System.out.println("Error Clase elimar: " +e.getMessage());
        }
    
        return eliminar;
    }//Fin eliminar
}
