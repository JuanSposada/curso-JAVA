/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoriasapp;

/**
 *Esta es la clase Alumno
 * @author J Sebastian M Posada
 */
public class Alumno extends Persona{
    
    /*Atributos*/
    int numControl = 0;
    String materia = null;
    
    /**
     * constructor por default
     */
    Alumno(){
        super();
         numControl= Metodos.generaNumeroAleatorio(0, 1200);
         materia = Metodos.MATERIAS[Metodos.generaNumeroAleatorio(0, Metodos.MATERIAS.length -1)];
         
    }
    /**
     * metodo Constructor
     * @param nombre
     * @param Apellido
     * @param numControl 
     */
    Alumno(String nombre, String apellido, int numControl, String materia){
        super(nombre, apellido);
        this.numControl = numControl;
        this.materia = materia;
       
        
    }
    
    
    /**
     * metodo sobreescrito en el cual se nos arrroja la informcion del alumno
     * @return 
     */
    @Override
    public String toString(){
        return "Alumno: " +super.nombre +" " +super.apellido + "\nmateria:  " +materia +" numero de control: " +numControl;
    }
    
}
