
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author HP871
 */
public class Asignatura {
    
    private String nombre;
    private int codigo, cargHor, anioC, CantPar;
    private boolean cuatAnual, promFin;
    private Docente docR;
       
    private ArrayList<Docente> equiDoc;

    public Asignatura(String nombre, int codigo, int cargHor, int anioC, int CantPar, boolean cuatAnual, boolean promFin, Docente docR, ArrayList<Docente> equiDoc) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cargHor = cargHor;
        this.anioC = anioC;
        this.CantPar = CantPar;
        this.cuatAnual = cuatAnual;
        this.promFin = promFin;
        this.docR = docR;
        this.equiDoc = equiDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargHor() {
        return cargHor;
    }

    public void setCargHor(int cargHor) {
        this.cargHor = cargHor;
    }

    public int getAnioC() {
        return anioC;
    }

    public void setAnioC(int anioC) {
        this.anioC = anioC;
    }

    public int getCantPar() {
        return CantPar;
    }

    public void setCantPar(int CantPar) {
        this.CantPar = CantPar;
    }

    public boolean isCuatAnual() {
        return cuatAnual;
    }

    public void setCuatAnual(boolean cuatAnual) {
        this.cuatAnual = cuatAnual;
    }

    public boolean isPromFin() {
        return promFin;
    }

    public void setPromFin(boolean promFin) {
        this.promFin = promFin;
    }

    public Docente getDocR() {
        return docR;
    }

    public void setDocR(Docente docR) {
        this.docR = docR;
    }

    public ArrayList<Docente> getEquiDoc() {
        return equiDoc;
    }

    public void setEquiDoc(ArrayList<Docente> equiDoc) {
        this.equiDoc = equiDoc;
    }
    

    
}
