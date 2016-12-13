package com.fernandaochoa.capsulas;

/*Aumento.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 24
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

public class Aumento {
    private String nombre;
    private int sueldo;

    public String getNombre (){
        return nombre;
    }
    public int getSueldo() {
        return sueldo;
    }

    public boolean setNombre (String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return  true;
        } else
            return false;
    }

    public boolean setSueldo (int sueldo){
        if (sueldo > 0){
            this.sueldo = sueldo;
            return true;
        } else return false;
    }
}