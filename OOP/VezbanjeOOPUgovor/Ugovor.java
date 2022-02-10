package VezbanjeOOPUgovor;

public class Ugovor {
    /* Kreirati kalsu Ugovor koja ima:
    -godinu dan mesec sklapanja ugovora
    -Osobu koja prodaje nekretninu(fizicko lice)
    -Osoba koja kupuje nekretninu (fizicko lice)
    -Cena za koju se prodaje nekretnina
    -adresa nekretnine(ulica br-grad)
    -Metodu koja vraca procenat zarade
    za osobu koja je vec kupovala nekretninu preko agencije je 0.02
    dok je za one koji nisu 0.02
    -metodu koja racuna zaradu ahencije po prodaji nekretine koja ukljucuje
    poreze, takse i uslugi agencije premoa formuli
    1000+cena za koju se prodaje*procenat zarade
    -Metoda za stampanje ugovora u formatu
    Dana( dan, mesec godina)god skpoljen je ugovor izmedju(print prodavca) i (print kupca) o kupovini nekretnine (adresa) po ceni od(cena nekretnine)
    pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

     */
    private String adresa;
    private double cena;
    private  int godina;
    private int mesec;
    private int dan;
    private FizickoLice prodavac;
    private FizickoLice kupac;

    public Ugovor(String adresa, double cena, int godina, int mesec, int dan) {
        this.adresa = adresa;
        this.cena = cena;
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
    }
    public double procenat(){
        if (this.kupac.isVecKupovao()==true){
            return 0.02;
        }else {
            return 0.03;
        }
    }
    public double zarada(){
        return 1000+this.cena*this.procenat();
    }
    public void stampaj(){
        this.prodavac.stampaj();
        this.kupac.stampaj();
        System.out.println("Zarada "+this.zarada());
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }
}
