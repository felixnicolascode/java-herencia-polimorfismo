package com.bytebank.modelo;

public class Contador extends Funcionario{

    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE CONTADOR");
        return 200;
    }
}
