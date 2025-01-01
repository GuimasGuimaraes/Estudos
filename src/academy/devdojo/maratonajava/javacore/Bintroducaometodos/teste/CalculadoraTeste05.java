package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(2,6,8,7,9,147,65,987,541);

    }
}
