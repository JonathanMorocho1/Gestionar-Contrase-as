/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.ModelTables;

import com.istloja.modelo.Usuarios;
import com.istloja.vistas.GestionarContraseñas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ANDRES
 */
public class ModelTableContraseñas extends AbstractTableModel{
    private String[] m_colNames = {"Fecha Registro","Nombre Sitio Web", "Dirección Web",
        "Usuario", "Contraseña", "Correo de Recuperación"};
    private List<Usuarios>usuarios; //Lista para mostrar personas
    private GestionarContraseñas gContable;
    
    public ModelTableContraseñas(List<Usuarios> usuario,  GestionarContraseñas gContable) {
        this.gContable = gContable;
        this.usuarios = usuario;
    }
    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuarios usuariosContraseña = this.usuarios.get(rowIndex);
        switch(columnIndex){
            case 0:
                return usuariosContraseña.getFecha_registro();
            case 1:
                return usuariosContraseña.getNombresSitioWeb();
            case 2:
                return usuariosContraseña.getDireccionWeb();
            case 3: 
                return usuariosContraseña.getUsuario();
            case 4:
                return usuariosContraseña.getContraseña();
            case 5:
                return usuariosContraseña.getCorreo_recuperacion();
        }
        return new String();
    }
    
    //ESTE METODO SIRVE PARA INGRESAR DEFINIR LOS NOMBRES DE LAS COLUMNAS
    @Override
    public String getColumnName(int column) {
        return m_colNames[column];
    }
    //PARA ELEGIR O SELECCIONAR UNA FILA O COLUMNA
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clickUsuarios(usuarios.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
}
