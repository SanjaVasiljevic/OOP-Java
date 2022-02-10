package VezbanjeOOPAbstractObjekat;

public class Kuca extends Objekat {
    /* kreirati klasu Kuca koja nasledjuje klasu Objekat
    koja ima broja clanova koji zive u tome objektu
    -konstruktore, getter i setter
    -porez se racuna po formi koeficijent*povrsina
    -prepisati metod stampaj tako da stampa sve podatke vezane za kucu

     */
    private int brojClanova;

    public Kuca() {
        super();
    }

    public Kuca(String adresa, double povrsinaObjekta, int zone, int brojClanova) {
        super(adresa, povrsinaObjekta, zone);
        this.brojClanova = brojClanova;
    }
    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
    @Override
    public double racunajPorez() {

        return this.povrsinaObjekta*koeficijent();
    }

    @Override
    public void stampaj() {
        System.out.print("Objekat je na adresi, "+this.adresa+" ");
        System.out.print("povrsine: "+ this.povrsinaObjekta+" ");
        System.out.print("u zoni "+this.zona+" ");
        System.out.println("Broja članova u domaćinstvu je: "+this.brojClanova);

    }
}
