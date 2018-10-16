package builder;

public class Lanche implements LancheInterface {

    private String sanduiche;
    private String batata;
    private String brinquedo;
    private String refri;

     public void setSanduice(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getSanduiche() {
        return sanduiche;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getBatata() {
        return batata;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setRefri(String refri) {
        this.refri = refri;
    }

    public String getRefri() {
        return refri;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "sanduiche='" + sanduiche + '\'' +
                ", batata='" + batata + '\'' +
                ", brinquedo='" + brinquedo + '\'' +
                ", refri='" + refri + '\'' +
                '}';
    }
}
