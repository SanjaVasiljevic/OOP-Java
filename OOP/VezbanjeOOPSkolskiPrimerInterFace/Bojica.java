package VezbanjeOOPSkolskiPrimerInterFace;

public class Bojica implements IzracunavanjeCene {
    /*
    Napisati klasu Bojica koja implementira interfejs IzracunavanjeCene i ima polja
    serijskiBroj (tipa String), cena (tipa double), boja (tipa String) i tip (tipa String). U klasi
    implementirati:
            • konstruktor sa parametrima za sva polja
• konstruktor kopije
• get metode za polja serijskiBroj i cena
• redefinisati metodu boolean akcijskaCena(double) – ako je prosleđen parametar sa
    negativnom vrednošću ili sa vrednošću 0, ispisuje se poruka “Neuspesan pokusaj
    smanjivanja cene!” i metoda vraća false. Ukoliko se ispostavi da prosleđeni parametar
    ima pozitivnu vrednost (radi jednostavnosti pretpostaviti da njegova vrednost neće biti
    veća od 99), vrši se smanjivanje cene za navedeni procenat. Nakon realizovanog
    smanjenja ispisuje se poruka “Cena je snizena za <<vrednost procenta>>%.” i metoda
    vraća true.
            • redefinisati metodu toString()*/
    protected String serijskiBroj;
    protected double cena;
    protected String boja;
    protected String tip;

    public Bojica(String serijskiBroj, double cena, String boja, String tip) {
        super();
        this.serijskiBroj = serijskiBroj;
        this.cena = cena;
        this.boja = boja;
        this.tip = tip;
    }

    public Bojica(Bojica b) {
        serijskiBroj = b.serijskiBroj;
        cena = b.cena;
        boja = b.boja;
        tip = b.tip;
    }
    @Override
    public boolean akcijskaCena (double procenat) {
        if(procenat<=0 && procenat>100){
            System.out.println("Neuspesan pokusaj smanjivanja cene!");
            return false;
        }else {
            cena *= 1 - procenat / 100;
            System.out.println("Cena je snizena za " + procenat + "%.");
        }
          return true;
    }

    @Override
    public String toString() {
        return "Bojica " +
                "serijskiBroj='" + serijskiBroj + '\'' +
                ", cena=" + cena +
                ", boja='" + boja + '\'' +
                ", tip='" + tip + '\'';
    }

    public String getSerijskiBroj() {
        return serijskiBroj;
    }

    public void setSerijskiBroj(String serijskiBroj) {
        this.serijskiBroj = serijskiBroj;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }


}
