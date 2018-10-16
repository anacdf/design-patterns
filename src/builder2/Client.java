package builder2;

public class Client {

    public static void main(String[] args) {
        //Contato Completo
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setEndereco("Rua X");
        pessoa.setTelefone("3456-7890");
        pessoa.setEmail("maria@email.com");

        ContatoBuilder builder = new ContatoCompletoBuilder();

        Contato contato = directBuild(builder, pessoa);

        System.out.println(contato.toString());

        //Contato Internet
        Pessoa pessoaInternet = new Pessoa();
        pessoaInternet.setNome("Maria");
        pessoaInternet.setEmail("maria@email.com");

        ContatoBuilder builderInternet = new ContatoInternetBuilder();

        Contato contatoInternet = directBuild(builderInternet, pessoaInternet);

        System.out.println("\n"+contatoInternet.toString());

        //Contato Telefone
        Pessoa pessoaTel = new Pessoa();
        pessoaTel.setNome("Maria");
        pessoaTel.setTelefone("3456-7890");

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
