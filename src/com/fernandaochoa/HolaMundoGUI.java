package com.fernandaochoa;
import cstio.*;

import java.awt.Color;

public class HolaMundoGUI {

/*1.- Deseo de Aprender
2.- Puntualidad y asistencia
3.- Disciplina de aprendizaje.
4.- Iniciativa en aplicar los items de evaluacion
5.- Trabajo de equipo.
6.- Liderazgo.*/

    public static void main(String[] args) {
        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String r;

        p.out("Bienvenido a la programacion en Java\n"); //change
        p.setVisible(true);
        r = d.readString("Deseas ver algo bello? s/n:"); //change
        if (r.charAt(0) == 'S' || r.charAt(0) == 's') {
            p.ofoto("images.jpeg");   //change
            p.out("Hola chica\n");  //change
            p.ofoto("mundo.gif");
            p.out("hola mundo\n");
        } else
            p.out("Tal vez en otra ocacion, Adios", "Century Schoolbook L", 28, Color.green);  //change
    }
}



