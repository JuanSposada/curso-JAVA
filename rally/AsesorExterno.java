/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rally;

/**
 *
 * @author J Sebastian M Posada
 */
public class AsesorExterno extends Asesor {
    String nombreEmpresa = null;

    //metodo constructor default
    public AsesorExterno() {
        super();//llamar al constructor de la clase padre
    }
    //metodo constructor 2
    public AsesorExterno(String nombre, String especialidad, byte edad, String nombreEmpresa) {
        super(nombre, especialidad, edad);//hereda estos atributos
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() +"AsesorExterno{" + "nombreEmpresa=" + nombreEmpresa + '}';
    }
    
    
}
