package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public  class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 150; // CONSTANTE SEMPRE É EM UPPERCASE

    public final Comprador COMPRADOR = new Comprador();

    public final void imprime (){
        System.out.println("Nome: " + this.nome);
    }


    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
