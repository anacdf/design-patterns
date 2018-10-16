package builder2;

public class ContatoTelefone implements Contato {

    private String nome;
    private String telefone;

    public ContatoTelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getEndereco() {
        return null;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return null;
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
        return "Contato Telefone \n{" +
                "nome =' " + nome + "\n" +
                "telefone =' " + telefone + '\'' +
                '}';
    }
}
