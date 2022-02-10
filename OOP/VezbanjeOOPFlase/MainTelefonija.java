package VezbanjeOOPFlase;

import VezbanjeOOPTelefonija.Broj;
import VezbanjeOOPTelefonija.Korisnik;

public class MainTelefonija {
	public static void main(String[] args) {

	/* - napraviti 2 broja
	 - i dva korisnika sa tim brojevima
	 - zatim korinisci jedan drugom treba da salju neke poruke i obavljaju neke pozive (min 3 poruke i 2 poziva)
	 - zatim treba ispisati oba korisnika
	 - zatim treba ispisati kolika je cena svih usluga za svakog korisnika.*/

		Broj srninBroj = new Broj("+381", "60", "4004152",false);
		Broj milicinBroj = new Broj("+381", "63", "123456",false);
		Korisnik srna = new Korisnik("Srna", "Srnic", srninBroj);
		Korisnik milica = new Korisnik("Milica", "Milic", milicinBroj);

		milica.pozovNaBroj(srninBroj,200);
		srna.pozovNaBroj(milicinBroj,120);
		milica.posaljiPoruku(srninBroj,"Svrati do mene :)");
		milica.posaljiPoruku(srninBroj,"Kupi vino:)");
		System.out.println(milica);
		System.out.println(milica.cenaSvihUsluga());
		System.out.println(srna);
		System.out.println(srna.cenaSvihUsluga());



	}
}
