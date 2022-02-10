package VezbanjeOOPTelefonija;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Korisnik {
    /*Napisati klasu Korisnik koja ima slece atribute:
     - id (int) - jednoznacan automatski generisan celobrojan identifikator (int) (+3 poena)
     - ime (string)
	- prezime (string)
	- Broj (Broj)
	- istorijaUsluga (ArrayList<Usluga>) - niz koji sadrzi sve usluge(poruke i pozive) koje je korisnik inicirao
    Napisati
	- konstruktor(ime prezime broj polja obavezna, niz inicijalno prazan)
	- getter i setter metode (istorijaUsluga nije moguce set-ovati, samo getovati)
	- toString metodu, format je
    ime prezime broj
    Istorija usluga:
		<usluga>
		<usluga>
		....
    npr Zoran Milicevic +381 63 1234567
    Istorija usluga:
            +381 63 1234567 -> +381 63 4567123 Cao Strahinja!
            +381 63 1234567 -> +381 63 4567123 2:34
    - napisati metodu posaljiPoruku, koja prima broj na koji treba posalti poruku i tekst poruke.
    Metoda kreira poruku i stavlja je u niz istorija usluga.
    - napisati metodu pozovi, koja prima broj koji treba pozvati i trajanje poziva u sekundama.
    Metoda kreira poziv i stavlja ga u niz istorija usluga.
    - napisati metodu cenaSvihUsluga koja vraca ukupnu cenu svih usluga (double) koje je korisnik obavio,
    tako sto prodje kroz niz istorija usluga i sumira cene svih usluga koje se nalaze u tom nizu*/

    private static final AtomicInteger count = new AtomicInteger(0);
    private String ime;
    private String prezime;
    private Broj broj;
    private int id;
    private ArrayList<Usluga> istorijaUsluga=new ArrayList<>();

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.id = count.incrementAndGet();
    }

    @Override
    public String toString() {
        return this.ime+" "+this.prezime+" "+ broj + "\n"+
                "Istorija usluga= " + istorijaUsluga.toString();
    }
    public void posaljiPoruku(Broj brojNaKojiSaljemo, String tekstPoruke) {
        Poruka poruka = new Poruka(broj, brojNaKojiSaljemo, tekstPoruke);
        istorijaUsluga.add(poruka);
    }
    public void pozovNaBroj(Broj brojKojiTrebaPozvati, int trajanjePoziva) {
        Poziv poziv = new Poziv(broj, brojKojiTrebaPozvati, trajanjePoziva);
        istorijaUsluga.add(poziv);
    }
    public double cenaSvihUsluga() {
        double ukupnaCena = 0;
        for (Usluga usluga : istorijaUsluga) {
            ukupnaCena += usluga.cenaUsluge();
        }
        return ukupnaCena;
    }
    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }
}
