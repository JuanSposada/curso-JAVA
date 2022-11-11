/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusaapp;

/**
 *Esta es la clase donde se da de alta el Juego
 * @author J Sebastian M Posada, Gabriel Alejo Cota Ruiz, Jesús Armando Velázquez Torrico
 */
public class Juego {
    //atributos
    private Jugador[] jugadores;
    private Revolver revolver;
 
    
    /**
     * Constructor por default
     * @param numJugadores 
     */
    public Juego(int numJugadores) {
 
        jugadores = new Jugador[comprobarJugadores(numJugadores)];
 
        crearJugadores();
 
        revolver = new Revolver();
 
    }
 
    /**
     * Este metodo comprueba que el numero de jugadores este dentro del parametro
     * @param numJugadores
     * @return el numero de uugadores, sino, regresa el 6 por default
     */
    private int comprobarJugadores(int numJugadores) {
 
        //Sino esta en el rango correcto se pone a 6
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
 
        return numJugadores;
    }
 
    /**
     * Este metodo crea los jugadores
     */
    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }
 
    /** 
     * Indica si el juego Termina si no hay jugadores vivos
     * @return regresa verdaderi o falso
     */
    public boolean finJuego() {
 
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                //Acabo el juego
                return true;
            }
        }
        return false; //No termina el juego
    }
 
    /** 
     * Inicia una Ronda
     */
    public void ronda() {
 
        for (int i = 0; i < jugadores.length; i++) {
            //El jugador se dispara
            jugadores[i].disparar(revolver);
        }
 
    }
     
   /**
    * Inicia una Ronda, si un juegador muere, termina el juego
    */
    public void rondaV2() {
 
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
             
            //Si muere, terminamos
            if(!jugadores[i].isVivo()){
                return;
            }
        }
 
    }
    
}
