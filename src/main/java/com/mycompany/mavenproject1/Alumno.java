
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author HP871
 */
public class Alumno extends Persona {
    
    private String domicilio, localidad, paisR, provincia, correo;
    private Date fecha;
    private int matricula;
    private Carrera carrera;        //a revisar 
    private Asignatura asigC, asigR; //a revisar

    public Alumno(String domicilio, String localidad, String paisR, String provincia, String correo, Date fecha, int matricula, Carrera carrera, Asignatura asigC, Asignatura asigR, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.paisR = paisR;
        this.provincia = provincia;
        this.correo = correo;
        this.fecha = fecha;
        this.matricula = matricula;
        this.carrera = carrera;
        this.asigC = asigC;
        this.asigR = asigR;
    }

    
    
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPaisR() {
        return paisR;
    }

    public void setPaisR(String paisR) {
        this.paisR = paisR;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Asignatura getAsigC() {
        return asigC;
    }

    public void setAsigC(Asignatura asigC) {
        this.asigC = asigC;
    }

    public Asignatura getAsigR() {
        return asigR;
    }

    public void setAsigR(Asignatura asigR) {
        this.asigR = asigR;
    }
    
    
}
