package VezbanjeOOPApstractClassesKartica;

public abstract class PlatnaKartica {
    /*Napraviti apstraknu klasu PlatnaKartica koja ima
    -atribut suma
    -atribut broj kartice: primer 4012-15
    -atribut godina: godina do kad je vazeca kartica
    -atribut mesec do kad vazi kartica
    -konstruktor sa parametrima
    -getter za sve atribute bez settera
    -metodu dodajSrestva koja povecava sumu za unetu vrednost
    -apstraknu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa kartice
    -apstraknu metodu koja stampa podatke o kartici
     */
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }
    public void dodajSrestva(double iznos){
        this.suma+=iznos;
    }
    public abstract void izvrsiTransakciju(double iznos);
    public abstract void stampaj();
    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }
}
