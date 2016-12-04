package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 21
public class Cohete {

    private int hora, minuto, segundo, tiempo;

    public boolean setHora(int hora) {
        if (hora > 0) {
            this.hora = hora;
            return true;
        } else
            return false;
    }

    public int getHora() {
        return hora;
    }

    public boolean setMinuto(int minuto) {
        if (minuto > 0) {
            this.minuto = minuto;
            return true;
        } else
            return false;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setSegundo(int segundo) {
        if (segundo > 0) {
            this.segundo = segundo;
            return true;
        } else
            return false;
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setTiempo(int tiempo) {
        if (tiempo > 0) {
            this.tiempo = tiempo;
            return true;
        } else return false;
    }

    public int getTiempo() {
        return tiempo;
    }

}
