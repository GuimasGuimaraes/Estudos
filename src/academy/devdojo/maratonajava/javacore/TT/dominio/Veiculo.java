package academy.devdojo.maratonajava.javacore.TT.dominio;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("BEEP BEEP!");
    }

    static void informacoesGerais(){
        System.out.println("Esse carro é da cor Preta");
    }
}
