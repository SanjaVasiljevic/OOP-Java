package VezbanjeOOPClanskeKarte;

public class Kupac {
    /*kreirati klasu Kupac koja ima
    -ime i prezime
    -clansu kartu
    -gettere i settere,clanska carta ne moze da se menja
    -konstruktor
    -metodiu koja stampa u formatu
    ime i prezime-broj kartice */
    private String imeIPrezime;
    private Kartica kartica;

    public Kupac (Kartica k){
        this.kartica=k;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime+ "-"+this.kartica.getBrojKartice());
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }


    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public Kartica getKartica() {
        return kartica;
    }

}
