/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rally;

/**
 *Esta es una clase que representa a los participantes
 * @author J Sebastian M Posada
 */
public class Participante {
    
    //atributos de la clase
    public String nombre = null;
    public int edad = 0;
    public char genero = '0' ;
    public String carrera = null;
    public int semestre = 0;
    
    /**
     * metodo constructor por default
     */
    Participante(){
        
    }
    
   /**
    * 
    * @param nombre Nombre del paricipante
    * @param edad Edad del participante
    * @param genero Genero del participante
    * @param carrera Carrera del participante
    * @param semestre Semestre del participante
    */
    Participante(String nombre, int edad, char genero, String carrera, int semestre){
     
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
        this.semestre = semestre;
        
    }
    
    @Override
    public String toString(){
        return "NOMBRE: " +nombre + "\nEDAD: " +edad
                + "\nGENERO: " +genero + "\nCARRERA: " 
                +carrera + "\nSEMESTRE: " +semestre;
                
    }
    
}
