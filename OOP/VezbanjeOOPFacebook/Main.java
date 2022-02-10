package VezbanjeOOPFacebook;

public class Main {
    public static void main(String[] args) {
        Korisnik k= new Korisnik();
        k.setIme("Milan");
        k.setPrezime("Jovanovic");

        FacebookPost fb= new FacebookPost();
        fb.setOpis("Ovo je opis oglasa.");
        fb.setKorisnik(k);
        fb.stampaj();
    }
}
