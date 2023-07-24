public class TestCuentaExceptionSaldo {
    public static void main(String[] args)  {
        Cuenta cuenta = new CuentaAhorro(123,456);
        cuenta.depositar(210);
        try {
            cuenta.retirar(200);
            cuenta.retirar(10);
        } catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }


    }
}
