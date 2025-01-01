package academy.devdojo.maratonajava.introducao.modulo02;

import java.util.Scanner;

public class EstruturaRepetitiva {
    public static void main(String[] args) {
        // recomendada quando não sabe previamente a quantidade de repetições.


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int soma = 0;
        while (x !=0) {
            soma = soma + x;
            x = sc.nextInt();

        }

        System.out.println("Valor da soma: " + soma);

        sc.close();
    }


}
