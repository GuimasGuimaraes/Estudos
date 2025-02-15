package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Antonio mordente filho");
        endereco.setCep("38445-070");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setCpf("12732611603");

        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        System.out.println("-----------------");

        funcionario.setNome("Guilherme");
        funcionario.setCargo("Analista de Sistemas");
        funcionario.setCpf("12732611603");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4000);

        funcionario.imprime();





    }
}