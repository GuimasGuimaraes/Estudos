package academy.devdojo.maratonajava.introducao.modulo02;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeGrausC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite um valor em graus Celsius para converter para Farenheit: ");
            double c = sc.nextDouble();
            double F = 9.0 * c / 5.0 + 32.0;
            System.out.print("Equivalente em Farenheit: " + F);
            System.out.print(" Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);



        }while (resp != 'n');

        sc.close();
        
    }
}
