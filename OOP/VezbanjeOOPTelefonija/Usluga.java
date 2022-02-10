package VezbanjeOOPTelefonija;

public abstract class Usluga {
/*    Napisati apstraktnu klasu Usluga koje ima sledece atribute
	- brojOd (Broj)
	- brojKa (Broj)
    Napisati:
            - konstrutor (oba polja su obavezna)
	- polja mogu samo da se dohvate, NE mogu da se postave
	- toString metodu, format je
    - brojOd -> brojKa
            npr
		+381 63 1234567 -> +381 62 234123
     - apstraktnu metodu cenaUsluge koja vraca vrednost tipa double*/
    private Broj brojOd;
    private Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    @Override
    public String toString() {
        return  brojOd + " --> " + brojKa;
    }

    public abstract double cenaUsluge();

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

}
