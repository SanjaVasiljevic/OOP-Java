package VezbanjeOOPAbstractClassFigura;

import java.util.ArrayList;
public class FiguraMain {
    public static void main(String[] args) {
        ArrayList<Figura> figure= new ArrayList<Figura>();

        figure.add(new Trougao(5));
        figure.add(new Parvougaoni(5,2));
        figure.add(new Trougao(4));
        figure.add(new Parvougaoni(2,4));
        figure.add(new Parvougaoni(5,6));

        double ukupnaPovrsina= 0;
        double ukupanObim=0;
        int i = 0;
        for ( i =0; i< figure.size();i++ ){
           ukupnaPovrsina+=figure.get(i).ppovrsina();
           ukupanObim+=figure.get(i).ppovrsina();
           figure.get(i).stampaj();
        }
        System.out.println("Ukupna povrsina je: "+ukupnaPovrsina);
        System.out.println("Ukupan obim je: "+ ukupanObim);
    }
}
