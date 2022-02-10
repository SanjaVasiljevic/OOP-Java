package VezbanjeOOPSkolskiPrimerInterFace;

import java.util.HashMap;

public class Pernica {
   /* Napisati klasu Pernica koja ima polja bojice (tipa HashMap, ključ je serijski broj bojice) i
    raspolozivoMesta (tipa int, vrednost je 5). U klasi implementirati:
     • konstruktor bez parametara – inicijalizuje mapu na praznu
     • metodu boolean dodaj(Bojica) – ukoliko u mapi već postoji bojica sa serijskim brojem
    čija je vrednost jednaka vrednosti serijskog broja bojice koja se pokušava dodati,
    dodavnje nije moguće i metoda vraća false. Ako broj raspoloživih mesta nije premašen,
    vrši se dodavanje prosleđene bojice u mapu i metoda vraća true, dok u svim ostalim
    slučajevima metoda vraća false.
     • metodu int prebroj(double) – metoda vrši prebrojavanje bojica iz mape čija je cena
    veća od prosleđene. Povratna vrednost metode odgovara broju bojica koje zadovoljavaju
    traženi kriterijum.
     • redefinisati metodu toString() – ako je mapa prazna, ispisati odgovarajuću poruku
• statičku metodu main unutar koje će biti izvršeno testiranje*/

    HashMap<String, Bojica> bojice;
    private int raspolozivoMesta = 5;

    public Pernica() {
        super();
        bojice = new HashMap<String, Bojica>();
    }
    public boolean dodaj(Bojica b) {
        if(bojice.containsKey(b.getSerijskiBroj()))
            return false;

        if(bojice.size() < raspolozivoMesta) {
            bojice.put(b.getSerijskiBroj(), b);
            return true;
        }

        return false;
    }

}
