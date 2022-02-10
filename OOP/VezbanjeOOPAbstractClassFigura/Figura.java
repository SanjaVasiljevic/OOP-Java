package VezbanjeOOPAbstractClassFigura;

public abstract class Figura {
    public Figura() {
    }
    public abstract double ppovrsina();
    public abstract double obim();

    public void stampaj(){
        System.out.println("Povrsina: "+this.ppovrsina());
        System.out.println("Obim: "+this.obim());
    }
}
