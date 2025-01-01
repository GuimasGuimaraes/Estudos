package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante) {

        System.out.println("---------------------");

        System.out.println(estudante.nome + "\n" + estudante.idade + "\n" + estudante.sexo);


    }
}
