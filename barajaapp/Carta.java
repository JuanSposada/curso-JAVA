/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barajaapp;

/**
 *
 * @author J Sebastian M Posada
 */
public class Carta {
     //Atributos
    private int numero;
    private String palo;
     
    //Constantes
    public static final String[] PALOS={"ESPADAS", "OROS", "COPAS", "BASTOS"};
    public static final int LIMITE_CARTA_PALO=12;
 
    //Constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
 
    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
}
