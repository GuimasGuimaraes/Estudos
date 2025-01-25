package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;


    // testando criação de um metodo com tipos definidos
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    // Construtor não pode ter nenhum tipo de retorno;
    // se não definir um construtor na classe o java adiciona um na compilação.
    public Anime(){

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;

    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
