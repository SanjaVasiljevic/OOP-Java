package VezbanjeOOPInterfaceHashMapFabrika;

import java.util.HashMap;

public class Fabrika implements RadSaMapom, ProsecnaZarada {
    /*Napisati klasu Fabrika koja implementira interfejse RadSaMapom i ProsecnaZarada i
sadrži polje naziv (String) i mapu zaposleni čiji je ključ jmbg zaposlenog
(HashMap<String, Zaposleni>). U klasi implementirati:
• konstruktor sa parametrom Fabrika(String) – postavlja vrednost polja naziv
na prosleđenu
• redefinisati metodu boolean zaposli(Zaposleni) – ako u mapi već postoji
zaposleni sa istim jmbg-om, ispisuje se poruka “Neuspesno zaposljavanje!” i
metoda vraća false. Ako u mapi ne postoji zaposleni sa istim jmbg-om, metoda
ispisuje poruku “Uspesno zaposljavanje!”, dodaje zaposlenog u mapu i vraća true.
• redefinisati metodu Zaposleni otpusti(String, double) - ako u mapi postoji
zaposleni sa prosleđenom vrednošću jmbg-a i ako je njegova mesečna zarada veća
od prosleđene vrednosti, vrši se njegovo brisanje i metoda vraća izbrisanog
zaposlenog. U svim ostalim slučajevima povratna vrednost metode je null.
• redefinisati metodu String ispisiJmbgZaposlenih() – metoda ispisuje
vrednosti jmbg-a svakog zaposlenog u fabrici
• redefinisati metodu double prosek() – metoda računa vrednost prosečne
mesečne zarade svih zaposlenih u fabrici, što vraća kao povratnu vrednost. U
slučaju da je mapa prazna, metoda vraća 0.
• redefinisati metodu String toString()
     */
    private String naziv;
    private HashMap<String, Zaposleni> zaposleni = new HashMap<String, Zaposleni>();

    public Fabrika(String naziv) {
        super();
        this.naziv = naziv;
    }

    @Override
    public boolean zaposli(Zaposleni z) {
        if(zaposleni.containsKey(z.getJmbg())) {
            System.out.println("Neuspesno zaposljavanje!");
            return false;
        }

        System.out.println("Uspesno zaposljavanje!");
        zaposleni.put(z.getJmbg(), z);
        return true;
    }

    @Override
    public Zaposleni otpusti(String jmbg, double mesecnaZarada) {
        for(Zaposleni z : zaposleni.values())
            if(z.getJmbg().equals(jmbg) && z.getMesecnaZarada() > mesecnaZarada)
                return zaposleni.remove(jmbg);

        return null;
    }

    @Override
    public String ispisiJmbgZaposlenih() {
        String jmbgZaposlenih = "Trenutno su zaposlene osobe sa sledecim vrednostima jmbg-a:\n";

        for(String jmbg : zaposleni.keySet())
            jmbgZaposlenih += jmbg + ",\n";

        return jmbgZaposlenih;
    }
    /*public String ispisiJMBGZaposlenih() {
        String jmbgZaposlenih = "Zaposleni sa JMBG-om: \n";
        for (String jmbg : radnici.keySet()){
            jmbgZaposlenih += jmbg + ", \n";
        }
        return jmbgZaposlenih;
    }*/

    @Override
    public double prosek() {
        double prosek = 0;

        if(zaposleni.isEmpty())
            return prosek;

        for(Zaposleni z : zaposleni.values())
            prosek += z.getMesecnaZarada();

        return prosek / zaposleni.size();
    }


    @Override
    public String toString() {
        String ispis = "\n**************** FABRIKA ****************\n";
        ispis += "naziv: " + naziv + "\n";

        if(zaposleni.isEmpty())
            ispis += "Trenutno niko nije zaposlen!\n";
        else {
            ispis += "\nU fabrici trenutno rade sledeci zaposleni:\n\n";
            for(Zaposleni z : zaposleni.values()) {
                ispis += z + "\n\n";
            }
        }

        ispis += "*****************************************\n";
        return ispis;
    }

}
