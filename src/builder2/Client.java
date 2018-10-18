package builder2;

public class Client {

    public static void main(String[] args) {
        //Contato Completo
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eduarda");
        pessoa.setEndereco("Ipiranga 7200");
        pessoa.setTelefone("3334-5740");
        pessoa.setEmail("eduardad1@gmail.com");

        ContatoBuilder builder = new ContatoCompletoBuilder();

        Contato contato = directBuild(builder, pessoa);

        System.out.println(contato.toString());

        //Contato Internet
        Pessoa pessoaInternet = new Pessoa();
        pessoaInternet.setNome("Eduarda");
        pessoaInternet.setEmail("eduardad1@gmail.com");

        ContatoBuilder builderInternet = new ContatoInternetBuilder();

        Contato contatoInternet = directBuild(builderInternet, pessoaInternet);

        System.out.println("\n"+contatoInternet.toString());

        //Contato Telefone
        Pessoa pessoaTel = new Pessoa();
        pessoaTel.setNome("Eduarda");
        pessoaTel.setTelefone("3334-5740");

        ContatoBuilder builderTel = new ContatoTelefoneBuilder();

        Contato contatoTel = directBuild(builderTel, pessoaTel);

        System.out.println("\n"+contatoTel.toString());
    }

    //Director
    private static Contato directBuild(ContatoBuilder builder, Pessoa pessoa){
        Contato contato;
        if(pessoa.getEndereco()!=null) {
            contato = builder.comNome(pessoa.getNome())
                    .comEndereco(pessoa.getEndereco())
                    .comTelefone(pessoa.getTelefone())
                    .comEmail(pessoa.getEmail())
                    .build();
            return contato;
        }

        if(pessoa.getTelefone()!=null) {
            contato = builder.comNome(pessoa.getNome())
                    .comTelefone(pessoa.getTelefone())
                    .build();
            return contato;
        }

        if(pessoa.getEmail()!=null) {
            contato = builder.comNome(pessoa.getNome())
                    .comEmail(pessoa.getEmail())
                    .build();
            return contato;
        }
        return null;
    }


}
