package factory;

/*
    Concrete Creators implement or override the base factory method, by creating and returning one of the Concrete Products.
 */

public class Internacional extends Autores {
    @Override
    public Nome montarNomes() {
        return new NomeInvertido();
    }
}
