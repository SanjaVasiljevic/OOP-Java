package VezbanjeOOPApstractClassesKartica;

public class MainKartica {
    /*Napraviti Visa i Master karticu i testirati funkcije*/
    public static void main(String[] args) {
        PlatnaKartica viza=new VisaCart(1000,"1234-5678",2021,11,"SanjaVasiljevic");
        viza.dodajSrestva(200);
        viza.izvrsiTransakciju(100);
        viza.stampaj();

        MasterCart master=new MasterCart(2000,"0000-1234",2020,12);
        master.dodajSrestva(1000);
        master.izvrsiTransakciju(200);
        master.naplatiOdrzavanje();// ovo nije karakteristicno za PlatnuKarticu
        master.stampaj();
    }
}
