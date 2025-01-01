package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Naruto";
        estudante01.idade = 19;
        estudante01.sexo = "Masculino";


        estudante02.nome = "Hinata";
        estudante02.idade = 18;
        estudante02.sexo = "Feminino";

        estudante01.imprime();
        estudante02.imprime();

    }
}
