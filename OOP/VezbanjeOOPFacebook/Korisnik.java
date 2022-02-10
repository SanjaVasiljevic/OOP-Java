package VezbanjeOOPFacebook;

public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik() {

    }
    public void stampaj (){
        System.out.println(this.ime+ " "+this.prezime);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
