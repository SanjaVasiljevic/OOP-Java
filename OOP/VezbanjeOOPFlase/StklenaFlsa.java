package VezbanjeOOPFlase;

public class StklenaFlsa extends Flasa{
    protected double cenaSaKaucijom;

    public StklenaFlsa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstePica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstePica);

    }
    @Override
    public double cenaSaKaucijom(){
        if(zapremina<0.5){
           cenaSaKaucijom=getCenaSaKaucijom()+getCenaBezKaucije()*5/100;
        }else if(zapremina>=0.5){
            cenaSaKaucijom=getCenaBezKaucije()+getCenaBezKaucije()*10/100;
        }
        return cenaSaKaucijom;
    }




    public void stampajStaklenuFlasu() {
        System.out.println("Flasa-Staklren flasa");
    }

    public double getCenaSaKaucijom() {
        return cenaSaKaucijom;
    }

    public void setCenaSaKaucijom(double cenaSaKaucijom) {
        this.cenaSaKaucijom = cenaSaKaucijom;
    }
}
