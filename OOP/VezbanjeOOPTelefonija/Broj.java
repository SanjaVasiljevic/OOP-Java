package VezbanjeOOPTelefonija;

import java.util.Objects;

public class Broj {
    /*Napisati klasu Broj koja ima sledece atribute:
            - tekstualni kod drzave (npr 381 je za srbiju) (String)
            - pozivni broj (npr 63) (String)
            - broj (npr 1234567) (String)
            - fiksniBroj (boolean) - ima vrednost true ako je broj fiksni, a false ako je broj mobilni
    Napisati:
            - konstruktor (sva polja su obavezna)
	- getter i setter metode
	- napisati toString metodu, format je:
            +kodDrzave pozivniBroj broj
    na primer
		+381 63 1234567
                //Preskociti, pa se vratiti na kraju!
                - napisati privatnu staticku metodu proveriDaLiStringSadrziSamoNumerike, koja prima string, a vraca boolean, i koja proverava da li prosledjeni string sadrzi samo numerike (brojeve).
    Pomoc:
    Dakle ja prvo treba da uvedem neku pretpostavku, npr da string zaista sadrzi samo numerike
    Onda treba da vidim kolika je duzina stringa.
    Onda trebam da u petlji idem i dohvatam jedan po jedan karatker iz stringa sve dok ne dodjem do kraja
            (Klasa String ima metodu charAt koja vraca karatker na prosledjenoj poziciji, npr str.charAt(2) ce dohvatit karakter na 3 poziciji,
    zasto 3.? zar nije 2.?, ne nije, brojanje krece od 0) i proveravam da li je numerik (klasa Character ima staticku metodu isDigit,
                                                                                         koja proverava da li je prosledjeni karakter numerik, dakle vraca true ako jeste, false ako nije)
    ako naidjem na neki koji nije numerik onda kazem da je moja pocetna pretpostavka losa i brejkam iz petlje
    Primer:
    String str = "Zoran2";
    char promenljivaA = str.charAt(2); // promenljivaA ce postati 'r'
    boolean jesteNumerik =  Character.isDigit(promenljivaA); // jesteNumerik ce postati false zato sto 'r' nije numerik
    char promenljivaB = str.charAt(5); // promenljivaA ce postati '2'
    jesteNumerik =  Character.isDigit(promenljivaB); // jesteNumerik ce postati true zato sto '2' jeste numerik

    Ako ne znate kako da napisete metodu, napisite samo zaglavlje metode(prvi red: ime, argumenti, povratna vrednost ...) i stavite da vraca true(return true;)

            - napisati privatnu staticku metodu proveriBroj koja prima kod drzave, pozivni broj i broj i proverava da li su validni.
            - Kod drzave ne sme biti null i
		- mora sadrzati tacno 3 karaktera (odnosno biti duzine 3),
		- svi karakteri u kodu drzave moraju biti numerici (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
		- Pozivni broj ne sme biti null i
		- mora sadrzati tacno 2 karaktera (odnosno biti duzine 2), i
	 	- svi karakteri u pozivnom broju moraju biti numerici. (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
            - Broj ne sme biti null i
		- mora sadrzati 7 ili 8 karaktera, i
		- svi karakteri u broju moraju biti numerici.  (za ovu proveru pozvati prethodno napisanu staticku metodu
    proveriDaLiStringSadrziSamoNumerike)

    Metoda vraca vrednost tipa boolean (true ako su SVI gore navedeni uslovi zadovoljeni, false ako BAREM JEDAN nije)
	- u konstruktoru i setter metodama u slucaju da je neka vrednost nevalidna:
            - ispisati poruku o gresci ili
		- baciti ArithmeticException izuzetak (+5 poena)*/

    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj,boolean fiksniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj= fiksniBroj;
    }

    @Override
    public String toString() {
        return
                 kodDrzave + " " + pozivniBroj +" " +  broj;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Broj)) return false;
        Broj broj1 = (Broj) o;
        return fiksniBroj == broj1.fiksniBroj && kodDrzave.equals(broj1.kodDrzave) && pozivniBroj.equals(broj1.pozivniBroj) && broj.equals(broj1.broj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(kodDrzave, pozivniBroj, broj, fiksniBroj);
    }

    public static  boolean proveriDaLiStringSadrziSamoNumerike(String s){
        boolean jesteBroj=true;
        for(int i=0; i<s.length(); i++){
            if (!Character.isDigit(s.charAt(i))) jesteBroj=false;
        }
        return jesteBroj;
    }
    public static boolean proveriBroj (String kodDrzave,String pozivniBroj,String broj) {
            if (!kodDrzave.equals(null) && kodDrzave.length() == 3 && proveriDaLiStringSadrziSamoNumerike(kodDrzave)
                    && !pozivniBroj.equals(null) && pozivniBroj.length() == 2 && proveriDaLiStringSadrziSamoNumerike(pozivniBroj)
                    && !broj.equals(null) && (broj.length() == 7 || broj.length() == 8) && proveriDaLiStringSadrziSamoNumerike(broj))
                return true;
            else return false;
        }



    public boolean isFiksniBroj(){
        return true;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
