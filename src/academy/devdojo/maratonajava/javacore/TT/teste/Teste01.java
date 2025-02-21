package academy.devdojo.maratonajava.javacore.TT.teste;

import academy.devdojo.maratonajava.javacore.TT.dominio.Animal;
import academy.devdojo.maratonajava.javacore.TT.dominio.Cachorro;
import academy.devdojo.maratonajava.javacore.TT.dominio.Gato;

public class Teste01 {
    public static void main(String[] args) {

        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom();
        meuGato.fazerSom();

    }


}
