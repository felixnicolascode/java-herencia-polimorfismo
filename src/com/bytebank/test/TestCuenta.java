package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = null;
        //com.bytebank.modelo.CuentaCorriente cc = new com.bytebank.modelo.CuentaCorriente(1,1);
        CuentaAhorro ca = new CuentaAhorro(2,3);
        int num=0;
        int resultado=30/num;
        System.out.println(resultado);

        cc.depositar(2000);
        cc.transferir(1000,ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());

    }
}
