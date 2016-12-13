package com.fernandaochoa.capsulas;

/*Bono.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 27
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

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