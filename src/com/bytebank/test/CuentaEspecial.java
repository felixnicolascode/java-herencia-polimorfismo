package com.bytebank.test;

// public - Accesible desde cualquier parte
// --default - Accesible dentro del paquete
// ---protected - Default + clases hijas
// ---private - Solo de la clase misma

import com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

    @Override
    public void depositar(double valor) {
        super.saldo=0.0;
    }
}
