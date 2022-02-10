package VezbanjeOOPAbstractObjekat;

public abstract class Objekat {
    /* Kreirati abstraknu klasu Objekat koja ima:
    -adresa(ulica i broj)
    -povrsina objekta
    -zona(1,2 i 3)
    -konstruktore, getter u setter
    -Metodu koja vraca koeficijent koji se koristi za  racunanje poreza u zavisnosti u kojoj se zoni nalazi:
    -zona1, koeficijent je 1.4
    -zona 2, koeficijent je 1.1
    -zona 3, koeficijent je 1.05
    -abstraknu metodu koja racuna i vraca porez objekta
    -abstraknu metodu stampaj
     */
    protected String adresa;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsinaObjekta, int zone) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }
    public abstract double racunajPorez();
    public abstract void stampaj();
    public double koeficijent(){
        if(zona==1){
            return 1.4;
        }else if(zona==2){
            return 1.1;
        }else {
            return 1.05;
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZone() {
        return zona;
    }

    public void setZone(int zona) {
        this.zona = zona;
    }
}
