package bytebank.test;

import bytebank.modelo.Contador;
import bytebank.modelo.ControlBonificacion;
import bytebank.modelo.Funcionario;
import bytebank.modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        //jimena.setSalario(10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();


        Contador alexis = new Contador();
        alexis.setSalario(5000);

        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);



    }
}
