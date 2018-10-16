package builder;

public interface LancheBuilderInterface {

    public LancheBuilder buildSanduiche(String sanduiche);

    public LancheBuilder buildBatata(String batata);

    public LancheBuilder buildBrinquedo(String brinquedo);

    public LancheBuilder buildRefri(String refri);

    public Lanche getLanche();
}
