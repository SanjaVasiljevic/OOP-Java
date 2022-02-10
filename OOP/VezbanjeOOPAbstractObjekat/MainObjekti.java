package VezbanjeOOPAbstractObjekat;

public class MainObjekti {
    public static void main(String[] args) {

        PoreskaUprava p=new PoreskaUprava("Novi Sad");
        p.dodajObjekat(new Kuca("Kraljevica Marka 3",45,2,3));
        p.dodajObjekat(new Zgrada("Bul.Despota Stefana 1",60,1,4));
        p.dodajObjekat(new Lokal("Petra Drapsina 35",120,1));
        p.dodajObjekat(new Zgrada("Futoska 20",80,2,10));

        Objekat najveciPorez = p.objekatSaNajvecimPorezom();
        System.out.println("Objekat sa najvecim porezom ");
        najveciPorez.stampaj();

        Objekat najmanjiPorez= p.objekatSaNajmanjimPorezom();
        System.out.println("Objekat sa najmanjim porezom ");
        najmanjiPorez.stampaj();
        System.out.println("Ukupan porez za ceo grad Novi Sad je "+ p.ukupanPorez());
        p.stampajSve();

    }



}
