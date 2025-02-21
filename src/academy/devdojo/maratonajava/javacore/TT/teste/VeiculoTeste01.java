package academy.devdojo.maratonajava.javacore.TT.teste;

import academy.devdojo.maratonajava.javacore.TT.dominio.Carro;
import academy.devdojo.maratonajava.javacore.TT.dominio.Veiculo;

public class VeiculoTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.acelerar();
        carro.buzinar();

        Veiculo.informacoesGerais(); // Chama o metodo static da interface
    }
}
