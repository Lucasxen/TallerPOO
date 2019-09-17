
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Docente extends Persona{
    
    
    private int legajo;
    private Date fechaInicio;

    public Docente(int legajo, Date fechaInicio, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.legajo = legajo;
        this.fechaInicio = fechaInicio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
}
