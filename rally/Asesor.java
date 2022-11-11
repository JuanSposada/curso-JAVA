/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rally;

/**
 *
 * @author J Sebastian M Posada
 */
public class Asesor {
    String nombre = null;
    String especialidad = null;
    byte edad = 0;
    
    //constructor default
        Asesor(){
        
    }
    Asesor(String nombre, String especialidad, byte edad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
               
    }
    
    //imprimir atributoos
    @Override
    public String toString(){
        return "[ASESOR] \n NOMBRE: " +nombre + "\n ESPECIALIDAD: " +especialidad + "\n EDAD: " +edad;
    }
    
}
