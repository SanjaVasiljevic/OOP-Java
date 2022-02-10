package VezbanjeOOPAbstractObjekat;

import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {
    private String grad;
    private List<Objekat> objekti= new ArrayList<Objekat>();

    public PoreskaUprava(String grad) {
        this.grad = grad;
    }

    public PoreskaUprava() {
        super();
    }
    public void dodajObjekat( Objekat objekat){
        this.objekti.add(objekat);
    }
    public double ukupnaPorez(){
        double suma=0;
        for (int i=0; i<this.objekti.size(); i++){
            suma+=this.objekti.get(i).racunajPorez();
        }
        return suma;
    }
    public void stampajSve() {
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
        }
    }
    public Objekat objekatSaNajvecimPorezom() {
        int inedx=0; //pretpostavka da najveci porez ima nulti
        for (int i=0; i<objekti.size(); i++){
            if(this.objekti.get(i).racunajPorez()> this.objekti.get(inedx).racunajPorez()){
                inedx=i;
            }
        }
        return this.objekti.get(inedx);
    }
    public Objekat objekatSaNajmanjimPorezom(){
        int inedx=0; //pretpostavka da najveci porez ima nulti
        for (int i=0; i<objekti.size(); i++){
            if(this.objekti.get(i).racunajPorez()< this.objekti.get(inedx).racunajPorez()){
                inedx=i;
            }
        }
        return this.objekti.get(inedx);
    }
    public String getGrad() {
        return grad;
    }
    /*2 nacin:
    Objekat o= this.objekat.get(0);
    for (int i=0; i<this.objekti.size(); i++){
    if (this.objekti.get(i).racunajPorez()<o.racunajPorez(){
    o=this.objekti.get(i);
    }
     */
    public double ukupanPorez(){
        double suma=0;
        for(int i=0; i<this.objekti.size();i++){
            suma+=this.objekti.get(i).racunajPorez();
        }
        return suma;

    }

    public void setGrad(String grad) {
        this.grad = grad;
    }
}
