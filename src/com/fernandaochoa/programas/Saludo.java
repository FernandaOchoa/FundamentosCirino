package com.fernandaochoa.programas;

import cstio.Pizarra;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

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

        InputStream in = new FileInputStream("hola.wav");
        AudioStream as = new AudioStream(in);
        //AudioPlayer.player.stop(as);

        p.out("Hora: " + hora + "\nminutos: " + minutos + "\nsegundos: " + segundos);

        if (hora < 12) {
            p.out("\nBuenos dias");
            AudioPlayer.player.start(as);
        } else if ((hora >= 12) && (hora < 19 && minutos <= 30)) {
            p.out("\nBuenas Tardes");
            AudioPlayer.player.start(as);
        } else if (hora > 19 && minutos > 30) {
            p.out("\nBuenas Noches");
            AudioPlayer.player.start(as);
        }
    }
}

