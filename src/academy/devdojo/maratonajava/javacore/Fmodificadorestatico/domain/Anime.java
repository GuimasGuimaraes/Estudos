package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - bloco de inicialização é executado
    // 1 - Alocado espaco em memoria pro objeto
    // 2- Cada atributo de classe é criado e iniciado com valores default ou valores inseridos
    // 3- O bloco de inicialização é executado primeiro
    // 4- Construtor é executado.

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[15];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){

        this.nome = nome;
    }


    public Anime(){
        for (int episodios: Anime.episodios){
            System.out.println(episodios + " ");
        }

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
}
