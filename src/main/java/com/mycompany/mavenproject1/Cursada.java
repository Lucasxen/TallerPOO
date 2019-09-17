
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Cursada {
    
    private Date fechaIns;
    private float notaFin;

    public Cursada(Date fechaIns, float notaFin) {
        this.fechaIns = fechaIns;
        this.notaFin = notaFin;
    }

    public Date getFechaIns() {
        return fechaIns;
    }

    public void setFechaIns(Date fechaIns) {
        this.fechaIns = fechaIns;
    }

    public float getNotaFin() {
        return notaFin;
    }

    public void setNotaFin(float notaFin) {
        this.notaFin = notaFin;
    }
    
}
