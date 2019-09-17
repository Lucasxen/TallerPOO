
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class DedyCar {
    
    private Date fechaIni, fechaFin;
    private String dedicacion, cargo;

    public DedyCar(Date fechaIni, Date fechaFin, String dedicacion, String cargo) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.dedicacion = dedicacion;
        this.cargo = cargo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
