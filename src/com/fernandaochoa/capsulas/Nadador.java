package com.fernandaochoa.capsulas;

import com.fernandaochoa.pruebas.PruebaNadador;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 20
public class Nadador {
    private String nombre, pais, resp;
    private int atenas, beijing, londres, rio, sidney;
    private float promedio;

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public String getPais() {
        return pais;
    }

    public boolean setPais(String pais) {
        if (!pais.isEmpty()) {
            this.pais = pais;
            return true;
        } else
            return false;
    }

    public String getResp() {
        return resp;
    }

    public boolean setResp(String resp) {
        if (!resp.isEmpty()) {
            this.resp = resp;
            return true;
        } else
            return false;
    }

    public int getAtenas() {
        return atenas;
    }

    public boolean setAtenas(int atenas) {
        if (atenas > 0) {
            this.atenas = atenas;
            return true;
        }
        return false;
    }

    public int getBeijing() {
        return beijing;
    }

    public boolean setBeijing(int beijing) {
        if (beijing > 0) {
            this.beijing = beijing;
            return true;
        } else
            return false;
    }

    public int getLondres() {
        return londres;
    }

    public boolean setLondres(int londres) {
        if (londres > 0) {
            this.londres = londres;
            return true;
        } else
            return false;
    }

    public int getRio() {
        return rio;
    }

    public boolean setRio(int rio) {
        if (rio > 0) {
            this.rio = rio;
            return true;
        } else {
            return false;
        }
    }

    public int getSidney() {
        return sidney;
    }

    public boolean setSidney(int sidney) {
        if (sidney > 0) {
            this.sidney = sidney;
            return true;
        } else
            return false;
    }

    public float getPromedio() {
        return promedio;
    }

    public boolean setPromedio(float promedio) {
        if (promedio > 0) {
            this.promedio = promedio;
            return true;
        } else
            return false;
    }

    public String printStates() {
        return "Nombre: " + nombre + "\n" +
                "Pais: " + pais + "\n" +
                "Medallas en Sidney: " + sidney + "\n" +
                "Medallas en Atenas: " + atenas + "\n" +
                "Medallas en Beijing: " + beijing + "\n" +
                "Medallas en Londres: " + londres + "\n" +
                "Medallas en Rio: " + rio;

    }

}
