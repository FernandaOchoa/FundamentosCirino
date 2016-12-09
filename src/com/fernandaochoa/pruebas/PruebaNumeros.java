package com.fernandaochoa.pruebas;

import com.fernandaochoa.capsulas.Numeros;
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
public class PruebaNumeros {
    Numeros numeros = new Numeros();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();

    int x1, x2, x3, mayor;
    char cantidad;

    public void inicio() {
        System.out.println("Programa Mayor de 3 numeros");
    }

    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se admiten valores numericos");
        }
        return false;
    }

    public void datos(Numeros numeros){
        String v;
        int n;

        p.setVisible(true);
        do v = d.readString("Ingrese el valor del primer numero:");
        while (!isNum(v));
        n = Integer.parseInt(v);
        numeros.setX1(n);

        p.setVisible(true);
        do v = d.readString("Ingrese el valor del segundo numero:");
        while (!isNum(v));
        n = Integer.parseInt(v);
        numeros.setX2(n);

        p.setVisible(true);
        do v = d.readString("Ingrese el valor del tercer numero:");
        while (!isNum(v));
        n = Integer.parseInt(v);
        numeros.setX3(n);
    }

    public void calculos(){
        x1 = numeros.getX1();
        x2 = numeros.getX2();
        x3 = numeros.getX3();

        if ((x1>x2)&(x1 > x3)){
            mayor = x1;
            cantidad = 'a';
        }
        else if ((x2 > x1)&(x2 >x3)){
            mayor = x2;
            cantidad = 'b';
        } else if ((x3 > x1)& (x3>x2)){
            mayor = x3;
            cantidad = 'c';
        }

    }

    void resultados(){
        if (x1==x2 && x2 == x3){
            p.out("Las 3 cantidades son iguales");
        } else if (x1 == x2){
            p.out("\n La cantidad 1 es igual a la cantidad 2 = "+x1);
        } else if (x1 == x3){
            p.out("\n La cantidad 1 es igual a la cantidad 3 = "+x3);
        } else if (x2 == x3){
            p.out("\n La cantidad 2 es igual a la cantidad 3= "+x2);
        }

        p.out("\n La cantidad mayor es: "+mayor);
        p.out("\n La variable es: "+cantidad+"\n");
        p.ofoto("numeros.jpg");
    }

    public static void main(String[] args) throws IOException{
        PruebaNumeros pn = new PruebaNumeros();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        pn.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            pn.datos(pn.numeros);
            pn.calculos();
            pn.resultados();
            resp = d.readString("¿Desea calcular otro numero? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
