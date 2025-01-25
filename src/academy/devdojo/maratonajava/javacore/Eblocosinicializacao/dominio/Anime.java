package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaco em memoria pro objeto
    // 2- Cada atributo de classe é criado e iniciado com valores default ou valores inseridos
    // 3- O bloco de inicialização é executado primeiro
    // 4- Construtor é executado.
    {
        episodios = new int[10];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }

    }

    public Anime (String nome){
        this.nome = nome;
    }


    public Anime(){
        episodios = new int[41];
        System.out.println(episodios);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
