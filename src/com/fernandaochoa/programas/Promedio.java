package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;
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

public class Promedio {
    Pizarra p = new Pizarra();

    public void inicio() {
        System.out.println("Para calcular el promedio de los numeros Reales");
    }

    int [] numeros =new int[100];

    int i=0 ,control,promedio,suma;


    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }

    public void datos(){
        Dialog d = new Dialog();
        String aux;

        int numero=1;

        while(numero!=0){
            do{
                aux = d.readString("Introduce un valor para promediar,\n"
                        + "para salir introduce 0");
            }while(!isNum(aux));
            numero = Integer.parseInt(aux);
            numeros[i]=numero;
            suma = suma + numero;
            if(Integer.parseInt(aux)==0) {
                i++;
                control = control + 1;
            }
        }

    }

    public void calculos() {
        promedio = suma/control;
    }

    void resultados() {

        p.setVisible(true);

        p.out("\nEl promedio de los datos " );
        p.out("\n es "+promedio+"\n");
        p.ofoto("promedio.png");
    }

    public static void main(String[] args) throws IOException {
        Promedio promedio = new Promedio ();
        String resp = "s";

        promedio.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            promedio.datos();
            promedio.calculos();
            promedio.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea calcular otro promedio? s/n");
            System.in.skip(2);
        }
    }

}
