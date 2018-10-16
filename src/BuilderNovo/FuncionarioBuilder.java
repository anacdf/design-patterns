package BuilderNovo;

abstract class FuncionarioBuilder {

    protected Sanduiche sanduiche;
    protected Batata batata;
    protected Brinquedo brinquedo;
    protected Refri refri;
    protected String tipo;
    protected String tamanho;

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

    public void createNewSanduiche(){
        sanduiche = new Sanduiche(tipo);
    }

    public void createNewBatata(){
        batata = new Batata(tamanho);
    }

    public void createNewRefri(){
        refri = new Refri(tipo);
    }

    public void createNewBrinquedo(){
        brinquedo = new Brinquedo(tipo);
    }

    public abstract void buildSanduiche();
    public abstract void buildBatata();
    public abstract void buildRefri();
    public abstract void buildBrinquedo();

}
