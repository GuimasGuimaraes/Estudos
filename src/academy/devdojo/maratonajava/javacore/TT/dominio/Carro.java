package academy.devdojo.maratonajava.javacore.TT.dominio;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void buzinar() {
        Veiculo.super.buzinar();
    }
}
