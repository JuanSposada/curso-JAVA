package electrodomesticosapp;

/**
 *Subclase que representa a un televisor
 * @author J Sebastian M Posada
 */
public class Television extends Electrodomestico {
    int resolucion = 20;
    boolean sintonizadorTDT = false;
    
//CONSTRUCTORES
    
    /**
     * Constructor por defecto
     */
    public Television() {
    
}
    /**
     * Construcor 2
     * @param precio
     * @param peso 
     */
   public Television(double precio, int peso){
       this.precio = precio;
       this.peso = peso;
       
   }
   
   /**
    * Constructor 3
    * @param precio
    * @param color
    * @param consumoEnergetico
    * @param peso
    * @param resolucion
    * @param sintonizadorTDT 
    */
    public Television(double precio, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT){
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        
    }
    /**
     * metodo get
     * @return resolucion
     */
    public int getResolucion(){
        return this.resolucion;
        
        
            }
    
    /** 
     * metodo get
     * @return sintonizador TDT
     */
    public boolean getSintonizador(){
        return this.sintonizadorTDT;
    }
    
    /**
     * devuelve el aumento de precio final por la cantidad de pulgadas del televispr
     * y tambien por el sintonizador TDT
     * @return precio final
     */
    public double precioFinal(){
        double aumento = super.precioFinal();
        if (this.resolucion > 40)
            aumento += (this.precio * 0.30);
        if (this.sintonizadorTDT == true)
            aumento += 50;
        return aumento;       
    }
    
}

