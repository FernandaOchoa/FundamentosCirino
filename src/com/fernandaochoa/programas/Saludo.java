package com.fernandaochoa.programas;

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

    public static void main(String[] args) throws IOException {
        Pizarra p = new Pizarra();
        p.setVisible(true);

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int hora = (cal.get(Calendar.HOUR_OF_DAY));
        int minutos = (cal.get(Calendar.MINUTE));
        int segundos = (cal.get(Calendar.SECOND));

        InputStream in = new FileInputStream("buenosdias.wav");
        AudioStream as = new AudioStream(in);

        InputStream in2 = new FileInputStream("buenastardes.wav");
        AudioStream as2 = new AudioStream(in);

        InputStream in3 = new FileInputStream("buenasnoches.wav");
        AudioStream as3 = new AudioStream(in);

        //AudioPlayer.player.stop(as);

        p.out("Hora: " + hora + "\nminutos: " + minutos + "\nsegundos: " + segundos);

        if (hora < 12) {
            p.out("\nBuenos dias");
            AudioPlayer.player.start(as);
        } else if ((hora >= 12) && (hora < 19 && minutos <= 30)) {
            p.out("\nBuenas Tardes");
            AudioPlayer.player.start(as2);
        } else if (hora > 19 && minutos > 30) {
            p.out("\nBuenas Noches");
            AudioPlayer.player.start(as3);
        }
    }
}

