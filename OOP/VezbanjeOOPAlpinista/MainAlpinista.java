package VezbanjeOOPAlpinista;

import java.util.ArrayList;
import java.util.List;

public class MainAlpinista {
    public static void main(String[] args) {

   /*  (20 poena) Kreirati glavnu klasu I u njoj:
   • instancirati jednu planinu
   • napraviti listu koji ce sadrzati tri rekrativna planinara I tri alpiniste
   • ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti
    na instanciranu planinu
   • ispisati kolika je zbir svih clanarina planinara iz niza
   Napraviti paket testKlase I u njemu kreirati zadate klase. Nakon
    zavrsenog testa ceo paket uploudovati u svoj folder na drajvu*/


        Planina velikaPlanina = new Planina("Velika planina", "Norveska", 3650);
        Planina malaPlanina = new Planina("Mala planina", "Slovenija", 1500);

        List<Planinar> planinari = new ArrayList<>();

        planinari.add(new Alpinista(1, "Marko Markovic", 10, 00));
        planinari.add(new Alpinista(2, "Stefan Stefanovic", 7, 789));
        planinari.add(new Alpinista(3, "Snezana Stevic", 5, 700));
        planinari.add(new RekreativniPlaninar(4, "Nemanja Nemanjic", 11, "Juzno-Backui", 1700));
        planinari.add(new RekreativniPlaninar(5, "Katarina Krstic", 15, "Sremski", 1100));
        planinari.add(new RekreativniPlaninar(6, "Tomislav Tomic", 13, "Zapono-banatsko", 1300));

       /* for (int i=0; i<planinari.size(); i++){
          planinari.get(i).stampaj();
       }*/
        double suma = 0;
        for (Planinar planinar : planinari) {
            planinar.stampaj();
            System.out.println(planinar.uspesanUspon(velikaPlanina));
            System.out.println();
            suma += planinar.clanarina();
        }

        System.out.println("Ukupna clanarina je: " +suma);

    }
}
