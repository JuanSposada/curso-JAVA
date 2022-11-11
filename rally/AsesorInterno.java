/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rally;

/**
 *
 * @author J Sebastian M Posada
 */
public class AsesorInterno extends Asesor {
    String nombreCarrera = null;
    
    //constructor default 
    AsesorInterno(){
        super();//metodo constructor
        
    }
    AsesorInterno(String nombre, String especialidad, byte edad, String nombreCarrera){
        //super debe ser la primera linea de codigo que debe de ir el metodo coonstructor de una subclase
        super(nombre, especialidad, edad);
        this.nombreCarrera = nombreCarrera;
        
        
      
        
        
    }

    @Override
    public String toString() {
        return super.toString()+"AsesorInterno{" + "nombreCarrera=" + nombreCarrera + '}';
    }
    
}
