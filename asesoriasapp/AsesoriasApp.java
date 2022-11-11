/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asesoriasapp;
import java.util.Scanner;

/**
 *Esta aplicacion hara la simulacion de un programa de asesorias en el cual
 * te podras registrar como alumno o asesor, para asi ver que asesores hay disponibles
 * y de que materia estan dando asesoria. como asesor, puedew ver los alumnos que estan solicitando
 * el servicio y agendar una asesoria con ellos.
 * @author J Sebastian M Posada
 */
public class AsesoriasApp  {
    
     static Asesor[] asesores = new Asesor[100];;
    static  Alumno[] alumnos;
    
     static int selectorUsuario, selectorHora, numMateria;
     static String selectorMateria;
    

    /**esta es la clase que contiene el metodo main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("[Hola, Esta es la aplicacion de asesorias]");
        do{
        System.out.println("\nPor favor indica si eres alumno o asesor: \n");
        System.out.println("1.[ALUMNO] \n2.[ASESOR]");
        selectorUsuario = leer.nextInt();
        
        }while(selectorUsuario != 1 && selectorUsuario != 2);
        switch(selectorUsuario){
            case 1 -> {
            System.out.println("Escribe tu nombre");
                String nombre = leer.next();   
                System.out.println("Ahora tu apellido");
                String apellido = leer.next();
                System.out.println("Escribe tu numero de control");
                int numControl = leer.nextInt();
                System.out.println("Hola " +nombre+ " "+apellido);
                   
                
               do{ System.out.println("indica  el numero de la materia de la cual requieres asesorias");
                System.out.println("""                               
                                1. [Calculo diferencial]
                                2. [calculo integral]
                                3. [quimica]                                 
                                4. [fisica] 
                                5. [algebra lineal]
                                6. [calculo vectorial]
                                """);
                numMateria = leer.nextInt();
               } while(numMateria  > 6 || numMateria < 1);
                asignarMateria();
                    
                Alumno alumno1 = new Alumno(nombre, apellido, numControl, selectorMateria);
                System.out.println(alumno1);
                do{System.out.println("Ingresa el horario en el que quieres Asesoria  (horario de 14 hrs a 21 hrs");
                selectorHora = leer.nextInt();
                }while(selectorHora <14 || selectorHora > 21);
                    
                       crearAsesor();
                              
                                         
               
                                   
                                           
                                        
                }// cierre de Case 1
            case 2 -> {
                System.out.println("Hola Asesor, esta es la lista de alumnos que buscan asesorias");
                System.out.println("\nSelecciona la opcion que deseas:");
                System.out.println("");
                alumnos = new Alumno[100];
                for(int i = 1; i < 20; i++){
                alumnos[i] = new Alumno();
                    System.out.println(alumnos[i]);
                }// fin del ciclo  for 
                System.out.println(alumnos.length);
                
                
            }// fin de case 2
            
                       
            }//cierre de switch select usuario
            
            
            
        }// cierre de mazin args
      
       
       /**
        * Metodo creado para asignarle al valor de entero un String y poder compararlo para mostrar los datos
        */
   public static void asignarMateria(){
            if(numMateria == 1)
                    selectorMateria = "calculo diferencial";
                else if(numMateria == 2)
                    selectorMateria ="calculo integral";
                else if(numMateria == 3)
                    selectorMateria = "quimica";
                else if (numMateria == 4)
                    selectorMateria = "fisica";
                else if (numMateria == 5)
                    selectorMateria = "algebra lineal";
                else if(numMateria == 6)
                    selectorMateria = "calculo vectorial";
    }     
        public static void crearAsesor(){
               for(int i = 0; i<25; i++){
                        asesores[i] = new Asesor();
                         if((asesores[i].hora == selectorHora) && asesores[i].materia.equals(selectorMateria))
                                System.out.println(asesores[i]); 
                        }
                          
        }
        
        
    }//cierre de asesorias app
    

