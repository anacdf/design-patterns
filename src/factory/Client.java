package factory;

public class Client {

    public static void main(String[] args) {
        NomesFactory nomesFactory = new NomesFactory();

        Nome nome = nomesFactory.montarNomes("nome", "Pablo", "Escobar");

        Nome sobrenome = nomesFactory.montarNomes("sobrenome", "Pablo", "Escobar");

        System.out.println(nome.getNomeCompleto() + " ou "+ sobrenome.getNomeCompleto());
    }

}
