/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona_status;
import java.util.Scanner;

/**
 *esta Clase representa a una Persona
 * @author J Sebastian M Posada
 * matricula 22760047
 * 
 * 
 */
  //inicializacion de la Clase Persona

 class Persona{
     
     //atributos
     private String nombre;
     private int edad;
     private String DNI;
     //valor de atributo constante
     private char sexo = 'H';
     private double peso;
     private double estatura;
     
     /**
      * Constructor por defecto
      */
     Persona(){
         nombre = "";
         edad = 0;
         DNI = generarDNI();
         peso = 0;
         estatura = 0;
         }
     
     /** 
      * constructor 2
      * @param nombre
      * @param edad
      * @param sexo 
      */
     Persona(String nombre, int edad, char sexo){
         this.nombre = nombre;
         this.edad = edad;
         this.DNI= generarDNI();
         this.sexo = sexo;          
         comprobarSexo();
     }
     
     /**
      * constructor 3
      * @param nombre
      * @param edad
      * @param sexo
      * @param peso
      * @param estatura 
      */
     Persona(String nombre, int edad, char sexo, double peso, double estatura){
         this.nombre = nombre;
         this.edad = edad;
         this.DNI= generarDNI();
         this.sexo = sexo;
         this.peso = peso;
         this.estatura = estatura;
         comprobarSexo();
              }
    
     
    /**
     * Calcula el indice de masa corporal
     * @return IMC
     */
    public String calcularIMC(){
        String imcStatus;
        double imc = (peso/(estatura*estatura));
        if(imc < 20) 
            imcStatus = "Esta bajo de peso";
        else if (imc >20 && imc <25)
            imcStatus = "Esta en su peso ideal";
        else 
            imcStatus = "Sobrepeso";
        return imcStatus;          
      }
    
    /**
     * comprueba si el usuario es mayor de edad
     * @return verdad o falso
     */
    public boolean esMayorDeEdad(){
        return edad >18;                        
    }
    
    /**
     * metodo que devuelve en una cadena todos
     * los datos de la persona
     * @return String
     */
    @Override
    public String toString(){
        return "NOMBRE: " +nombre 
                +"\nEDAD: " +edad 
                +"\nDNI: " +DNI
                +"\nSEXO: " +sexo
                +"\nPESO: " +peso
                +"\nESTATURA: " +estatura
                +"\nIMC: " +calcularIMC()
                +"\nMAYOR DE EDAD: " +esMayorDeEdad();
        
                        
    }
    
     /**
      * comrueba el sexo y devulve el valor por default
      */
     private void comprobarSexo(){
        if(sexo != 'M' && sexo != 'H')
           this.sexo = 'H';             
           }
     
     /** 
      * Genera un DNI de forma aleatoria
      * @return 
      */
     private String generarDNI(){
         int numDNI = ((int)(Math.random()*(99999999 - 00000000)));
         char letraDNI[] = {'T','R','W','A','G','M','Y','F','P','D',
         'X','B','N','J','Z','S','Q','V','H','L','K','C','E'};
         int resto = numDNI % 23;
         
     return   String.valueOf(numDNI) + letraDNI[resto];
                
     }
     
     
    public void setNombre(String nombre){
         this.nombre = nombre;         
     }
    public void setEdad(int edad){
         this.edad = edad;
     }
    public void setSexo(char sexo){
         this.sexo = sexo;
     }
     public void setPeso(double peso){
         this.peso = peso;
              }
     public void setEstatura(double estatura){
         this.estatura = estatura;
     }
 }

public class Persona_status {
    
      
      
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //introducir datos persona por medio del teclado
          System.out.println("Ingresa el nombre");
        String nombre = sc.next();
        System.out.println("Ingresa la edad");
        int edad = sc.nextInt();
        System.out.println("Ingresa el sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingresar Peso");
        double peso = sc.nextDouble();
        System.out.println("Ingresar estatura");
        double estatura = sc.nextDouble();       
               
        
        //Objetos
        Persona persona1 = new Persona(nombre,edad,sexo,peso,estatura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        
        //dar de alta valores al objeto por el metodo set
        persona2.setPeso(98);
        persona2.setEstatura(1.75);
        
        //datos de persona3
        persona3.setNombre("Zareth");
        persona3.setEdad(28);
        persona3.setSexo('M');
        persona3.setPeso(58);
        persona3.setEstatura(1.58);
        
        //estatus de la persona
                      
        System.out.println("\n[PERSONA 1] \n" +persona1);
        System.out.println("\n[PERSONA 2] \n" +persona2);
        System.out.println("\n[PERSONS 3]  \n" +persona3);
        
        
    }
    
}
