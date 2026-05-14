/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author natam
 */
public class Banco {
    
    private String nit;
    private String nombre;
    private ArrayList<Cuenta> lstCuentas;

    public Banco() {
    }

    public Banco(String nit, String nombre, ArrayList<Cuenta> lstCuentas) {
        this.nit = "123456789-01";
        this.nombre = "Banco U.Caldas";
        this.lstCuentas = new ArrayList<>();
    }

    public ArrayList<Cuenta> getLstCuentas() {
        return lstCuentas;
    }

    public void setLstCuentas(ArrayList<Cuenta> lstCuentas) {
        this.lstCuentas = lstCuentas;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    
}

