package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// QUANDO ESTIVER UTILIZANDO INTERFACE EXTENDS NÃO É USADO... E SIM IMPLEMENTS
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading DataBase...");
    }

    @Override
    public void remover() {
        System.out.println("Removing DataBase...");
    }

    public void checkPermission(){
        System.out.println("Checking Permission in database...");
    }
}
