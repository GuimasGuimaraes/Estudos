package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        estudante.idade = scanner.nextInt();

        System.out.println("Digite seu nome");
        estudante.nome = scanner.next();

        System.out.println("Digite seu genero");
        estudante.sexo= scanner.next();

        System.out.println("Sua idade é:  " + estudante.idade + " anos");
        System.out.println("Seu nome é:  " + estudante.nome);
        System.out.println("Você é do genero:  " + estudante.sexo);


    }
}
