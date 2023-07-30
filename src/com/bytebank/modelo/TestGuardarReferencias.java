package com.bytebank.modelo;

public class TestGuardarReferencias {
    public static void main(String[] args) {
        GuardarReferencias guardarReferencias = new GuardarReferencias();
        Cuenta cc = new CuentaCorriente(11,22);
        guardarReferencias.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22,44);
        guardarReferencias.adicionar(cc2);

        System.out.println(guardarReferencias.obtener(0));
        System.out.println(guardarReferencias.obtener(1));
    }

}
