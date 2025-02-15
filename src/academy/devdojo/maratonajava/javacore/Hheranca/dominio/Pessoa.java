package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    private String nome;
    private String cpf;
    private Endereco endereco;
    private String cargo;



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);

        if (this.cargo != null) {
            System.out.println(this.cargo);
        } else {
            System.out.println("Não possui cargo");
        }

        System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
