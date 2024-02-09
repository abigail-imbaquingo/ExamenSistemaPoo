/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Formulario_CRUD;

/**
 *
 * @author HP
 */
public class Controladdor {
    Formulario_CRUD fcrud= new Formulario_CRUD(this);
    
    public void mostrarFCRUD(){
        fcrud.setVisible(true);
    }
    
    public void cerrarFCRUD(){
        fcrud.setVisible(false);
    }
}
