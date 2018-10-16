package builder;

public class App {
    public static void main(String[] args){

     Lanche lanche = new LancheBuilder()
             .buildSanduiche("hamburger")
             .buildBatata("media")
             .buildBrinquedo("carro")
             .buildRefri("coca")
             .getLanche();

     Lanche lanche2 = new LancheBuilder()
                .buildSanduiche("cheeseburguer")
                .buildRefri("guarana")
                .getLanche();

        System.out.println("Pedido 1: "+ lanche);
        System.out.println("Pedido 2: " + lanche2);

    }
}



