package VezbanjeOOPFlase;

public abstract class Flasa {
    protected Nalepnica nalepnica;
    protected double cenaBezKaucije;
    protected double zapremina = 0.33;
    protected VrstePica vrstePica;

    public Flasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstePica) {
        this.nalepnica = nalepnica;
        this.zapremina = zapremina;
        this.vrstePica = vrstePica;
    }
    public abstract double cenaSaKaucijom();

    public Nalepnica getNalepnica() {
        return nalepnica;
    }


    public double getCenaBezKaucije() {
        return cenaBezKaucije;
    }

    public void setCenaBezKaucije(double cenaBezKaucije) {
        this.cenaBezKaucije = cenaBezKaucije;
    }

    public double getZapremina() {
        return zapremina;
    }


    public VrstePica getVrstePica() {
        return vrstePica;
    }


    public void stampaj() {
        System.out.println(this.nalepnica);
        System.out.println("Zapremina: " + this.zapremina + " ");
        System.out.println("Vrsta pica: " + vrstePica + " ");
    }
}
