package academy.devdojo.maratonajava.introducao.modulo02;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de quantas vezes somará os dados de entrada");
        int N = sc.nextInt();
        int soma = 0;


        for (int i=0; i < N; i++){
            System.out.println("digite um número para soma:");
            int x = sc.nextInt();
            soma = soma + x;
            System.out.println("Resultado da soma: " + soma);



        }
    }
}
