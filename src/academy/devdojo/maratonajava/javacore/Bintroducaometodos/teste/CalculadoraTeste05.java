package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);

//      System.out.println(calculadora.divideDoisNumeros(200,0));
        calculadora.imprimiDivisaoDoisNumeros(200,2);

    }
}
