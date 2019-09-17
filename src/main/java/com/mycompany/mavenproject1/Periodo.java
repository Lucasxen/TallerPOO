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
public class Periodo {
    
    private Date anio;
    private int cuat;

    public Periodo(Date anio, int cuat) {
        this.anio = anio;
        this.cuat = cuat;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public int getCuat() {
        return cuat;
    }

    public void setCuat(int cuat) {
        this.cuat = cuat;
    }
    
}
