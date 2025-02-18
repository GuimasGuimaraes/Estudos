package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        Comprador comprador02 = new Comprador();

        carro.COMPRADOR.setNome("Guilherme");
        carro.setNome("Honda Civic");
        System.out.println(carro.getNome() + " velocidade maxima: " + carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);





    }
}
