package VezbanjeOOPTelefonija;

public class Poziv extends Usluga {
/*    Napisati klasu Poziv. Poziv je Usluga koja ima sledece dodatne atribute:
     - trajanje u sekndama (int)
    Napisati:
    - konstruktor
	- gettere i settere
	- toString metodu, format je
    brojOd -> brojKa <trajanje u formatu minuti:sekunde>
    npr+381 63 1234567 -> +381 62 234123 2:31
    - nadjacati metodu cena usluge. Metoda vraca kolika je cena razgovora koji je inicirao brojOd ka brojKa.
    Cena razgovora ukoliko ga je moguce obaviti je 10 dinara za svaki zapoceti minut
    (npr ako je trajanje u sekundama 122, to je 2 minuta i 2 sekunde, odnosno 2 cela minuta i zapocet treci, cena je 3*10=30 dinara).
    Ukoliko nije moguce obaviti poziv cena je 0 dinara.
    Poziv je moguce obaviti ako
	- brojOd nije jednak null
    - brojKa nije jednak null i
	- brojOd i brojKa nisu jednaki medjusobno*/
    private int trajanjeUsekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUsekundama) {
        super(brojOd, brojKa);
        this.trajanjeUsekundama = trajanjeUsekundama;
    }

    @Override
    public double cenaUsluge() {

        if (!getBrojOd().equals(null) && !getBrojKa().equals(null) && !getBrojOd().equals(getBrojKa())
                && (!getBrojOd().isFiksniBroj() && !getBrojKa().isFiksniBroj())) {
            if (trajanjeUsekundama % 60 == 0) {
                return trajanjeUsekundama/60 *10;
            } else {
                return (trajanjeUsekundama/60 + 1) * 10;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        //brojOd -> brojKa <trajanje u formatu minuti:sekunde>
        return super.toString()+ "<"+ trajanjeUsekundama/60+":"+trajanjeUsekundama%60 ;
    }

    public int getTrajanjeUsekundama() {
        return trajanjeUsekundama;
    }

    public void setTrajanjeUsekundama(int trajanjeUsekundama) {
        this.trajanjeUsekundama = trajanjeUsekundama;
    }
}
