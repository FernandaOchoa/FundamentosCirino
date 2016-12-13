package com.fernandaochoa.tareas;

/*Ashe.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Fundamentos de Programación.
  Lun - Miércoles 10:30/12:10 Viernes 10:30/11:20
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: __3_____
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/

import cstio.Dialog;
import cstio.Pizarra;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ashe {
    CapsulaAshe capsulaAshe = new CapsulaAshe();

    double vida, dañoAtaque, vAtaque, rVida, armadura;
    int vMovimiento, rMagica;

    //Meta
    public void inicio() {
        System.out.println("Programa de la Best Arquera de Freljord");
    }

    //Validacion de numeros por teclado
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
    //Captura de datosLados
    public  void datos(CapsulaAshe ashe){

        //Preparamos interfaz y variables
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;

        //Ingresamos la cantidad de vida
        x.setVisible(true);
        do v = d.readString("Ingrese la cantidad de vida que tiene Ashe:");
        while (!isNum(v));
        vida = Double.parseDouble(v);
        ashe.setVida(vida);

        //Ingresamos la velocidad de Ataque
        x.setVisible(true);
        do v = d.readString("Ingrese la velocidad de Ataque que tiene Ashe:");
        while (!isNum(v));
        vAtaque = Double.parseDouble(v);
        ashe.setVAtaque(vAtaque);

        //Ingresamos el daño de Ataque
        x.setVisible(true);
        do v = d.readString("Ingrese el daño de Ataque que tiene Ashe:");
        while (!isNum(v));
        dañoAtaque = Double.parseDouble(v);
        ashe.setDañoAtaque(dañoAtaque);

        //Ingresamos la velocidad de Movimiento
        x.setVisible(true);
        do v = d.readString("Ingrese la velocidad de movimiento que tiene Ashe:");
        while (!isNum(v));
        vMovimiento = Integer.parseInt(v);
        ashe.setVMovimiento(vMovimiento);

        //Ingresamos la regeneracion de vida
        x.setVisible(true);
        do v = d.readString("Ingrese la regeneracion de vida que tiene Ashe:");
        while (!isNum(v));
        rVida = Double.parseDouble(v);
        ashe.setRegeneracionVida(rVida);

        //Ingresamos la cantidad de Armadura
        x.setVisible(true);
        do v = d.readString("Ingrese la cantidad de Armadura que tiene Ashe:");
        while (!isNum(v));
        armadura = Double.parseDouble(v);
        ashe.setArmadura(armadura);

        //Ingresamos la cantidad de Resistencia Magica
        x.setVisible(true);
        do v = d.readString("Ingrese la cantidad de Resistencia Magica que tiene Ashe:");
        while (!isNum(v));
        rMagica = Integer.parseInt(v);
        ashe.setRMagica(rMagica);

    }
    // Resultados
    void resultados() {
        Pizarra p = new Pizarra();
        p.out("Programa para visualizar las caracteristicas dadas de Ashe\n"); //change
        p.setVisible(true);

        try {
            InputStream inputStream = new FileInputStream("ashe.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        p.out("Las caracteristicas de Ashe son \n" +
                "Vida: " + capsulaAshe.getVida() +
                "\nDaño de Ataque: " + capsulaAshe.getDañoAtaque() +
                "\nVelocidad de Ataque " + capsulaAshe.getvAtaque() +
                "\nVelocidad de Movimiento " + capsulaAshe.getvMovimiento() +
                "\nRegeneracion de Vida " + capsulaAshe.getrVida() +
                "\nArmadura " + capsulaAshe.getArmadura() +
                "\nResistencia Magica " + capsulaAshe.getrMagica());
        p.out("\n");
        p.ofoto("ashe.jpg");
    }

    public static void main(String[] args) throws IOException {
        Ashe a = new Ashe();

        Pizarra p = new Pizarra();
        Dialog d = new Dialog();
        String resp = "s";

        a.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            a.datos(a.capsulaAshe);
            a.resultados();
            resp = d.readString("¿Desea ver otra build? s/n");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }

}
