package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("CR7");
        Jogador jogador4 = new Jogador("Messi");
        Jogador jogador5 = new Jogador("Ronaldo");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3, jogador4, jogador5};

        // for para imprimir o array
        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }

    }
}
