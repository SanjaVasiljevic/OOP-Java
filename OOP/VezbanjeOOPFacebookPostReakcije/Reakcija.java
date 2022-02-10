package VezbanjeOOPFacebookPostReakcije;

public class Reakcija {
  /* Kreirati klasu Reakcije koja ima
  -tip rekacije ( smile, like, hart)
  -ime i prezime korisnika koji je reagovao
  -gettere, setter i konstrukore

   */
    private String tip;
    private String korisnik;

    public Reakcija(String korisnik, String tip) {
        this.tip = tip;
        this.korisnik = korisnik;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }
}
