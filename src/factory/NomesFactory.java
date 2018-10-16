package factory;

/*
    Creators declares a factory method that returns the Product type.
    This method can either be abstract or have some default implementation.
    In the first case, all Concrete Creators must implement their factory methods.
 */
public class NomesFactory {
        private Nome nomeCompleto;

    public Nome montarNomes(String primeiro, String nome, String sobrenome){

        if(primeiro.equalsIgnoreCase("nome")){
            nomeCompleto = new NomeSimples();
            nomeCompleto.setNome(nome);
            nomeCompleto.setSobrenome(sobrenome);
            return nomeCompleto;
        }

        if(primeiro.equalsIgnoreCase("sobrenome")){
            nomeCompleto = new NomeInvertido();
            nomeCompleto.setNome(nome);
            nomeCompleto.setSobrenome(sobrenome);
            return nomeCompleto;
        }

        return null;
    }
}
