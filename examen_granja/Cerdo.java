/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_granja;

/**
 *
 * @author J Sebastian M Posada
 */
public class Cerdo extends Animal{
     String nombre = null;
    String color = null;
    int corral = 0;
    String sonido = sonido();
    
    public Cerdo(int peso, int edad, String sexo, String nombre, String color, int corral) {
        super(peso, edad, sexo);
        this.nombre = nombre;
        this.color= color;
        this.corral = corral;
    }
    
    @Override
    public String sonido(){
        return "Oing Oing!";
    }
    
    @Override
    public String toString(){
        return "CERDO: " +nombre +"\nEdad: " +super.edad +" años" +"\nPeso: " +super.peso +" Kg"+"\nSexo: " +super.sexo
                +"\nColor: " +color +"\nCorral: " +corral +"\nSonido: " +sonido;
    }
    
}
