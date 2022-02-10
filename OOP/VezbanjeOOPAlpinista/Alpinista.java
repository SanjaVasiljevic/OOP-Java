package VezbanjeOOPAlpinista;

public class Alpinista extends Planinar{
    /*(20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar. Klasa sadrži atribut koji
    pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati (znaci,
    postojace seter). Napraviti konstruktor. Alpinista može da savlada sve uspone do 4000 metara,
    placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o
    alpinisti se ispisuju u formatu:
    Alpinista, id: id
    ime: ime i prezime
    Broj poena: poeni
           */

    protected int brojPoena;
    protected double maxUspon;

    public Alpinista(int id, String imeIPrezime, int brojPoena, double maxUspon) {
        super(id, imeIPrezime);
        this.brojPoena = brojPoena;
        this.maxUspon = maxUspon;
    }

    public Alpinista() {
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista: ");
        System.out.println("Id:"+this.id);
        System.out.println("Ime i prezime:"+this.ImeIPrezime);
        System.out.println("Broj poena:"+this.brojPoena);

    }

    @Override
    public double clanarina() {
        return 1500-this.brojPoena*50;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisinaPlanine()<4000){
            System.out.println("Uspersan uspon");
            return true;
        }else {
            return false;
        }
    }
}
