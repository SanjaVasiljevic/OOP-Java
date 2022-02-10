package VezbanjeOOPAlpinista;

public abstract class Planinar {
 /*   (20 poena) Kreirati apstraktnu klasu Planinar koja od zaštićenih
    atributa ima:
    ● jedinstveni celobrojni identifikacioni broj
     ● ime i prezime
    Dok od javnih metoda
    ● konstruktor koji postavlja sve atribute klase
    ● gettere
    ● apstraktnu metodu štampaj
    ● apstraktnu metodu koja vraca clanarinu planinara
    ● apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno
    popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.*/

    protected int id;
    protected String ImeIPrezime;

    public Planinar(int id, String imeIPrezime) {
        this.id = id;
        ImeIPrezime = imeIPrezime;
    }

    public Planinar() {
    }
    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina planina);


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImeIPrezime() {
        return ImeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        ImeIPrezime = imeIPrezime;
    }
}
