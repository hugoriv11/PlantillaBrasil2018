/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantillabrasil2018;

import jugadores.Alisson;
import jugadores.Marcelo;
import jugadores.NeymarJr;
import jugadores.Paulinho;
import jugadores.ThiagoSilva;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class JugadorFactory {
    public static Jugador getJugador(JugadorType type){
        switch(type){
            case ARQUERO:
                return new Alisson();
            case DEFENSA:
                return new ThiagoSilva();
            case LATERAL:
                return new Marcelo();
            case MEDIOCAMPISTA:
                return new Paulinho();
            case DELANTERO:
                return new NeymarJr();
        }
        return null;
    }
}
