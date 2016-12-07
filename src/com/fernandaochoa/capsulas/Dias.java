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

public class Dias {
    private int año;
    private int mes;
    private int dia;

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public boolean setAño(int año) {
        if (año > 0) {
            this.año = año;
            return true;
        } else return false;
    }

    public boolean setMes(int mes) {
        if (mes > 0) {
            this.mes = mes;
            return true;
        } else return false;
    }

    public boolean setDia(int dia) {
        if (dia > 0) {
            this.dia = dia;
            return true;
        } else return false;
    }
}
