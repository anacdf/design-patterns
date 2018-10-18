package factory;

public class NomeSimples implements Nome {
    String nome;
    String sobrenome;

    public NomeSimples() {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
