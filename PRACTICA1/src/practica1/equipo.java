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
public class equipo {

   public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public equipo(String nombreEquipo, String categoria, jugador[] jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

    
    
    public jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
    private String nombreEquipo;
    private String categoria;
    private jugador[] jugadores;
    
    public void Imprimir(){
        System.out.println(this.nombreEquipo);
        System.out.println(this.categoria);
        
        for(int i=0; i<this.jugadores.length;i++){
            this.jugadores[i].Imprimir();
        }
        
     
    }
}
