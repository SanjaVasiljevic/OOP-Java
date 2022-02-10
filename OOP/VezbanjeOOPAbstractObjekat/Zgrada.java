package VezbanjeOOPAbstractObjekat;

public class Zgrada extends Objekat{
    /* Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima;
    -broj stanova
    -konstruktor, stetter, getter
    -porez racuna po formuli koeficijent*povrsina*broja stanova
    -prepisati metodu stampaj, tako da stampa sve podatke vezane za zgradu.
     */
    private int brojStanova;

    public Zgrada() {
        super();
    }

    public Zgrada(String adresa, double povrsinaObjekta, int zone, int brojStanova) {
        super(adresa, povrsinaObjekta, zone);
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {

        return this.povrsinaObjekta*koeficijent()*this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.print("Zgrada je na adresi, "+this.adresa+" ");
        System.out.print("povrsine: "+ this.povrsinaObjekta+" ");
        System.out.print("u zoni "+this.zona+" ");
        System.out.println("Broja stanova u zgradi je: "+this.brojStanova);


    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
