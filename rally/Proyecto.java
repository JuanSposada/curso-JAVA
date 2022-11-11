/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rally;
import java.util.Scanner;

/**
 *esta clase es la que representa a un proyecto
 * @author J Sebastian M Posada
 */
public class Proyecto {
    //variables globales
      
    String nombre = null;
    int numIntegrantes = 0;
    
    AsesorInterno asesorInterno;
    AsesorExterno asesorExterno;
    Participante[] participante;
    Scanner leer = new Scanner(System.in);
    
    /**
     * Constructor por default
     */
    Proyecto(){
        
    }
     Proyecto(String nombre, int numIntegrantes){
         this.nombre = nombre;
         this.numIntegrantes = numIntegrantes;
         if(numIntegrantes <0 )
             System.out.println("por favor introduce un numero de integrantes valido");
         else{
              participante = new Participante[numIntegrantes];
             for(int i = 0; i<numIntegrantes; i++){
                 participante[i] = new Participante();
                 System.out.println("Ingresa el nombre de participante " +(i+1));
                  participante[i].nombre = leer.next();
                 do{ System.out.println("Introduce la edad del participante");
                    participante[i].edad = leer.nextInt();
                 }while(participante[i].edad <0 && participante[i].edad >120);
                 do{System.out.println("Ingresa el sexo del participante (M: masculino, F: femenino");
                  participante[i].genero = leer.next().charAt(0);
                 }while (participante[i].genero != 'M' && participante[i].genero != 'F');
                 do{System.out.println("Ingresa la carrera: sistemas, industrial o electronica");
                 participante[i].carrera = leer.next();
                 }while(participante[i].carrera.compareToIgnoreCase("sistemas")!=0 
                        && participante[i].carrera.compareToIgnoreCase("industrial")!=0
                        && participante[i].carrera.compareToIgnoreCase("electronica")!=0);
                  do{
                    System.out.println("Ingresa el semestre (1 al 25)");
                    participante[i].semestre =leer.nextInt();
                }while(participante[i].semestre<0 || participante[i].semestre>25);
                              
                                          
             }// fin del for
              this.asesorExterno = altaExterno();
              this.asesorInterno = altaInterno();
         }// fin del else
     }//fin del constructor
     
     public String toString(){
         String participante="";//aqui tenia null
        for(int i=0;i<numIntegrantes;i++)
            participante=participante +"\n"+ this.participante[i].toString();//le agregue un salto de linea antes de que se imprima cada participante
        
     return "Nombre del proyecto: "+nombre
             +" numero de integrantes: "+this.numIntegrantes
             +"\n"+participante;
     }
     
     public AsesorInterno altaInterno(){
         AsesorInterno asesorInterno1 = new AsesorInterno();
         System.out.println("Ingresa el nombre del asesor interno");
         asesorInterno1.nombre = leer.nextLine();
         System.out.println("Ingrese la especialidad");
         asesorInterno1.especialidad = leer.nextLine();
         do{
             System.out.println("Ingresa la edad");
             asesorInterno1.edad = leer.nextByte();
         }while(asesorInterno.edad < 0 && asesorInterno.edad > 99 );
         System.out.println("Ingresa la carrera");
         asesorInterno1.nombreCarrera = leer.nextLine();
         return asesorInterno1;
     }
      public AsesorExterno altaExterno(){
         AsesorExterno asesorExterno1 = new AsesorExterno();
         System.out.println("Ingresa el nombre del asesor interno");
         asesorExterno1.nombre = leer.nextLine();
         System.out.println("Ingrese la especialidad");
         asesorExterno1.especialidad = leer.nextLine();
         do{
             System.out.println("Ingresa la edad");
             asesorExterno1.edad = leer.nextByte();
         }while(asesorInterno.edad < 0 && asesorInterno.edad > 99 );
         System.out.println("Ingresa la carrera");
         asesorExterno1.nombreEmpresa = leer.nextLine();
         return asesorExterno1;
      }
   
}// fin de la clase
