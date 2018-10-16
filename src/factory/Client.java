package factory;

public class Client {

    public static void main(String[] args) {
        NomesFactory nomesFactory = new NomesFactory();

        Nome nome = nomesFactory.montarNomes("nome", "Ana", "Ferreira");

        Nome sobrenome = nomesFactory.montarNomes("sobrenome", "Ana", "Ferreira");

        System.out.println(nome.getNomeCompleto() + " ou "+ sobrenome.getNomeCompleto());
    }

}
