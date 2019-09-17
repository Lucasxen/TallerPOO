
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class PlanDeEstudio {
    
    private Date fechaImpl, vigencia;
    private int cantAnio, duracion;
    private Asignatura asignatura; 

    public PlanDeEstudio(Date fechaImpl, Date vigencia, int cantAnio, int duracion, Asignatura asignatura) {
        this.fechaImpl = fechaImpl;
        this.vigencia = vigencia;
        this.cantAnio = cantAnio;
        this.duracion = duracion;
        this.asignatura = asignatura;
    }

    public Date getFechaImpl() {
        return fechaImpl;
    }

    public void setFechaImpl(Date fechaImpl) {
        this.fechaImpl = fechaImpl;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public int getCantAnio() {
        return cantAnio;
    }

    public void setCantAnio(int cantAnio) {
        this.cantAnio = cantAnio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    
    
}
