
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Bitacora {
    
    private Alumno faltas;
    private String temas;
    private Date fecha;

    public Bitacora(Alumno faltas, String temas, Date fecha) {
        this.faltas = faltas;
        this.temas = temas;
        this.fecha = fecha;
    }

    public Alumno getFaltas() {
        return faltas;
    }

    public void setFaltas(Alumno faltas) {
        this.faltas = faltas;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
