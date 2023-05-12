
package Jugador;

/**
 *
 * @author ivan
 */
public class Jugador {
    
    //ATRIBUTOS
    
    public static String name1;
    public static String name2;
    public static int numPartidas;
    public static boolean automatic;
    public static int vJugador1;
    public static int vJugador2;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        name1 = "NONE";
        name2 = "CPU";
        numPartidas = 0;
        vJugador1 = 0;
        vJugador2 = 0;
        automatic = false;
    }
    
    public Jugador(String nombre){
        this.name1 = nombre;
    }
    
    public Jugador(String nombreX, String nombreY){
        this.name1 = nombreX;
        this.name2 = nombreY;
    }
    
    
    public String getNombre1() {
        return name1;
    }
    
    public void setNombre1(String nombre) {
        this.name1 = nombre;
    }
    
    public String getNombre2() {
        return name2;
    }
    
    public void setNombre2(String nombreY) {
        this.name2 = nombreY;
    }
    
    public static int get_Partidas() {
        return numPartidas;
    }
    
    public void set_Partidas(int Partidas) {
        this.numPartidas = Partidas;
    }
    
}
