/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videocentroapp;
import java.lang.Comparable;
/**
 *
 * @author J Sebastian M Posada
 * matricula: 22760047
 * 
 */
    
    //clase publica Serie
    class Serie implements Entregable{
        //atributos
        String titulo = "";
        int numeroTemporadas = 3;
        boolean entregado = false;
        String  genero = "";
        String  creador = "";
                
        //constantes
        final static int D_NUM_TEMPORADAS = 3;
        final static boolean D_ENTREGADO = false;
        
        //CONSTRUCTORES
        Serie(){
            
        }
        Serie(String titulo, String creador){
            this.titulo = titulo;
            this.creador = creador;
        }
    
        Serie(String titulo, int numeroTemporadas, String genero, String creador){
            this.titulo = titulo;
            this.numeroTemporadas = numeroTemporadas;
            this.genero = genero;
            this.creador = creador;
        }
        
        //METODOS get
        
        public String getTitulo(){
            return this.titulo;
        }
        public int getTemporadas(){
            return this.numeroTemporadas;
                   }
        public String getGenero(){
            return this.genero;
        }
        public String getCreador(){
            return this.creador;
        }
        //metodos set
        public void setTitulo(String titulo){
            this.titulo = titulo;            
        }
        public void setTemporadas(int numeroTemporadas){
            this.numeroTemporadas = numeroTemporadas;
        }
        public void setGenero(String genero){
            this.genero = genero;
        }
        public void setCreador(String creador){
            this.creador = creador;
        }
        //metodos interfaz
        @Override
        public void entregar(){
            this.entregado = true;
        }
        @Override
        public void devolver(){
            this.entregado = false;
        }
        @Override
        public boolean isEntregado(){
            if (this.entregado == true)
                return true;
            else
                return false;
            }
        @Override
        public int compareTo(Object st){
            int estado = 0;
            Serie ref =(Serie)st;
            if(numeroTemporadas > ref.getTemporadas())
                estado = 1;
            else if (numeroTemporadas < ref.getTemporadas())
                estado = -1;
            else if(numeroTemporadas == ref.getTemporadas())
                estado = 0;
            return estado;
       
        }
        
        @Override
        public String toString(){
            return "\nTITULO: " +getTitulo() 
                    +"\nTEMPORADAS: " +getTemporadas()
                    +"\nGENERO: " +getGenero()
                    +"\nCREADOR: " +getCreador();             
                   
        }
       
        
        
    }     
     //clase Videojuego
     class Videojuego implements Entregable{
        //atributos
        String titulo = ""; 
        int horasEstimadas = 10;
        boolean entregado = false;
        String genero = "";
        String compañia ="";
        
        //constantes
        final static int D_HORAS = 10;
        final static boolean D_ENTREGADO = false;
        
        //constructores
        Videojuego(){
            
        }
        Videojuego(String titulo, int horasEstimadas){
            this.titulo = titulo;
            this.horasEstimadas = horasEstimadas;
            }
        Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero =  genero;
        this.compañia = compañia;
    }

        //metodos
        public String getTitulo(){
            return this.titulo;
        }
        public int getHoras(){
            return this.horasEstimadas;
                   }
        public String getGenero(){
            return this.genero;
        }
        public String getCompañia(){
            return this.compañia;
        }
        //metodos set
        public void setTitulo(String titulo){
            this.titulo = titulo;            
        }
        public void setHoras(int horasEstimadas){
            this.horasEstimadas = horasEstimadas;
        }
        public void setGenero(String genero){
            this.genero = genero;
        }
        public void setCompañia(String compañia){
            this.compañia = compañia;
        }
        //metodos de interfaz
        @Override
        public void entregar(){
            this.entregado = true;
        }
        @Override
        public void devolver(){
            this.entregado = false;
        }
        @Override
        public boolean isEntregado(){
            if (this.entregado == true)
                return true;
            else
                return false;
        }
        @Override
         public int compareTo(Object a){
            int estado = 0;
             Videojuego ref =(Videojuego)a;
            if(horasEstimadas > ref.getHoras())
                estado = 1;
            else if (horasEstimadas < ref.getHoras())
                estado = -1;
            else if(horasEstimadas == ref.getHoras())
                estado = 0;
            return estado;
         }
        @Override
        public String toString(){
            return "\nTITULO: " +getTitulo() 
                    +"\n HORAS: " +getHoras()
                    +"\nGENERO: " +getGenero()
                    +"\nCOMPAÑIA: " +getCompañia(); 
        }
    
    }

    interface Entregable{
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public int compareTo(Object a);
    }

public class VideoCentroApp {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Serie[] listaSeries = new Serie[5];
        Videojuego[] listaVideojuegos = new Videojuego[5];
        
        //lista de series
        listaSeries[0] = new Serie("the big bang theory", 13, "sitcom", "chuk lorrey");
        listaSeries[1] = new Serie("fairy tail","turituturu");
        listaSeries[2] = new Serie("Rick y morty",6,"ficcion","majs");
        listaSeries[3] = new Serie("locos adams","neckelodeon");
        listaSeries[4] = new Serie("Dragon Ball",3,"accion", "akira toriyama");
        
        listaVideojuegos[0] = new Videojuego();
        listaVideojuegos[1] = new Videojuego("halo", 20);
        listaVideojuegos[2] = new Videojuego("sudoku", 40, "math", "playground");
        listaVideojuegos[3] = new Videojuego("Vice city", 100,"gangsta", "rockstargames");
        listaVideojuegos[4] = new Videojuego("tetris", 10000, "destreza","oldSchool games");
        
        //aqui entrega las Series y Videojuegos
        listaSeries[1].entregar();
        listaVideojuegos[2].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[4].entregar();
        
        //aqui itera sobre las listas y cuenta cuantos hay entregados, despues los devuleve
        int entregados = 0;
        for(int i= 0; i<listaSeries.length; i++){
            if(listaSeries[i].isEntregado())
                entregados += 1;
                listaSeries[i].devolver();}
        for(int i=0; i<listaVideojuegos.length;i++){
            if(listaVideojuegos[i].isEntregado())
                entregados +=1;
                listaVideojuegos[i].devolver();}
        System.out.println("NUMERO DE ENTREGADOS: " +entregados);
                
        Serie serieMayor = listaSeries[0];
         Videojuego videojuegoMayor = listaVideojuegos[0];
        for(int i = 0; i< listaSeries.length; i++){
            if(listaSeries[i].compareTo(serieMayor)==1)
                serieMayor = listaSeries[i];
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==1)
                videojuegoMayor = listaVideojuegos[i];
                
        }
        System.out.println("\nSERIE CON MAS TEMPORADAS");
        System.out.println(serieMayor);
        System.out.println("\nVIDEOJUEGO CON MAS HORAS ESTIMADAS");
        System.out.println(videojuegoMayor);
    }    
}


