package VezbanjeOOPFlase;

public class PlasticnaFlsa extends Flasa {

    public PlasticnaFlsa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstePica vrstePica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstePica);
    }

    @Override
    public double cenaSaKaucijom() {
        return cenaBezKaucije=getCenaBezKaucije();
    }

    public void stampajPlasticnuFlasu(){
        System.out.println("Flasa-plasticna");

    }
}
