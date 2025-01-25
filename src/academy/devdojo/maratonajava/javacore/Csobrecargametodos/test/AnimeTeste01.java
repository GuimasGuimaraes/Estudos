package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime();

//
//        anime.setNome("Anime: Solo Leveling");
//        anime.setTipo("Tipo: TV");
//        anime.setEpisodios(28);

        // testando o metodo com tipos definidos
        anime.init("Solo Leveling", "RPG", 16);
        anime.init("Solo Leveling", "RPG", 16, "Ação");

        anime.imprimir();
    }
}
