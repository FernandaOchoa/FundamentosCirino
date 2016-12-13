package com.fernandaochoa.capsulas;
/*Temperatura.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 22
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

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