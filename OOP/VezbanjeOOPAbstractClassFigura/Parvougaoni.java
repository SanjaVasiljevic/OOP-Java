package VezbanjeOOPAbstractClassFigura;

public class Parvougaoni extends Figura {
    private double a;
    private double b;

    public Parvougaoni(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double ppovrsina() {
        return a*b;
    }

    @Override
    public double obim() {
        return (a+b)*2;
    }
}
