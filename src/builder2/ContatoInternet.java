package builder2;

public class ContatoInternet implements Contato {
    private String nome;
    private String email;

    public ContatoInternet(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getEndereco() {
        return null;
    }

    @Override
    public String getTelefone() {
        return null;
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
        return "Contato Internet \n{" +
                "nome='" + nome + "\n" +
                "email='" + email + '\'' +
                '}';
    }
}
