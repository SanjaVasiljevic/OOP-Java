package VezbanjeOOPApstractClassesKartica;

public class MasterCart extends PlatnaKartica {

    /* Napraviti  klasu MasterCart koja nasledjuje klasu PlatnaKartica
    -konstruktor sa parametrima
    -implemetirati metodu koja vrsi transakciju tako da na postojecu sumu
    dodaje proviziju od 1.5% na sumu
    -metodu naplati odzavanje koja sa racuna skida $2
    -implemetira metodu koja stampa podatke o kartici u formatu
    Master Cart 12:2019, 4012-1239-1221-3381 $232

     */
    public MasterCart(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija=1.5/100*iznos;
        this.suma=this.suma-iznos-provizija;

    }

    @Override
    public void stampaj() {
        System.out.print("Master Cart: ");
        System.out.print(this.mesec+"/"+this.godina+",");
        System.out.println("$"+this.suma+", "+this.brojKartice);

    }
    public void naplatiOdrzavanje(){
        this.suma-=2;
    }
}
