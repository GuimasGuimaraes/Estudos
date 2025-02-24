package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// TODAS OS METODOS DAS INTERFACES NO JAVA SÃO PUBLIC ABSTRACT, POR ISSO NÃO É NECESSÁRIO COLOCAR
// TODOS OS ATRIBUTOS DE UMA INTERFACE SÃO CONSTANTES

public interface DataLoader {
    int  MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

     static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
