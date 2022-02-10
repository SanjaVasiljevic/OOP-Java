package VezbanjeOOPFacebookPostReakcije;

import java.util.ArrayList;

public class FacebookPost {
    /* Kreirati klasu FacbokPost koja ima
    - Ime i prezime korisnika koji je stavio oglas
    -tekst objave
    -niz reakcija
    -Metodu reaguj koja dodaje reakciju u niz
    -MOdifikacija za vezbu. Ukoliko se desi situacija da jedan korisnik
    reaguje na post ( tj postoji rekcija korisnika sa istim imenom i prezimeno)
    Izbaciti prethodnu reakciju i uracunati novu.
    -Privatnu metodu koja vraca broj reakcija odredjenog tipa(prosedjuje se tip reakcije koja moze biti tipa smile, like, hart)
    -Metoda stampaj koja stampa podatke u formatu
     */
    private String autor;
    private String tekst;
    private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();

    public FacebookPost(String autor, String tekst) {
        this.autor = autor;
        this.tekst = tekst;
    }

    public void reaguj(Reakcija reakcija) {
        this.reakcije.add(reakcija);
    }

    public void reaguj(String korisnik, String tip) {
        this.reakcije.add(new Reakcija(korisnik, tip));
    }

    // public static int brojPonavljanja(int[] niz, int k){ podsetnik
    // for ( int i=o, i<niz.length; i++)
    //if(niz[i]==k)
    // counter++
    //return counter++
    private int brojPonavljanja(String reakcija) { // Ono sto se definisie kao private dostupno je samo u toj kalsi i ova metoda se moze koristiti samo u klasi i ova metoda je pomocna za neku drugu metodu.
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(reakcija)) {
                counter++;
            }
        }
        return counter;
    }

    public void stampaj() {
        System.out.println(this.autor);
        System.out.println(this.tekst);
        System.out.print("Smile " + this.brojPonavljanja("Smile") + " | ");
        System.out.print("Like " + this.brojPonavljanja("Like") + " | ");
        System.out.print("Hart " + this.brojPonavljanja("Hart"));
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
