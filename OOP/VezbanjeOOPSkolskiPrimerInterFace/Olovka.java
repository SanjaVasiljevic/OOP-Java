package VezbanjeOOPSkolskiPrimerInterFace;

public abstract class Olovka {
   /* Napisati apstraktnu klasu Olovka koja ima polje cena (tipa double). U klasi implementirati:
            • konstruktor bez parametara – polje inicijalizovati na -1
            • konstruktor sa parametrima Olovka(double)
• apstraktnu metodu bool postaviCenu()*/
    protected double cene;

    public Olovka(double cene) {
        this.cene = cene;
    }

    public Olovka() {
    }

    public abstract boolean postaviCenu();

    public double getCene() {
        return cene;
    }

    public void setCene(double cene) {
        this.cene = cene;
    }
}
