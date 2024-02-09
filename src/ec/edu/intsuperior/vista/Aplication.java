/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.controlador.Conexion;
import ec.edu.intsuperior.controlador.Controladdor;

/**
 *
 * @author HP
 */
public class Aplication {
    public static void main(String[] args) {
        Controladdor controladdor= new Controladdor();
        controladdor.mostrarFCRUD();
    }   
}
