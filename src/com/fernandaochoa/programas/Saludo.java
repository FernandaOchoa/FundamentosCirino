package com.fernandaochoa.programas;

import cstio.Dialog;
import cstio.Pizarra;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

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

public class Saludo {

    public void inicio(){
        System.out.println("Programa que realiza un saludo del dia dependiendo de la hora de sistema");
    }
    public void datos(){
        System.out.println("Son datos del sistema");
    }
    public void calculos(){
        System.out.println("No hay calculos");
    }
    public void resultados() throws IOException {
        Pizarra p = new Pizarra();
        p.setVisible(true);

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int hora = (cal.get(Calendar.HOUR_OF_DAY));
        int minutos = (cal.get(Calendar.MINUTE));
        int segundos = (cal.get(Calendar.SECOND));

        InputStream inputStream = new FileInputStream("hola.wav");
        AudioStream audioStream = new AudioStream(inputStream);

        InputStream in = new FileInputStream("buenosdias.wav");
        AudioStream as = new AudioStream(in);


        InputStream in2 = new FileInputStream("buenastardes.wav");
        AudioStream as2 = new AudioStream(in2);

        InputStream in3 = new FileInputStream("hola.wav");
        AudioStream as3 = new AudioStream(in3);


        p.out("Hora: " + hora + "\nminutos: " + minutos + "\nsegundos: " + segundos);

        if (hora >= 0 && hora < 12) {
            AudioPlayer.player.start(as);
            p.out("\nBuenos dias");

        } else if ((hora >= 12) && (hora <= 19 && minutos <= 30)) {
            AudioPlayer.player.start(as2);
            p.out("\nBuenas Tardes");
        } else if (hora >= 20 && hora < 24) {
            AudioPlayer.player.start(as3);
            p.out("\nBuenas Noches");

        }

    }

    public static void main(String[] args) throws IOException {
        Saludo s = new Saludo();
        String resp="s";

        s.inicio();
        while (resp.equals("s") || resp.equals("S")) {
            s.datos();
            s.calculos();
            s.resultados();
            Pizarra x = new Pizarra();
            Dialog d = new Dialog();
            resp = d.readString("¿Desea saludar de nuevo? s/n");
            System.in.skip(2);
        }

    }
}
