
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author HP871
 */
public class ActaExamenFin {
    
    private boolean estado;
    private ArrayList<Alumno> listaInsc;

    public ActaExamenFin(boolean estado, ArrayList<Alumno> listaInsc) {
        this.estado = estado;
        this.listaInsc = listaInsc;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Alumno> getListaInsc() {
        return listaInsc;
    }

    public void setListaInsc(ArrayList<Alumno> listaInsc) {
        this.listaInsc = listaInsc;
    }
    
}
