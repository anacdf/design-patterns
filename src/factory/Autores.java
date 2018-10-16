package factory;

/*
    Creators declares a factory method that returns the Product type.
    This method can either be abstract or have some default implementation.
    In the first case, all Concrete Creators must implement their factory methods.
 */
public abstract class Autores {

    public void nacionalidade(){

    }

    public abstract Nome montarNomes();
}
