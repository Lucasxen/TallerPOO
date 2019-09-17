/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Cronograma {
    
    private int periodo;
    private Date fecha, horaExamen;
    private boolean modalidad;
    private Docente docyRol;

    public Cronograma(int periodo, Date fecha, Date horaExamen, boolean modalidad, Docente docyRol) {
        this.periodo = periodo;
        this.fecha = fecha;
        this.horaExamen = horaExamen;
        this.modalidad = modalidad;
        this.docyRol = docyRol;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraExamen() {
        return horaExamen;
    }

    public void setHoraExamen(Date horaExamen) {
        this.horaExamen = horaExamen;
    }

    public boolean isModalidad() {
        return modalidad;
    }

    public void setModalidad(boolean modalidad) {
        this.modalidad = modalidad;
    }

    public Docente getDocyRol() {
        return docyRol;
    }

    public void setDocyRol(Docente docyRol) {
        this.docyRol = docyRol;
    }
    
}
