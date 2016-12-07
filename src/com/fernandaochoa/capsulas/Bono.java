package com.fernandaochoa.capsulas;

/*NombreDelArchivo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: _______
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
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
