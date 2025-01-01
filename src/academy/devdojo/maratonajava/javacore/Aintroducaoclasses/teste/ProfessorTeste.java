package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 50;
        professor.nome = "João";
        professor.sexo=  "Masculino";

        System.out.println("Idade do professor: " + professor.idade + "\n Nome do professor: " + professor.nome + "\n Gênero do professor:" + professor.sexo);
    }
}
