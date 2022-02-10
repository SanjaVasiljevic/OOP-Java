package VezbanjeOOPClanskeKarte;

public class Proizvod {
    /*/*Kreirati klasu Proizvod koja ima
    -naziv proizvoda
    -kupca
    -cenu izrade proizvoda
    -gettter i setter
    -konstruktore
    Metodu za izracunavanje cene proizvoda po formuli
    cena izrade*1.9*(popust na karticu) /100
    -Metodu za stampanje poizvoda u formatu
    maziv poizvoda-cena
    ime i prezime-broj kartice*/
    private String nazivProizvoda;
    private Kupac kupac;
    private double cenaIzrade;


    public double racunajCenu(){
        return this.cenaIzrade*1.9*(100-this.kupac.getKartica().getPopust())/100;
    }
    public void stampaj(){
        System.out.println(this.nazivProizvoda+"-"+this.racunajCenu());
        this.kupac.stampaj();
    }
    public Kupac getKupac(){
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
}
