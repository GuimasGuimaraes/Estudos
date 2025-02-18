package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {

    private String nome;
    private static final double VELOCIDADE_LIMITE = 150; // CONSTANTE SEMPRE É EM UPPERCASE

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
