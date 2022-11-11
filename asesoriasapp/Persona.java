/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoriasapp;

/**
 *Esta es la clase abstracta de persona
 * 
 * @author J Sebastian M Posada
 */
public abstract class Persona {
    
    /* Atributos */
    
    String nombre = null;
    String apellido = null;
    
    
    /* Metodo constructor */
    /**
     * metodo constructor por default
     */
    Persona(){
        nombre = Metodos.NOMBRES[Metodos.generaNumeroAleatorio(0, Metodos.NOMBRES.length-1)];
        apellido = Metodos.APELLIDOS[Metodos.generaNumeroAleatorio(0, Metodos.APELLIDOS.length-1)];
        
    }
    
    /**
     * Metodo constructor
     * @param nombre
     * @param apellido 
     */
    Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido = apellido;}
        
    
}
