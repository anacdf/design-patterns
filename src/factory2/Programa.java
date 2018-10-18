package factory2;

public class Programa {
    public static void main(String[] args) {

        ProvedorFactory provedorFactory = new ProvedorFactory();
        Provedor provedor = provedorFactory.escreverInformacao("PadrãoFIFA");
        Provedor provedor2 = provedorFactory.escreverInformacao("OLA");
        provedor.lerArquivo();
        System.out.println(" ");
        provedor2.lerArquivo();
    }
}
