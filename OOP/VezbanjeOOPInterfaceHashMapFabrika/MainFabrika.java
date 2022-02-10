package VezbanjeOOPInterfaceHashMapFabrika;

public class MainFabrika {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("0101991804236", "Marko", "Markovic");
        Osoba o2 = new Osoba();
        Osoba o3 = new Osoba(o2);

        o3.getJmbg();
        System.out.println(o3);

        Zaposleni z1 = new Zaposleni("0606986334455", "Petar", "Petrovic", 55000.83, false);
        Zaposleni z2 = new Zaposleni("0707997771122", "Nikola", "Nikolic", 67200.32, false);
        Zaposleni z3 = new Zaposleni("0808988457823", "Jovan", "Jovanovic", 34500.19, true);
        Zaposleni z4 = new Zaposleni("0909999335588", "Vuk", "Vukovic", 100500.56, false);
        Zaposleni z5 = new Zaposleni("1010000349071", "Masa", "Masic", 61250.82, true);

        Fabrika f = new Fabrika("Stark");
        System.out.println(f);
        f.zaposli(z1);
        f.zaposli(z2);
        f.zaposli(z3);
        f.zaposli(z4);
        f.zaposli(z5);
        f.zaposli(z5);
        System.out.println(f);

        System.out.println(f.ispisiJmbgZaposlenih());
        System.out.println("\nProsecna zarada svih zaposlenih u fabrici iznosi: " + f.prosek() + " dinara.");

        Zaposleni otpusten = f.otpusti("1010000349071", 400.00);

    }
}
