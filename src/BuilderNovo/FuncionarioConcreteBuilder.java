package BuilderNovo;

public class FuncionarioConcreteBuilder extends FuncionarioBuilder {
    protected Sanduiche sanduiche;
    protected Batata batata;
    protected Brinquedo brinquedo;
    protected Refri refri;

    public FuncionarioConcreteBuilder(Sanduiche sanduiche, Batata batata, Brinquedo brinquedo, Refri refri) {
        this.sanduiche = sanduiche;
        this.batata = batata;
        this.brinquedo = brinquedo;
        this.refri = refri;
    }

    @Override
    public void buildSanduiche() {
        System.out.println("Sanduiche pronto");
    }

    @Override
    public void buildBatata() {
        System.out.println("Batata pronta");
    }

    @Override
    public void buildRefri() {
        System.out.println("Refri servido");
    }

    @Override
    public void buildBrinquedo() {
        System.out.println("Brinquedo embalado");
    }
}
