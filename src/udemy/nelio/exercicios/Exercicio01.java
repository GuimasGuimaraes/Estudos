package udemy.nelio.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero01;
        int numero02;
        int soma;

        System.out.println("Digite o número 01: ");
        numero01 = sc.nextInt();

        System.out.println("Digite o número 02: ");
        numero02 = sc.nextInt();

        soma = numero01 + numero02;


        System.out.println("Número 1: " + numero01 + " Número 2: " + numero02 + " Soma: " + soma);




    }
}
