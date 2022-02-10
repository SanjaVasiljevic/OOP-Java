package VezbanjeOOPInterfaceHashMapFabrika;

public interface RadSaMapom {
    /*Napisati interfejs RadSaMapom koji ima sledeće metode:
 • boolean zaposli(Zaposleni)
• Zaposleni otpusti(String, double)
• String ispisiJmbgZaposlenih()*/

    public boolean zaposli(Zaposleni noviZaposleni);
    public Zaposleni otpusti(String jmbg, double mesecnaZarada);
    public String ispisiJmbgZaposlenih();

}

