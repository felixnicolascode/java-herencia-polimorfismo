package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;

public class TestString {
    public static void main(String[] args) {
        String nombre = "Alura"; // el string nace y nunca es modificado
        //String nombre2 = new String("Alura");

        //System.out.println("Antes de replace: "+nombre);
        nombre = nombre.replace("A","a");
        nombre = nombre.concat(" cursos online");
        nombre = nombre.toUpperCase();
        //System.out.println(nombre);
        nombre = nombre.toLowerCase();
        char letra = nombre.charAt(3);
        int indice = nombre.indexOf("e");
        Object cuenta = new CuentaAhorro(344,544);
        //printLine(letra);
        printLine(letra);
        printLine(nombre);
        printLine(indice);
        printLine(new CuentaAhorro(200,300));

        /*printLine("Despues de replace: "+nombre);
        printLine("Indice: " +indice);*/
    }
    public static void printLine(Object valor){
        System.out.println(valor);
    }
    public static void printLine(String valor){
        System.out.println(valor);
    }
    public static void printLine(char valor){
        System.out.println(valor);
    }
}
