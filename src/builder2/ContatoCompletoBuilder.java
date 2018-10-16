package builder2;

public class ContatoCompletoBuilder implements ContatoBuilder {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Contato contatoCompleto;

    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ContatoBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public ContatoBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ContatoBuilder comEmail(String email) {
        this.email = email;
        return this;
    }

    public Contato build() {
        contatoCompleto = new ContatoCompleto(nome, endereco, telefone, email);
        return contatoCompleto;
    }
}
