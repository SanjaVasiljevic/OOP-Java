package VdezbanjeOOPVideoPlayer;

public class VideoPlayer {
/*Kreirati klasu VideoPlayer koja ima:
duzinu videa
trenutno vreme videa
jacinu zvuka
Kvalitet videa (144, 240, 360, 480, 720, 1080)
gettere, settere i konstruktore
metodu stampaj koja stampa podatke u formatu:
trenutno vreme videa
jacina zvuka
kavlitet videa
*/
    public int duzinaVidea;
    public int trenutnoVreme;
    public int jacinaZvuka;
    public int kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj() {
        System.out.println("Trenutno vreme: " + trenutnoVreme);
        System.out.println("Jacina zvuka: " + jacinaZvuka);
        System.out.println("Kvalitet videa: " + kvalitetVidea);
        System.out.println();
    }

    public VideoPlayer() {
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
}
