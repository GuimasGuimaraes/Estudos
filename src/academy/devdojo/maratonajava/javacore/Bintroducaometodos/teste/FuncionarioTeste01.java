package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Guilherme");
        funcionario01.setIdade(28);
        funcionario01.setSalarios(new double[]{1800, 2421, 4741});

        funcionario01.imprime();

        funcionario01.media();



    }
}
