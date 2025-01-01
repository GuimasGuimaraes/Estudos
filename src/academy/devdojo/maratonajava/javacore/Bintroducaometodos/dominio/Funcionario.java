package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import static java.lang.System.*;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

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

}
