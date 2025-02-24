package udemy.nelio.semana01;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        String s1, s2, s3;


        System.out.println("Digite primeiro o número correspondente a turma: " + "\n" + "Posteriormente o nome dos alunos: ");



        x = scanner.nextInt();
        scanner.nextLine(); // nextLine usado para consumir a quebra de linha pendente.
        s1=scanner.nextLine();
        s2=scanner.nextLine();
        s3=scanner.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1+"\n"+ s2+ "\n"+ s3);


    }

}
