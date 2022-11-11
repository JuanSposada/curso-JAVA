/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusaapp;

/**
 *Esta es la clase Revolver donde se daran de alta los atributos y funciones del mismo
 * @author J Sebastian M Posada, Gabriel Alejo Cota Ruiz, Jesús Armando Velázquez Torrico
 */
public class Revolver {
    //Atributos
    private int posicionBalaActual;
    private int posicionBala;
 
    /**
     * metodo constructor por default
     */
    public Revolver() {
        posicionBalaActual = Metodos.generaNumeroAleatorio(1, 6);
        posicionBala = Metodos.generaNumeroAleatorio(1, 6);
    }
    //Metodos
     
  /**
   * Metodo disparar
   * @return exito verdadero o falso
   */
    public boolean disparar() {
 
        boolean exito = false;
 
        if (posicionBalaActual == posicionBala) {
            exito = true; //Alguien va a morir...
        }
 
        siguienteBala();
 
        return exito;
 
    }
    
     /**
      * Reinicia la pocision de la bala a lugar 1 si esta esta en el 6
      * sino, aumenta la posicion +1
      */
    public void siguienteBala() {
 
        if (posicionBalaActual == 6) {
            posicionBalaActual = 1; //posicion incial
        } else {
            posicionBalaActual++;
        }
 
    }
 /** 
  * Este metodo devuelve la pocision de la bala
  * @return Cadena de texto con la posicion de la bala
  */
    @Override
    public String toString() {
        return "Posicion Bala Actual: " + posicionBalaActual + ", Posicion bala: " + posicionBala;
    }
    
    
}
