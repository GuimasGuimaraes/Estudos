package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Solo Leveling");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

        System.out.println("Testando");


    }
}
