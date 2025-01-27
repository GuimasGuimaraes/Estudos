package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

// O modificador de acesso static fará com que o atributo pertença a classe, e todos os objetos irão compartilhar o mesmo valor.
// Caso algum dado seja alterado o mesmo será alterado para todas as classes.

public class Carro {

    private String nome;
    private double velocidadeMaxima;

    // inserindo a palavra static quando tiver alterações todos os objetos serão alterados.
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Nome " + Carro.velocidadeLimite);
        System.out.println("Nome " + this.velocidadeMaxima);
    }

    // Dentro do metodo static não existe this, o mesmo faz referência a instância.
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;

    }

    // metodos static não pode acessar variaveis de instância. pq existe a possibilidade de não existir o objeto em memoria.
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
