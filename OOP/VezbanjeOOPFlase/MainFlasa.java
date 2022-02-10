package VezbanjeOOPFlase;

import java.util.ArrayList;
import java.util.List;

public class MainFlasa {
    public static void main(String[] args) {

        List<Flasa> listaFlasa = new ArrayList<>();

        Nalepnica n=new Nalepnica("Vino");
        Nalepnica n1=new Nalepnica("Voda");

        PlasticnaFlsa vino= new PlasticnaFlsa(n, 100, 0.5, VrstePica.ALKOHOLNO);
        StklenaFlsa voda=new StklenaFlsa(n1,70,0.3,VrstePica.BEZALKOHOLNO);

        vino.stampaj();
        voda.stampajStaklenuFlasu();
        voda.cenaSaKaucijom();


       double sumaFlasa=0;
        for (Flasa f: listaFlasa) {
            f.cenaSaKaucijom();
            sumaFlasa+=f.cenaSaKaucijom();
        }
        System.out.println("Suma flase:"+sumaFlasa);
    }

}
