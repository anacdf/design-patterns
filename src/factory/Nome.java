package factory;

/*
  Product declares the single interface for all objects that can be produced by the creator and its subclasses.
 */
public interface Nome {

    void setNome(String nome);
    void setSobrenome(String sobrenome);
    String getNome();
    String getSobrenome();
    String getNomeCompleto();



}
