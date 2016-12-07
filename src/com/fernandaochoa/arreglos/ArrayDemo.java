package com.fernandaochoa.arreglos;

public class ArrayDemo {
    public static void main(String[] args) {
        char anArray[];

        anArray = new char[10];

        for (int i = 0; i < anArray.length; i++) {
            int tmp = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (char) tmp;

            System.out.println("A[" + i + "]=" + anArray[i] + ",");
        }
        System.out.println();
    }
}