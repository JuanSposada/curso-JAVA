/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_granja;

/**
 *
 * @author J Sebastian M Posada
 */
public class Vaca extends Animal {
    
    /*Atributos*/
    
    String nombre = null;
    String color = null;
    int corral = 0;
    String sonido = sonido();
    boolean daLeche = true;

    /**
     *Constructor de vaca
     * @param peso
     * @param edad
     * @param sexo
     * @param nombre
     * @param color
     * @param corral
     * @param daLeche
     */
    public Vaca(int peso, int edad, String sexo, String nombre, String color, int corral, boolean daLeche) {
        super(peso, edad, sexo);
        this.nombre = nombre;
        this.color= color;
        this.corral = corral;
        this.daLeche = daLeche;
    }
    
    @Override
    public String sonido(){
        return "Muuhhhhhh!!!!";
    }
    
    @Override
    public String toString(){
        return "VACA: " +nombre +"\nEdad: " +super.edad +" años" +"\nPeso: " +super.peso +" Kg"+"\nSexo: " +super.sexo
                +"\nColor: " +color +"\nCorral: " +corral +"\nSonido: " +sonido +"\nDa leche? " +daLeche;
    }
   
    
    
    
    
    
}
