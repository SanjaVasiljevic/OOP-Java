package VezbanjeOOPAreeysObjekataZeleniKarton;

public class ZeleniKarton {
    /* Kreirati klasu Zeleni Karton koja ima;
    -Ime i prezime
    -broj indeksa
    -naziv predmeta
    -ocenu od 5-10
    ime i prezime profesora
    gettere i settere
    -konstruktore
    -Metodu koja vraca da li je ispit polozen ili ne , ako je ocena veca od 5
    - Metodu stampaj koja stampa podatke u formatu
    (naziv predmeta)-(ocena0
    Student ime i prezime broj indeksa
    Profesor Ime i prezime
     */
    private String imeIprezime;
    private int brojIndex;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imeIprezime, int brojIndex, String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        this.imeIprezime = imeIprezime;
        this.brojIndex = brojIndex;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public ZeleniKarton() {
    }

    public boolean polozenIspit(int ocena){
        if(this.ocena<5){
            return false;
        }else {
            return true;
        }
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta+"-"+this.ocena);
        System.out.println(this.imeIprezime+", broj indeksa "+this.brojIndex);
        System.out.println(this.imeIPrezimeProfesora);
    }


    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getBrojIndex() {
        return brojIndex;
    }

    public void setBrojIndex(int brojIndex) {
        this.brojIndex = brojIndex;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }
}
