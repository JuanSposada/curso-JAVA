/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletarusaapp;

/**
 *Esta es la clase principal, en la cual se ejecuta el programa
 * @author J Sebastian M Posada, Gabriel Alejo Cota Ruiz, Jesús Armando Velázquez Torrico
 */
public class RuletaRusaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Juego juego = new Juego(5);
         
        while( !juego.finJuego() ){
                      
            juego.rondaV2();
        }
         
        System.out.println("El juego ha terminado");
         
    }
    }
    

