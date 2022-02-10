package VezbanjeOOPFilmVezaKlaseprekoObjekata;

public class Main {
    public static void main(String[] args) {

        Film film= new Film("Incepcion",2011);
        Reziser cn= new Reziser("Christopher Nolan",50);
        film.setReziser(cn);
        // cn je adresa rezisera i preko filma se gadja adresa i ovde gradi veza izmedju objekata
        film.stampaj();
    }
}
