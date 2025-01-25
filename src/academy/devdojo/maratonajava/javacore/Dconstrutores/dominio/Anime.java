package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private int anoLancamento;

    // inicializando um objeto sem o init
    public Anime(String nome, String tipo, int episodios, String genero, int anoLancamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Anime(){

    }


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.anoLancamento);
    }


}
