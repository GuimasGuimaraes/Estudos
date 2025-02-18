package academy.devdojo.maratonajava.javacore.Kenum.dominio;


public class Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }


    private String nome;
    private TipoCliente TipoCliente;
    private TipoPagamento TipoPagamento;

    public Cliente(String nome, academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente tipoCliente, Cliente.TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        TipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                ", TipoClienteInt=" + TipoCliente.getValor() +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }


}
