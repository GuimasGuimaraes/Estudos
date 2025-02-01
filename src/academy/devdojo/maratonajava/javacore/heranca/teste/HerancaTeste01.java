package academy.devdojo.maratonajava.javacore.heranca.teste;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Antonio mordente filho");
        endereco.setCep("38445-070");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setCpf("12732611603");

    }
}