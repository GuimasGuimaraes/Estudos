package academy.devdojo.maratonajava.javacore.Kenum.dominio;


public class Cliente {
    private String nome;
    private TipoCliente TipoCliente;


    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.TipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.TipoCliente = tipoCliente;
    }
}
