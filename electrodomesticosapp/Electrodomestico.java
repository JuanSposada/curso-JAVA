package electrodomesticosapp;

/**
 *Esta es la SuperClase, englobla  a todo los electrodomesticos
 * @author J Sebastian M Posada
 */
public class Electrodomestico {  //Atributos
    
    /**
     * Atributos
     */
    public double precio = 100;
    public String color = "blanco";
    public char consumoEnergetico = 'F';
   public int peso = 5;
    
    int D_PESO = 5;
    char D_CON_ENER = 'F';
    String D_COLOR = "blanco";
    
    
    /**
     * Constructor por default
     */
    Electrodomestico(){
              
        
    }
    /**
     * Este es el constructor 2
     * @param precio
     * @param peso 
     */
   Electrodomestico(double precio, int peso){
       this.precio = precio;
       this.peso= peso;
          
   }
   
   /**
    * Este es otro metodo constructor
    * @param precio
    * @param color
    * @param consumoEnergetico
    * @param peso 
    */
    Electrodomestico(double precio, String color, char consumoEnergetico, int peso){
        this.precio = precio;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
       /**
        * obtiene el valor de precio
        * @return 
        */
    public double getPrecio(){
        return this.precio;
    }
    /**
     * ontiene el color del objeto
     * @return color
     */
    public String getColor(){
        return this.color;
    }
    /**
     * obtiene consumo energetico
     * @return consumo energetico
     */
   public char getConsumoEnergetico(){
       return this.consumoEnergetico;
   }
   /**
    * obtiene el peso
    * @return peso
    */
   public int getPeso(){
    return this.peso;
}
   //Metodos Especiales
   /**
    * comprueba si el carater del consumo energetico es correcto
    * @param consumoEnergetico 
    */
    private void comprobarConsumoEnergetico(char consumoEnergetico){
       if( consumoEnergetico >= 65 && consumoEnergetico <=70 )
         this.consumoEnergetico = consumoEnergetico;
       else
           this.consumoEnergetico = D_CON_ENER;
              
   }
    /**
     * comoorueba si el color es el correcto
     * @param color 
     */
    private void comprobarColor(String color){
        if(color != "blanco" && color != "negro" && color != "rojo"
                && color != "azul" && color != "gris" )
            this.color = D_COLOR;
        else
            this.color = color;
            }
    
    /**
     * calcula el precio final considerando el consumo energetico y el porcentaje si pesoa maas de 19 kg
     * @return precio final
     */
    public double precioFinal(){
        double aumento = 0;
        switch(this.consumoEnergetico){
            case 65:
                aumento += 100;
                break;
            case 66:
                aumento += 80;
                break;
            case 67:
                aumento += 60;
                break;
            case 68: 
                aumento += 50;
                break;
            case 69:
                aumento += 30;
                break;
            case 70:
                aumento += 10;
                break;       
                       
        }  
        if(this.peso <= 19 )
            aumento += 10;
        else if (this.peso <=49)
            aumento += 50;
        else if (this.peso <= 79)
            aumento += 80;
        else
            aumento += 100;
        
        
            
          return this.precio + aumento;    
                
        }
    
}
