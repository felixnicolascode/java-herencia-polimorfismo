// entidad cuenta
public abstract class Cuenta {
    // atributos
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public static int total = 0; // esta variable pertenece a la clase, no a la instancia

    public Cuenta() {

    }

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

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.retirar(valor);
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


}
