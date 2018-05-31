/**
 * Creando plantilla Brasil 2018 
 * usando Patron de diseño
 * Factory Method o
 * tambien llamado Factory
 */
package plantillabrasil2018;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PlantillaBrasil {
    
    public static void main(String[] args) {
        
        Jugador jugador = JugadorFactory.getJugador(JugadorType.ARQUERO);
        jugador.Jugar();
        
        jugador = JugadorFactory.getJugador(JugadorType.DEFENSA);
        jugador.Jugar();
        
        jugador = JugadorFactory.getJugador(JugadorType.LATERAL);
        jugador.Jugar();
        
        jugador = JugadorFactory.getJugador(JugadorType.MEDIOCAMPISTA);
        jugador.Jugar();
        
        jugador = JugadorFactory.getJugador(JugadorType.DELANTERO);
        jugador.Jugar();

    }
    
}
