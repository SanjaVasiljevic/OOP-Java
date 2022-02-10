package VezbanjeOOPRadnikNis;

public class Zadatak5 {
    public static void main(String[] args) {

        Radnik k = new Radnik("23982389189");
        k.setPunoIme("Marko Markovic");
        k.setDeca(3);
        k.setSss(7);
        k.setRadniStaz(7);

        Radnik r = new Radnik("1802976805555", "Milan Jovanovic", 2, 4, 10);
        System.out.println("Minuli rad za "+r.getPunoIme()+ " je "+ r.minuliRad()+ " koficijet je "+ r.koficijentSlozenosti() );
        System.out.println("Plata je: "+r.plata());
        double plata= r.plata();
        System.out.println("Kreditno sposoban "+ r.kreditnoSpsoban());

    }
}
