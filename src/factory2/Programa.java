package factory2;

public class Programa {
    public static void main(String[] args) {

        ProvedorFactory provedorFactory = new ProvedorFactory();
        Provedor provedor = provedorFactory.escreverInformacao("designpatterns");

        provedor.lerArquivo();
    }
}
