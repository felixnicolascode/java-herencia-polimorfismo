package bytebank.test;

import bytebank.modelo.CuentaAhorro;
import bytebank.modelo.CuentaCorriente;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = null;
        //bytebank.modelo.CuentaCorriente cc = new bytebank.modelo.CuentaCorriente(1,1);
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
