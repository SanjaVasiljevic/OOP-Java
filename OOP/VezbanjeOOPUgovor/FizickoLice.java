package VezbanjeOOPUgovor;

public class FizickoLice {
    private String imeIPrzime;
    private String jmbg;
    private String brLK;
    private boolean vecKupovao;

    public FizickoLice() {
    }

    public FizickoLice(String imeIPrzime, String jmbg, String brLK, boolean vecKupovao) {
        this.imeIPrzime = imeIPrzime;
        this.jmbg = jmbg;
        this.brLK = brLK;
        this.vecKupovao = vecKupovao;
    }

    public void stampaj(){
        System.out.println(this.jmbg+" "+this.imeIPrzime+ ", broj licne karte"+ this.brLK);
    }

    public String getImeIPrzime() {
        return imeIPrzime;
    }

    public void setImeIPrzime(String imeIPrzime) {
        this.imeIPrzime = imeIPrzime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getBrLK() {
        return brLK;
    }

    public void setBrLK(String brLK) {
        this.brLK = brLK;
    }

    public boolean isVecKupovao() {
        return vecKupovao;
    }

    public void setVecKupovao(boolean vecKupovao) {
        this.vecKupovao = vecKupovao;
    }
}
