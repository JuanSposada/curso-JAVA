/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_granja;

/**
 *
 * @author J Sebastian M Posada
 */
public abstract class Animal {
    
    
    //Atributos
   String sexo = null;
    int peso = 0;
    int edad = 0;

    public Animal(int peso, int edad, String sexo) {
        this.peso= peso;
        this.edad =edad;
        this.sexo = sexo;
              
        
    }

    
    
    
    
    /*
    metodo abstracto
    */
    public abstract String sonido();
    
    
}
