package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Honda Civic";
        carro01.modelo = "Honda";
        carro01.ano = 2007;

        carro02.nome = "Corolla";
        carro02.modelo = "Toyota";
        carro02.ano = 2009;

        System.out.println("Nome do veiculo : " + carro01.nome + "\nModelo: " + carro01.modelo + "\nAno: " + carro01.ano);
        System.out.println("-------------------------------------------------------");
        System.out.println("Nome do veiculo : " + carro02.nome + "\nModelo: " + carro02.modelo + "\nAno: " + carro02.ano);
    }
}
