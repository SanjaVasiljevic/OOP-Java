package VezbanjeOOPAlpinista;

public class Planina {
     /* (20 poena) Kreirati klasu Planina koja od privatnih
    atributa ima:
     ● ime planine
     ● naziv države u kojoj se nalazi
     ● visinu planine.
       a od javnih metoda:
     ● default-ni konstruktor (konstruktor bez argumenata) i konstuktor
       koji postavlja sve parametre
     ● gettere i settere za sve atribute*/

    protected String imePlanine;
    protected String imeDrzave;
    protected double visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String imeDrzave, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.imeDrzave = imeDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImeDrzave() {
        return imeDrzave;
    }

    public void setImeDrzave(String imeDrzave) {
        this.imeDrzave = imeDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
