package BuilderNovo;

import java.util.Set;

abstract class FuncionarioBuilder {

    protected Sanduiche sanduiche;
    protected Batata batata;
    protected Brinquedo brinquedo;
    protected Refri refri;
    protected String sand;
    protected String tamanho;
    protected String brinq;
    protected String sabor;
    Set dentroDaCaixa;
    Set foraDaCaixa;

    public FuncionarioBuilder(){
        sanduiche = new Sanduiche(sand);
        batata = new Batata(tamanho);
        brinquedo = new Brinquedo(brinq);
        refri = new Refri(sabor);
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }

    public Batata getBatata() {
        return batata;
    }

    public Brinquedo getBrinquedo() {
        return brinquedo;
    }

    public Refri getRefri() {
        return refri;
    }

    public void createNewSanduiche(String sand){
        sanduiche = new Sanduiche(sand);
    }

    public void createNewBatata(String tamanho){
        batata = new Batata(tamanho);
    }

    public void createNewRefri(String sabor){
        refri = new Refri(sabor);
    }

    public void createNewBrinquedo(String brinq){
        brinquedo = new Brinquedo(brinq);
    }

    public abstract void buildSanduiche();
    public abstract void buildBatata();
    public abstract void buildRefri();
    public abstract void buildBrinquedo();

    public void montarLanche(){
        buildSanduiche();
        buildBatata();
        buildBrinquedo();
        buildRefri();
}

    public Set lancheDentoDaCaixa(){
        dentroDaCaixa.add(getSanduiche());
        dentroDaCaixa.add(getBatata());
        dentroDaCaixa.add(getBrinquedo());

        return dentroDaCaixa;
    }

    public Set lancheForaDaCaixa(){
        foraDaCaixa.add(refri);
        return foraDaCaixa;
    }
}
