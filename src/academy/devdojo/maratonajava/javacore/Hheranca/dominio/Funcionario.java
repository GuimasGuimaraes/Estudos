package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

// herança "É UM" extensão das funcionalidades de uma classe

public class Funcionario  extends Pessoa{

    private double salario;
    private String cargo;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
