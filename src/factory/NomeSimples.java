package factory;

/*
Concrete Products are the different implementations of the Product interface.
Concrete Creators will create and return instances of these classes.
 */
public class NomeSimples implements Nome {
    String nome;
    String sobrenome;

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
