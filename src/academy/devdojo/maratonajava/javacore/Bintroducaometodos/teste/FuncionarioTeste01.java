package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Guilherme";
        funcionario01.idade = 27;
        funcionario01.salarios = new double[]{1800, 2421, 4741};

        funcionario01.imprime();

        funcionario01.media();



    }
}
