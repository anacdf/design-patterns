package builder2;

public class ContatoInternetBuilder implements ContatoBuilder {

    private String nome;
    private String email;
    private Contato contatoInternet;

    @Override
    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public ContatoBuilder comEmail(String email) {
        this.email = email;
        return this;
    }

    public Contato build() {
        contatoInternet = (Contato) new ContatoInternet(nome, email);
        return contatoInternet;
    }


    //????????????????????????????
    @Override
    public ContatoBuilder comEndereco(String endereco) {
        return null;
    }

    @Override
    public ContatoBuilder comTelefone(String telefone) {
        return null;
    }


}
