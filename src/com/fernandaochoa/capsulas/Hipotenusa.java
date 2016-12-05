package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 25
public class Hipotenusa {
    private float opuesto, adyacente;

    public float getAdyacente() {
        return adyacente;
    }

    public float getOpuesto() {
        return opuesto;
    }

    public boolean setOpuesto(float opuesto) {
        if (opuesto > 0) {
            this.opuesto = opuesto;
            return true;
        } else
            return false;
    }

    public boolean setAdyacente(float adyacente) {
        if (adyacente > 0) {
            this.adyacente = adyacente;
            return true;
        } else
            return false;
    }
}
