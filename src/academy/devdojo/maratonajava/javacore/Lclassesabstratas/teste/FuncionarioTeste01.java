package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Guilherme do futuro", 8200);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme daqui uns tempos", 12000);


        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
