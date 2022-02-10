package VezbanjeOOPApstractClassesKartica;

public class VisaCart extends PlatnaKartica{

    /*Napraviti VizaKarticu koja nasledjuje klasu PlatnuKartica
    -ovlasceno lice cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri
    -getter i setter za ovlasceno lice
    -konstruktor za parametre
    -implemetira metodu izvrsiTransakciju tako da na prosledjenu sumu
    dodaje proviziju od 1.8% sume.Najmanja provizija moze biti 4$
    -implemetirati metodu koja stampa podatke o kartici u formatu
    VisaCart br.kartice, datum do kad vazi i koliko novaca je na njoj

     */
    private String ovlascenoLice;

    public VisaCart(double suma, String brojKartice, int godina, int mesec,String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice= ovlascenoLice;
    }


    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija= 1.8/100*iznos;
        if(provizija<4){
            this.suma=this.suma-iznos-4;
        }else {
            this.suma=this.suma-iznos-provizija;
        }

    }

    @Override
    public void stampaj() {
        System.out.print("VisaCart: ");
        System.out.print(this.brojKartice+", ");
        System.out.println(this.mesec+"/"+this.godina+", "+"$"+this.suma);

    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}
