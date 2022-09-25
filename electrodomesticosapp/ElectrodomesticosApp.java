package electrodomesticosapp;

/**
 *Esta es la clase que contiene el metodo main
 * @author J Sebastian M Posada
 * matricula: 22760047
 */
public class ElectrodomesticosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //declaracion del arreglo
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];
        
        //dar de alta los objetos con sus atributos en cada espacio del arreglo
        listaElectrodomesticos[0]= new Lavadora(300, "amarillo", 'D', 40, 15);
        listaElectrodomesticos[1]= new Television(250, "negro", 'F', 7, 52, false);
        listaElectrodomesticos[2]= new Electrodomestico(400,"rojo",'H',90);
        listaElectrodomesticos[3]= new Lavadora();
        listaElectrodomesticos[4]= new Television();
        listaElectrodomesticos[5]= new Electrodomestico();
        listaElectrodomesticos[6]= new Lavadora(500, 8);
        listaElectrodomesticos[7]= new Television (150,10);
        listaElectrodomesticos[8]= new Electrodomestico(50,1);
        listaElectrodomesticos[9]= new Television(1800, "verde", 'B', 20, 120,true);
        
      //variables para la suma de precios
      double sumElectrodomestico = 0;
      double sumTelevision = 0;
      double sumLavadora =  0;
      
      //ciclo for para iterar cada uno de los valores del arreglo
      
      for(int i = 0; i <10; i++){
           //ahora aplicacamos el condicional if para  que a partir del tipo se sumen a las vaariables el precio final
           if(listaElectrodomesticos[i] instanceof Electrodomestico)
               sumElectrodomestico += listaElectrodomesticos[i].precioFinal();
           if(listaElectrodomesticos[i] instanceof Lavadora)
               sumLavadora += listaElectrodomesticos[i].precioFinal();
           if(listaElectrodomesticos[i] instanceof Television)
               sumTelevision += listaElectrodomesticos[i].precioFinal();
                     
         }
        System.out.println("Precio total de Televisores: " +sumTelevision);
        System.out.println("Precio total de Lavadoras:  " +sumLavadora);
        System.out.println("Precio total de Electrodomesticos: " + sumElectrodomestico);
    }
}
