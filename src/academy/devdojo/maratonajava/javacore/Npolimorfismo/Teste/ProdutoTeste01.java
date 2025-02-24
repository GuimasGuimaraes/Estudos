package academy.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MACBOOK M3 PRO", 15000);
        Tomate tomate = new Tomate("Pera", 12);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
