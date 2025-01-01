package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

// entendendo as passagens de parametros

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = 1;
        int numero2 = 2;

        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println(numero1);
        System.out.println(numero2);
    }

}
