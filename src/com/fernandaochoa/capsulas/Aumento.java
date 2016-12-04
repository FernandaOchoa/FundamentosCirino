package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
 */
//Ejercicio 24

public class Aumento {
    private String nombre;
    private int sueldo;

    public boolean setNombre (String nombre){
        if (nombre == null){
            this.nombre = nombre;
            return  true;
        } else
            return false;
    }

    public String getNombre (){
        return nombre;
    }
    public boolean setSueldo (int sueldo){
        if (sueldo > 0){
            this.sueldo = sueldo;
            return true;
        } else return false;
    }
}
