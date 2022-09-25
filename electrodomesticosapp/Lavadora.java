package electrodomesticosapp;

/**
 *Esta es la subclase que representa al objeto Lavadora
 * @author J Sebastian M Posada
 */
public class Lavadora extends Electrodomestico {
     int carga = 5;
        
        /**
         * Constructor por defecto
         */
        public Lavadora(){
          
        }
       
        /**
         * Constructor 2
         * @param precio
         * @param peso 
         */
        public Lavadora(double precio, int peso){
            this.precio = precio;
            this.peso = peso;
            
         }
        
        /**
         * constructor 3
         * @param precio
         * @param color
         * @param consumoEnergetico
         * @param peso
         * @param carga 
         */
        public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga){
            super(precio, color, consumoEnergetico,peso);
            this.carga = carga;
        }
        
        /**
         * metodo para obtener la carga
         * @return 
         */
        public int getCarga(){
            return this.carga;
        }
       /**
        * metodo para agregar valor al precio final
        * @return precio final mas aumento
        */
        public double precioFinal(){
            double aumento = super.precioFinal();

            if (carga > 30)
                aumento += 50;
            return aumento;            
        }
}
