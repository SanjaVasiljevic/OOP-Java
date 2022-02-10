package VezbanjeOOPAlpinista;

public class RekreativniPlaninar extends Planinar {
    /*(20 poena) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. Klasa dodatno
    pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci,
                                                                                         nemaju setere):
     ● težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
     ● naziv okruga odakle je rekreativni planinar.
     ● maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
     ● napraviti konstruktor
     ● da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći
       uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki
       kilogram opreme koji nosi može da pređe 50 metara manje.
     ● rekeativci placaju clanarinu u iznosu od 1000 rsd
     ● metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
       Rekreativac, id: id
       ime: ime prezime
       Okrug: okrug*/

    protected int tezinaOpreme;
    protected String nazivOkruga;
    protected double maxUspon;

    public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }



    @Override
    public void stampaj() {
        System.out.println("Rekreativac: ");
        System.out.println("Id:"+ this.getId());
        System.out.println("Ime i prezime:"+this.getImeIPrezime());
        System.out.println("Okrug:"+this.nazivOkruga);

    }
    @Override
    public double clanarina() {
        return 1000.00;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(this.maxUspon-50*this.tezinaOpreme > planina.getVisinaPlanine()) {
            System.out.println("Uspesan uspon");
            return true;
        }else {
            System.out.println("Probajte sledeci put");
            return false;
        }
    }
    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaxUspon() {
        return maxUspon;
    }
}
