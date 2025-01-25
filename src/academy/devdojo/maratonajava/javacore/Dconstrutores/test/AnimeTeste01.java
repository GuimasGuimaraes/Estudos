package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
       // Anime anime = new Anime("Naruto", "TV", 589, "History", 2006);
        //Anime anime02 = new Anime ("Solo leveling", "TV", 26, "RPG", 2025);

        Anime anime = new Anime("Naruto", "TV", 898, "History", 2006, "Não informado");

        //sobrecarga de construtor
       // Anime anime03 = new Anime();

        anime.imprimir();

    }
}
