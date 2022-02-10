package VezbanjeOOPInterfaceHashMapFabrika;

public class Osoba {
/* Napisati klasu Osoba koja sadrži polja jmbg (String), ime (String) i prezime(String). U klasi
implementirati:
• konstruktor bez parametara
• konstruktor sa parametrima
• konstruktor kopije
• get metodu za polje jmbg
• redefinisati metodu String toString()
*/
    private String jmbg;
    private String ime;
    private String prezime;

    public Osoba() {
    }

    public Osoba(String jmbg, String ime, String prezime) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
    }
    public Osoba(Osoba osoba) {
        this.jmbg = osoba.jmbg;
        this.ime = osoba.ime;
        this.prezime = osoba.prezime;
    }

    public String getJmbg() {
        return jmbg;
    }
    @Override
    public String toString() {

        return   ime+" " + prezime+" jmbg=" + jmbg;
    }
}
