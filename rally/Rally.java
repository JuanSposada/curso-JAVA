/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rally;
import java.util.Scanner; 
/**
 *Este programa es la representacion de un Rally de proyectos que incluye partivipantes del proyecto
 * @author J Sebastian M Posada
 */
public class Rally {

     static Proyecto[] proyecto;
    static Scanner leer=new Scanner(System.in);
    static byte numeroProyectos=0,numeroIntegrantes=0;
    static String nombreProyecto=null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String nombreProyecto=null;
        byte numeroIntegrantes=0;
        do{
            System.out.println("Bienvenido al Rally Latinoamericano 2022");
            System.out.println("Ingresa el numero de proyectos valido (1 al 200)");
            numeroProyectos=leer.nextByte();//leer el numero de proyectos
        }while(numeroProyectos<0 || numeroProyectos>200);
        
        //crear el arreglo de objetos del tipo Proyecto
        proyecto=new Proyecto[numeroProyectos];
        
        //ciclo para crear los proyectos
        for(int i=0;i<numeroProyectos;i++){
            System.out.println("Ingresa los datos del proyecto "+(i+1));
            System.out.println("Ingresa el nombre del proyecto");
            nombreProyecto=leer.next();
            do{
                System.out.println("Ingresa el numero de integrantes");
                numeroIntegrantes=leer.nextByte();
            }while(numeroIntegrantes<0);
            //crear un proyecto
            proyecto[i]=new Proyecto(nombreProyecto,numeroIntegrantes);
        }

        //ciclo para imprimir proyectos
        for(int j=0;j<numeroProyectos;j++)
            System.out.println("El proyecto "+(j+1)+" es "+proyecto[j].toString()+"\n");
        
        
                
        
    }
    
}
