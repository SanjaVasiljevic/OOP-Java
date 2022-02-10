package VezbanjeOOPFacebook;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public void stampaj(){
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}
