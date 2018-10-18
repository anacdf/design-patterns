package factory;


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
