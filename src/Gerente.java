public class Gerente extends Funcionario {

    private String clave;
    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnline";
    }

    public double getBonificacion(){
        return super.getSalario();
    }


}
