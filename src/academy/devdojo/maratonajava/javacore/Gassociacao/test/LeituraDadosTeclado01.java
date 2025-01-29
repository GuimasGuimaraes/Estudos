package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDadosTeclado01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite seu genero:");
        String genero = entrada.next();


        System.out.println("Lendo seus dados, nome: " + nome + "," + "sua idade é: " + idade +  "," + "Genero: " + genero + ".");
    }
}
