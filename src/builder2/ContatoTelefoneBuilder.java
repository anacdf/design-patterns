package builder2;

public class ContatoTelefoneBuilder implements ContatoBuilder {

    private String nome;
    private String telefone;
    private Contato contatoTelefone;

    @Override
    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public ContatoBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public Contato build(){
        contatoTelefone = (Contato) new ContatoTelefone(nome, telefone);
        return contatoTelefone;
    }

    @Override
    public ContatoBuilder comEmail(String email) {
        return null;
    }

    @Override
    public ContatoBuilder comEndereco(String endereco) {
        return null;
    }

}
