package com.fernandaochoa.capsulas;


public class Nacimiento {
    private int año;
    private int mes;
    private int dia;
    public int getaño(){return año;}
    public int getmes(){return mes;}
    public int getdia(){return dia;}


    public boolean setaño (int año){
        if (año>0) {
            this.año = año;
            return true;
        }
        else return false;
    }

    public boolean setmes (int mes){
        if (mes>0) {
            this.mes = mes;
            return true;
        }
        else return false;
    }
    public boolean setdia (int dia){
        if (dia>0) {
            this.dia = dia;
            return true;
        }
        else return false;
    }

}
