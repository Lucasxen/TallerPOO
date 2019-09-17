
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class ActaParcial {
    
    private Date fechaR;
    private Alumno asist;
    private float notaObt;

    public ActaParcial(Date fechaR, Alumno asist, float notaObt) {
        this.fechaR = fechaR;
        this.asist = asist;
        this.notaObt = notaObt;
    }

    public Date getFechaR() {
        return fechaR;
    }

    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }

    public Alumno getAsist() {
        return asist;
    }

    public void setAsist(Alumno asist) {
        this.asist = asist;
    }

    public float getNotaObt() {
        return notaObt;
    }

    public void setNotaObt(float notaObt) {
        this.notaObt = notaObt;
    }
    
    
    
    //HabRecuperatorio()
    
    
}
