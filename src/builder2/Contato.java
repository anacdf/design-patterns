package builder2;

public interface Contato {

    String getNome();
    String getEndereco();
    String getTelefone();
    String getEmail();
    void setNome(String nome);
    void setEndereco(String endereco);
    void setTelefone(String telefone);
    void setEmail (String email);
    String toString();

}
