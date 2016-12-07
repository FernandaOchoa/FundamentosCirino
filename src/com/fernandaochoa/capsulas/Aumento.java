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

//Ejercicio 24

public class Aumento {
    private String nombre;
    private int sueldo;

    public boolean setNombre (String nombre){
        if (!nombre.isEmpty()){
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

    public int getSueldo() {
        return sueldo;
    }
}
