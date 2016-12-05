package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 27
public class Bono {

    private String nombre;
    private int horasExtra, ausencias;

    public int getAusencias() {
        return ausencias;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

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

    public boolean setAusencias(int ausencias) {
        if (ausencias > 0) {
            this.ausencias = ausencias;
            return true;
        } else
            return false;
    }

    public boolean setHorasExtra(int horasExtra) {
        if (horasExtra > 0) {
            this.horasExtra = horasExtra;
            return true;
        } else
            return false;
    }
}
