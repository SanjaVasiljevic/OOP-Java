package VezbanjeOOPClanskeKarte;

public class Main {
    public static void main(String[] args) {
        Kartica kartica= new Kartica(10,"12902190");
        Kupac kupac= new Kupac(kartica);
        kupac.setImeIPrezime("Milan Jovanovic");
        Proizvod starke= new Proizvod();
        starke.setNazivProizvoda("Starke");
        starke.setCenaIzrade(1000.00);
        starke.setKupac(kupac);
        starke.stampaj();

    }



}
