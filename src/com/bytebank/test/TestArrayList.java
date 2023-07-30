package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.cliente.Cliente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // <> Generic - Fuerza a que acepte solo un tipo de objeto
        ArrayList<Cuenta> lista = new ArrayList<>();
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(22, 44);

        lista.add(cc);
        lista.add(cc2);

        Cliente cliente = new Cliente();
        //lista.add(cliente);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

    }
}
