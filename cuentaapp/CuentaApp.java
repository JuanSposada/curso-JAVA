
package cuentaapp;

/**
 *este programa te permite gestionar cuentas
 * @author J Sebastian M Posada
 * matricula: 22760047
 * 
 * este programa te permite gestionar cuentas
 */
//creacion de clase cuenta
class Cuenta{
    /**
     * esta es la clase de cuenta aqui se dan de alta los atributos
     * tambien aqui se dan de alta los constructores y los metodos
     */
    
    //atributos
    private String titular;
    private double cantidad;
    
    //constructores
   public Cuenta(String titular){
        this.titular = titular;
            }
    
    public Cuenta(String titular, double cantidad){
         this.titular = titular;
         if(cantidad <=0){
             this.cantidad = 0;
         } else {
             this.cantidad = cantidad;             
    }
    
     }
         //metodos especiales
     double ingresar(double cantidad){
         if (cantidad <= 0){
             return cantidad;
         }else{
          
           return this.cantidad += cantidad;
         }
              }
     double retirar(double cantidad){
         this.cantidad -= cantidad;
         if (this.cantidad <0){
          this.cantidad = 0;}
         return this.cantidad;
     }
     
     /* estos metodos solo sirven si los atributos estan 
     como privados, de otra manera se puede acceder a los datos sin necesidad
     de estos metodos
     */
     String getTitular(){
        return titular;
               }
     void setTitular(String titular){
         this.titular = titular;
     }
    double getCantidad(){
        return cantidad;
    }
    void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
   
    @Override
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " pesos";
        
    }
    
    
}
public class CuentaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aqui se dan de alta los objetos, se inicializan con parametros
        Cuenta cuenta1 = new Cuenta("RAUL");
        Cuenta cuenta2 = new Cuenta("SEBASTIAN", 400);
        Cuenta cuenta3 = new Cuenta("");
        
        System.out.println("CUENTAS");
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println("se ingresan 1300 a " +cuenta1.getTitular());
        cuenta1.ingresar(1300);
        System.out.println("se ingresan 800 a " +cuenta2.getTitular());
        cuenta2.ingresar(800);
        
        System.out.println("\n");
        
        //implemetacion de metodos set para dar de alta un nuevo usuario
        System.out.println("insertar datos a una nueva cuenta");
        cuenta3.setTitular("ZARETH");
        cuenta3.setCantidad(5000);
        System.out.println("nuevo usuario dado de alta: " + cuenta3);
        
        System.out.println("\n");
       
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        
         cuenta1.retirar(200);
        System.out.println(cuenta1.getTitular() + "\nretiro 200" );
        
        cuenta2.retirar(1800);
         System.out.println(cuenta2.getTitular() + "\nretiro 1800");
         
         //se muestra el estado final de las cuentas
         System.out.println("\n Estado final de las cuentas");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
    
}
