package builder2;

public interface ContatoBuilder {

    ContatoBuilder comNome(String nome);
    ContatoBuilder comEndereco(String endereco);
    ContatoBuilder comTelefone(String telefone);
    ContatoBuilder comEmail(String email);

    Contato build();
}
