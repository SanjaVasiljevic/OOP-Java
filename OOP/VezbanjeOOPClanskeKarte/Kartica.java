package VezbanjeOOPClanskeKarte;

public class Kartica {
    /*kreirati klasu ClanskeKarte koja ima
    -popust(u rasponu od 5 do 10%
    _broj kartice (npr 93290239)
    -getter i setter
    -konstruktore
    proizvod(naziv, cena izrade kupac)
    kupac(ime i prezime, kartica)
    kartica(popust, broj kartice)
     */
    private double popust;
    private String brojKartice;

    public Kartica() {
    }

    public Kartica(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }



    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
}
