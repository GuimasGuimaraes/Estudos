package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println("21 - 2");
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {

        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimiDivisaoDoisNumeros(double num1, double num2) {

        if (num2 == 0) {

            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        
    }

    public class ArrayUtils {

        public int somaArray(int[] numeros) {
            if (numeros == null || numeros.length == 0) {
                System.out.println("Array vazio ou nulo.");
                return 0;
            }

            // Usando Java Streams para maior clareza
            int soma = java.util.Arrays.stream(numeros).sum();

            return soma;
        }
    }


    public void somaVarArgs(int... numeros) { // Se tiver mais de um atributo o VarArgs tem que ser o último
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
}
