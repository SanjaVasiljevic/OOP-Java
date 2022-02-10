package VezbanjeOOPFilmVezaKlaseprekoObjekata;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziser;
    public Film(){

    }
    public Film( String naziv, int godina ){
        this.naziv=naziv;
        this.godina=godina;
    }

    public java.lang.String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public void stampaj(){
        System.out.println("Film: " + this.naziv+ ","+this.godina);
        if (this.reziser!=null){
            System.out.println("Reziser: "+ this.reziser.getImeIPrezime()+ ","+ this.reziser.getStarost()+ " godina.");
        }

    }
    public void setReziser ( Reziser r){
        this.reziser=r;
    }
    public Reziser getReziser(){

        return this.reziser;
    }

}



