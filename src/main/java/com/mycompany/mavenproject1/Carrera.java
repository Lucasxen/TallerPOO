
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Carrera {
    
    private String nombre;
    private int ID;
    private Date fechaCarr;

    public Carrera(String nombre, int ID, Date fechaCarr) {
        this.nombre = nombre;
        this.ID = ID;
        this.fechaCarr = fechaCarr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFechaCarr() {
        return fechaCarr;
    }

    public void setFechaCarr(Date fechaCarr) {
        this.fechaCarr = fechaCarr;
    }
    
    
}
