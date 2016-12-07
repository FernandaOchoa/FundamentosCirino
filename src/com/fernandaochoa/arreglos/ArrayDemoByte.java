package com.fernandaochoa.arreglos;

public class ArrayDemoByte {
    public static void main(String[] args) {
        byte anArray[];

        anArray = new byte[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (byte) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}