package academy.devdojo.maratonajava.introducao.modulo01;

import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco = 98.5;
//        double desconto;
        double desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.05;

//        if ( preco < 20.0) {
//            desconto = preco * 0.1;
//
//        }else{
//            desconto = preco * 0.05;
//        }

        System.out.println(desconto);

        sc.close();
    }
}
