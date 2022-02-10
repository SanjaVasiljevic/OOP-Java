package VezbanjeOOPAbstractObjekat;

public class Lokal extends Objekat{

    public Lokal() {
        super();
    }

    public Lokal(String adresa, double povrsinaObjekta, int zone) {
        super(adresa, povrsinaObjekta, zone);
    }


    @Override
    public double racunajPorez() {
        return this.povrsinaObjekta*koeficijent()*1.3;
    }

    @Override
    public void stampaj() {
        System.out.print("Lokal na adresi "+this.adresa);
        System.out.print("povrsine: "+ this.povrsinaObjekta+" ");
        System.out.print("u zoni "+this.zona+" ");
    }

}
