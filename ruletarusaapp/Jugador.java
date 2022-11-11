/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusaapp;

/**
 *Esta clase describe al Jugador y sus Funciones
 * @author J Sebastian M Posada, Gabriel Alejo Cota Ruiz, Jesús Armando Velázquez Torrico
 */
public class Jugador {
     //Atributos
    private int id;
    private String nombre;
    private boolean vivo;
 
    /**
     * constructor por defualt
     * @param id 
     */
    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }
 
    //Propiedades
     
    /**
     * El jugador dispara el revolver
     * @param r 
     */
    public void disparar(Revolver r) {
 
        System.out.println("El " + nombre + " se apunta con la pistola");
 
        //El jugador se pone el revolver y...
        if (r.disparar()) {
            this.vivo = false; //muere
            System.out.println("El " + nombre + " ha muerto...");
            
        } else {
            System.out.println("El " + nombre + " se ha librado..."); //No muere
        }
 
    }
 
    /** 
     * Comprueba si el jugador esta vivo
     * @return vivo = verdadero o falso
     */
    public boolean isVivo() {
        return vivo;
    }
 
    
}
