package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
