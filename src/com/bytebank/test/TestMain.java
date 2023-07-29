package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {

        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;

        // quiero agruparlas en una sola referencia
        int[] edades = new int[5];
        edades[2] = 30;
        System.out.println(edades[2]);
        System.out.println(edades[0]);
        System.out.println(edades[4]);

        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int i = 0; i < edades.length;i++){
            System.out.println(edades[i]);
        }

    }

}
