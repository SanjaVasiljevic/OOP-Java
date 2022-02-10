package VezbanjeOOPTelefonija;

public class Poruka extends Usluga {
	/*  Napisati klasu Poruka. Poruka je Usluga koja ima sledece dodatne atribute:
		- tekstPoruke (String)
	   Napisati:
	  - konstruktor
	  - gettere i  settere
	  - toString metodu, format je
	  brojOd -> brojKa tekstPoruke
	  npr+381 63 1234567 -> +381 62 234123 Cao :).
	  - nadjacati metodu cena usluge. Metoda vraca koliko je cena slanja poruke sa brojOd na brojKa.
	  Cena poruke ukoliko ju je moguce poslati je 3 dinara, ukoliko je nije moguce poslati cena je 0 dinara.
	  Poruku je moguce poslati ako
		  - brojOd nije jednak null
		  - brojKa nije jednak null i
		  - brojOd i brojKa nisu jednaki medjusobno i
		  - brojOd nije fiksni broj i
		  - brojKa nije fiksni broj*/
	private String tekstPoruke;

	public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
		super(brojOd, brojKa);
		this.tekstPoruke = tekstPoruke;
	}


	@Override
	public double cenaUsluge() {
		double cenaPoruke = 0;
		if ((getBrojOd() != null && getBrojKa() != null) && !getBrojOd().equals(getBrojKa()) && !(getBrojOd().isFiksniBroj()) && !(getBrojKa().isFiksniBroj())) {
			cenaPoruke = 3;
		} else {
			cenaPoruke = 0;
		}
		return cenaPoruke;
	}


	@Override
		public String toString () {
			return super.toString() + " " + tekstPoruke;
		}

		public String getTekstPoruke () {
			return tekstPoruke;
		}

		public void setTekstPoruke (String tekstPoruke){
			this.tekstPoruke = tekstPoruke;
		}
	}

