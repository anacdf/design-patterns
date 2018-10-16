package builder;

public class LancheBuilder implements LancheBuilderInterface {

    private Lanche lanche;
    private String sanduiche;
    private String batata;
    private String brinquedo;
    private String refri;

    @Override
    public LancheBuilder buildSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
        return this;
    }

    @Override
    public LancheBuilder buildBatata(String batata) {
        this.batata = batata;
        return this;
    }

    @Override
    public LancheBuilder buildBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
        return this;
    }

    @Override
    public LancheBuilder buildRefri(String refri) {
        this.refri = refri;
        return this;
    }

    public Lanche getLanche() {
        lanche = new Lanche();
        lanche.setSanduice(this.sanduiche);
        lanche.setBatata(this.batata);
        lanche.setBrinquedo(this.brinquedo);
        lanche.setRefri(this.refri);
        return lanche;
    }
}
