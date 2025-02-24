package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// QUANDO ESTIVER UTILIZANDO INTERFACE EXTENDS NÃO É USADO... E SIM IMPLEMENTS
public class DataBaseLoader implements DataLoader, DataRemover {

    // ordem de restrições
    // private -> default -> protected -> public

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


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface DataBaseLoader");
    }
}
