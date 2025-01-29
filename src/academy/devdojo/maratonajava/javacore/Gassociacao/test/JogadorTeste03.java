package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Arrascaeta");
        Jogador jogador02 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador02};

        time.setJogadores(jogadores);

        jogador.setTime(time);
        jogador02.setTime(time);

        System.out.println("--------- Jogador -----------");

        jogador.imprimir();

        System.out.println("--------- Time -----------");

        time.imprime();

    }
}
