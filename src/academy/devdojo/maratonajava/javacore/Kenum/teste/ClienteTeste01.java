package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Guilherme", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Guilherme", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente01);
        System.out.println(cliente02);




    }
}
