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
public class campeonato {

    public campeonato(String nombreCampeonato, equipo[] equipo) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipo = equipo;
    }
     private String nombreCampeonato;
    private equipo[] equipo;


    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }


    
    

    public equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo[] equipo) {
        this.equipo = equipo;
    }
    
   
    
    public void Imprimir(){
        System.out.println(this.nombreCampeonato);
        for (int i=0; i<this.equipo.length;i++ ){
            this.equipo[i].Imprimir();
        }
    }
    
    
}
