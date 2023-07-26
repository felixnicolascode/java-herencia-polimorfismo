package com.bytebank.modelo;
/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente
 *
 * @version 1.0
 * @author felixmorales
 *
 */

import com.bytebank.modelo.cliente.Cliente;

// entidad cuenta
public abstract class Cuenta {
    // atributos
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public static int total = 0; // esta variable pertenece a la clase, no a la instancia

    /**
     * Instancia una nueva cuenta sin parametros
     */
    public Cuenta() {

    }
    /**
     * Instancia una nueva cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */

    public Cuenta(int agencia, int numero) {

        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
            this.numero = numero;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas.");
    }

    // metodos
    public abstract void depositar(double valor);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error
     * devuelve una excepcion
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void retirar(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    }

    public boolean transferir (double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            try{
                this.transferir(valor, cuenta);
            } catch (SaldoInsuficienteException e){
                e.printStackTrace();
            }
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos los negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    public String toString(){
        String cuenta = "Numero: "+this.numero+", Agencia: "+ this.agencia;
        return cuenta;
    }


}
