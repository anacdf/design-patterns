package factory2;

public class ProvedorFactory {

    private Provedor provedor;

    public Provedor escreverInformacao(String senha){
        if(senha.equalsIgnoreCase("PadraoFIFA")){
            provedor = new ProvedorConfidencial();
            return provedor;
        }

        if(!senha.equalsIgnoreCase("PadraoFIFA")){
            provedor = new ProvedorPublico();
            return provedor;
        } return null;
    }

}
