package VezbanjeOOPAbstractClassFigura;

public class Trougao extends Figura {

    private double a;

    public Trougao(double a) {
        super();
        this.a = a;
    }

    @Override
    public double ppovrsina() {
        return a * a * Math.sqrt(3)/4;
    }

    @Override
    public double obim() {
        return 3*a;
    }

}

