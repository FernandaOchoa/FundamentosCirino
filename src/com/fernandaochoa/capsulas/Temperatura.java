package com.fernandaochoa.capsulas;

/**
 * Created by monsh on 03/12/2016.
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
