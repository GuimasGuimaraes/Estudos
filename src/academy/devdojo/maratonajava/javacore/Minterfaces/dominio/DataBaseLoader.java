package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// QUANDO ESTIVER UTILIZANDO INTERFACE EXTENDS NÃO É USADO... E SIM IMPLEMENTS
public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Loading DataBase...");
    }
}
