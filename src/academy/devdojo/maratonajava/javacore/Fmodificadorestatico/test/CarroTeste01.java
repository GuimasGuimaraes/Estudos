package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTeste01 {

    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280,250);

        Carro c2 = new Carro("Mercedes", 275, 250);

        Carro c3 = new Carro("Honda Civic", 240, 200);

        Carro c4 = new Carro("Corolla", 280, 200);


        Carro.setVelocidadeLimite(160);

        c1.imprime();
        c2.imprime();
        c3.imprime();
        c4.imprime();

    }
}
