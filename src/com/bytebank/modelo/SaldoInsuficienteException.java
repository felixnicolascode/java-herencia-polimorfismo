package com.bytebank.modelo;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
