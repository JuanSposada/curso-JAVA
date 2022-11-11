/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoriasapp;

/**
 *
 * @author J Sebastian M Posada
 */
public class Asesor extends Persona {
    
    /*atributos*/
    int aula = 0;
    int hora = 0;
    String materia = null;
    
    /**constructor*/
    
    /**
     * constructor por default
     */
    Asesor(){
        super();
        hora = Metodos.generaNumeroAleatorio(13, 21);
        aula = Metodos.generaNumeroAleatorio(1, 24);
        materia = Metodos.MATERIAS[Metodos.generaNumeroAleatorio(0, Metodos.MATERIAS.length -1)];
       
    }
    
    /**
     * Este es el consructor de Asesor con valores de entrada
     * @param nombre
     * @param apellido
     * @param hora
     * @param aula
     * @param materia 
     */
    Asesor(String nombre, String apellido, int hora, int aula, String materia){
        super();
        this.hora= hora;
        this.aula = aula;
        this.materia = materia;
    }
    
    /*Metodos*/
    
    /**
     * metodo sobreescrito que te arroja la informacion del asesor
     * @return 
     */
    @Override
    public String toString(){
        return "ASESOR: " +super.nombre +" " +super.apellido +" MATERIA: " +materia +" AULA: " +aula +" HORA:  " +hora;
    }
        
}
