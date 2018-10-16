package factory2;

public class ProvedorFactory {

    private Provedor provedor;

    public Provedor escreverInformacao(String senha){
        if(senha.equalsIgnoreCase("designpatterns")){
            provedor = new ProvedorConfidencial();
            return provedor;
        }

        if(!senha.equalsIgnoreCase("designpatterns")){
            provedor = new ProvedorPublico();
            return provedor;
        } return null;
    }

}
