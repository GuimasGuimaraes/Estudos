package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setIdade(28);


        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
