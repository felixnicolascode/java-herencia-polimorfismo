package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Cuenta cc = new CuentaCorriente(11,22);
        Cuenta cc2 = new CuentaCorriente(22,44);

        lista.add(cc);
        lista.add(cc2);

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println(obtenerCuenta);
    }
}
