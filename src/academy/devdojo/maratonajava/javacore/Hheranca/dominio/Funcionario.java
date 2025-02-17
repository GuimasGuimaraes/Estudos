package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

// herança "É UM" extensão das funcionalidades de uma classe

public class Funcionario extends Pessoa {

    private double salario;
    private String cargo;

    public void imprime() {
        // super executa o metodo imprime e posteriormente executa o metodo que está subscrevendo
        super.imprime();

        if (this.cargo != null) {
            System.out.println(this.cargo);
        } else {
            System.out.println("Não possui cargo");
        }
        System.out.println(this.salario);
    }




    public void relatorioPagamento (){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
