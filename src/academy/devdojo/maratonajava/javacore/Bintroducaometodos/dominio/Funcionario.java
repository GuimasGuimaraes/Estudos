package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import static java.lang.System.*;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprime() {
        out.println(this.nome);
        out.println(this.idade);

        for (double salario : salarios) {
            out.print(salario + " ");
        }
    }

    public void media() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;

        }
        media /= salarios.length;
        out.println("\nMédia salarial " + media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
