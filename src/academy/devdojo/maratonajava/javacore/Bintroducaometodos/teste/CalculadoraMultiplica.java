package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraMultiplica {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Números multiplicados:");
        calculadora.multiplicaDoisNumeros(5,0); // como tem um float tem que inserir o F no fim do ultimo parametro


        calculadora.multiplicaDoisNumeros(10,10);

    }

}
