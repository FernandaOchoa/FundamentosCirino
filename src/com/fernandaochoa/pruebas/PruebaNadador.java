package com.fernandaochoa.pruebas;

/*PruebaNadador.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Días y horario del curso
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Ejercicio #: 28
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import com.fernandaochoa.capsulas.Nadador;
import cstio.*;
import java.io.IOException;

public class PruebaNadador {

    Nadador nadador = new Nadador();
    int totalM;
    double promedio;

    public void inicio() {
        System.out.println("Calcular el promedio de medallas");
        System.out.println("que obtiene un nadador en 5 juegos olimpicos");
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

    public void datos(Nadador nadador) {
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;
        int medalla;

        do v = d.readString("Ingrese el Nombre del Nadador:");
        while (v.isEmpty());
        nadador.setNombre(v);

        do v = d.readString("Ingrese el Pais del Nadador:");
        while (v.isEmpty());
        nadador.setPais(v);

        do v = d.readString("Ingrese las medallas ganadas en Atenas:");
        while (!isNum(v));
        medalla = Integer.parseInt(v);
        nadador.setAtenas(medalla);

        do v = d.readString("Ingrese las medallas ganadas en Sidney:");
        while (!isNum(v));
        medalla = Integer.parseInt(v);
        nadador.setSidney(medalla);

        do v = d.readString("Ingrese las medallas ganadas en Beijing:");
        while (!isNum(v));
        medalla = Integer.parseInt(v);
        nadador.setBeijing(medalla);

        do v = d.readString("Ingrese las medallas ganadas en Londres:");
        while (!isNum(v));
        medalla = Integer.parseInt(v);
        nadador.setLondres(medalla);
        x.setVisible(true);

        do v = d.readString("Ingrese las medallas ganadas en Rio de Janeiro:");
        while (!isNum(v));
        medalla = Integer.parseInt(v);
        nadador.setRio(medalla);
    }

    public void calculos() {
        int medallaSidney = (int) nadador.getSidney();
        int medallaAtenas = (int) nadador.getAtenas();
        int medallaBeijing = (int) nadador.getBeijing();
        int medallaLondres = (int) nadador.getLondres();
        int medallaRio = (int) nadador.getRio();

        int totalG = (medallaAtenas + medallaBeijing + medallaLondres + medallaRio + medallaSidney);
        this.totalM = totalG;
        double total = totalG / 5;
        this.promedio = total;

        System.out.println("El total de medallas ganadas es: " + totalG);
    }

    void resultados() {
        Pizarra p = new Pizarra();
        p.out("Programa del Nadador Olimpico\n");
        p.setVisible(true);

        p.out("\nLos datosLados del nadador son:\n" + nadador.printStates());
        p.out("\n");
        p.out("\n El total de medallas ganadas es: " + totalM);
        p.out("\n El promedio de medallas ganadas es: " + promedio + "\n");
        p.ofoto("nadador.jpg");   //change
    }

    public static void main(String[] args) throws IOException {
        PruebaNadador n = new PruebaNadador();
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        n.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            n.datos(n.nadador);
            n.calculos();
            n.resultados();
            resp = d.readString("¿Desea ver otro nadador? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
