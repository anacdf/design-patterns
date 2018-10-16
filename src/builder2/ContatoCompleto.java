package builder2;

public class ContatoCompleto implements Contato{

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public ContatoCompleto(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void setNome(String nome) {

    }

    @Override
    public void setEndereco(String endereco) {

    }

    @Override
    public void setTelefone(String telefone) {

    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String toString() {
        return "Contato Completo\n{" +
                "nome='" + nome + "\n" +
                "endereco='" + endereco + "\n" +
                "telefone='" + telefone + "\n" +
                "email='" + email + '\'' +
                '}';
    }
}
