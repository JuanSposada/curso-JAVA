/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_granja;

/**
 *
 * @author J Sebastian M Posada
 */
public class Examen_Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vaca[] listaDeVacas = new Vaca[3];
        listaDeVacas[0] = new Vaca(12,0,"hembra","Clarabella","cafe",7,true);
        listaDeVacas[1] = new Vaca(20,3,"Hembra","Lola","blanco",3, false);
        listaDeVacas[2] = new Vaca(50,5,"hembra","Penelope","negro",2, true);
       
         System.out.println("[LISTA DE VACAS EN EL RANCHO] \n");
        for (Vaca listaDeVaca : listaDeVacas) {
            System.out.println(listaDeVaca); 
            System.out.println("\n");
        } // fin de ciclo for    
        
        Cerdo[] listaDeCerdos = new Cerdo[3];
        listaDeCerdos[0]= new Cerdo(20,3,"macho","Rufux","cafe",3);
        listaDeCerdos[1]= new Cerdo(50,6,"macho","Flaco","rosa",3);
        listaDeCerdos[2]= new Cerdo(50,10,"hembra","Miwi","negro",3);
        
        
          System.out.println("[LISTA DE CERDOS EN EL RANCHO] \n");
        for (Cerdo listaDeCerdo : listaDeCerdos) {
            System.out.println(listaDeCerdo);
            System.out.println("\n");
        } // fin de ciclo for
        
        System.out.println("[VACAS QUE PESAN MAS DE 10 KILOS Y TIENEN MENOS DE 1 AÑO] \n");
        for (Vaca vaca : listaDeVacas){
            if(vaca.edad < 1 && vaca.peso > 10){
                System.out.println(vaca);
            }//fin del condicional if
                  
        }//fin del ciclo for
        System.out.println("\n");
         System.out.println("LISTA DE CERDOS QUE TIENEN MAS DE 5 AÑOS DE EDAD");
         for(Cerdo cerdo : listaDeCerdos){
             if(cerdo.edad > 5){
                 System.out.println(cerdo);
             }
         }
        
        
    }//fin del main
}//fin de clase principal
