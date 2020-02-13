/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author isaac
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        jugador jugador1= new jugador("f","oi","123",20);
        jugador jugador2= new jugador("fd","ghfgdsg","123",20);
        
        jugador[] jugadores = new jugador[5];
        jugadores[0]=jugador1;
        jugadores[1]=jugador2;
        
        equipo equipo = new equipo("quete", "Varones", jugadores);
        equipo[] equipos = new equipo[1];
        equipos[0]=equipo;
        
        campeonato campeonato = new campeonato("Crtergz", equipos);
        campeonato.Imprimir();
    }
    
}
