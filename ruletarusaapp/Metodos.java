/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusaapp;

/**
 *Esta es una clase dedicada al metodo de generar un numero aleatorio para la posicion de la bala
 * @author J Sebastian M Posada, Gabriel Alejo Cota Ruiz, Jesús Armando Velázquez Torrico
 */
public class Metodos {
     /**
     * Genera un numero aleatorio entre dos numeros
     * @param minimo
     * @param maximo
     * @return 
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
 
    
    
}
