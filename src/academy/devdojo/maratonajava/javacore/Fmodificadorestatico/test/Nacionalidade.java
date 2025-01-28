package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import java.util.Scanner;

public class Nacionalidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nacionalidade");
        String nacionalidade = scanner.next();


        if (nacionalidade.equalsIgnoreCase("Brasil")) {
            System.out.println("Você é brasileiro");
        } else {
            System.out.println("Você é estrangeiro, sua nacionalidade é: " + nacionalidade);

        }




    }
}
