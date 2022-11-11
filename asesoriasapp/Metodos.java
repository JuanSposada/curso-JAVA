/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoriasapp;

/**
 *esta es la clase de metodos, aqui se definen los metodos en esta clase por separado
 * @author J Sebastian M Posada
 */
public class Metodos {
    
    /*
    Atributos
    */
    static Asesor[] asesores;
    static  Alumno[] alumnos;
    
    /*consantes */
    
    static final String[] NOMBRES ={"Carlos","Ariell","Jacobo","Avrill","Alberto", "Regina", "Rogelio", "Miriam", "Juan", "Zareth","Victor","Julieta","Abelardo","Sofia"};
    static final String[] APELLIDOS ={"Juarez","Posada","Cota","Roblez","Perez","Garcia","Flores","Morales", "Villa", "Rodriguez", "Osuna", "Adame", "Bustillos", "Lara"};    
    static final String[] MATERIAS = {"calculo diferencial","calculo vectorial", "calculo integral",  "quimica", "fisica", "algebra"}; 
    
    /**
     * Este metodo nos ayuda a generar un numero aleatorio
     * @param minimo
     * @param maximo
     * @return 
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    /**
     * con este metodo puedes crear asesores
     */
    public static void crearAsesores(){
        asesores = new Asesor[50];
        for(int i = 0; i<asesores.length; i++){
            asesores[i] = new Asesor();
            
            
        }   
    }
    /**
     * con este metodo puedes crear arreglos de alumnos
     */
    public static void crearAlumnos(){
        alumnos = new Alumno[50];
        for(int i = 0; i<alumnos.length; i++){
            alumnos[i] = new Alumno();
                    }       
}
   /*public static void AsignarMateria(){
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
    }*/
   
}
