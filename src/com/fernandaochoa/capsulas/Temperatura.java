package com.fernandaochoa.capsulas;
/*NombreDelArchivo.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: __6_
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

//Ejercicio 22
public class Temperatura {
    private float fahrenheit, celsius;

    public boolean setFahrenheit(float fahrenheit){
        if (fahrenheit >0){
            this.fahrenheit = fahrenheit;
            return true;
        } else
            return false;
    }

    public float getFahrenheit(){
        return fahrenheit;
    }

    public boolean setCelsius(float celsius){
        if (celsius > 0){
            this.celsius = celsius;
            return true;
        } else
            return false;
    }
    public float getCelsius(){
        return celsius;
    }
}
