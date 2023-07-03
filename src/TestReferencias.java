public class TestReferencias {
    public static void main(String[] args) {
        // elemento generico puede ser adaptado al elemento mas especifico

        Funcionario funcionario = new Contador();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    }
}
