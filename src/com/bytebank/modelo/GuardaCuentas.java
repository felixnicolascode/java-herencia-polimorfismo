package com.bytebank.modelo;

public class GuardaCuentas {

    // crear un objeto para guardar muchas cuentas
    // permitirnos agregar cuentas con un metodo
    // guardaCuentas.adiciona(cuenta);
    // obtener, remover, etc.

    Cuenta [] cuenta = new Cuenta[10];
    int indice = 0;

    public void adicionar(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }

    public Cuenta obtener(int indice) {
        return cuenta[indice];
    }
}
