package VezbanjeOOPInterfaceHashMapFabrika;

public class Zaposleni extends Osoba {
    /*Iz klase Osoba izvesti klasu Zaposleni opisanu dodatnim poljima mesecnaZarada (double) i
odobrenGodisnji (boolean). U klasi implementirati:
• konstruktor sa parametrima za sva polja, uključujući i nasleđena
• get metodu za polje mesecnaZarada
• redefinisati metodu String toString()
*/
    private double mesecnaZarada;
    private boolean odobrenGodisnji;

    public Zaposleni(String jmbg, String ime, String prezime, double mesecnaZarada, boolean odobrenGodisnji) {
        super(jmbg, ime, prezime);
        this.mesecnaZarada = mesecnaZarada;
        this.odobrenGodisnji = odobrenGodisnji;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMesecna Zarada " + mesecnaZarada + "\nOdobren godisnji " + odobrenGodisnji;
    }

    public double getMesecnaZarada() {
        return mesecnaZarada;
    }
}
