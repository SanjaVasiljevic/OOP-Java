package VdezbanjeOOPVideoPlayer;

public class AudioControl extends Control {

   /* Kreirati klasu AudioControl koja nasledjuje klasu Control i
    gettere, settere i konstruktore
    ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100*/

    private boolean jePovecanZvuk;

    public AudioControl(boolean jePovecanZvuk) {
        super();
        this.jePovecanZvuk = jePovecanZvuk;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if (jePovecanZvuk && player.getJacinaZvuka() <= 100) {
            player.setJacinaZvuka(player.getJacinaZvuka() + 1);
        } else if (!jePovecanZvuk && player.getJacinaZvuka() > 0) {
            player.setJacinaZvuka(player.getJacinaZvuka()- 1);
        } else {
            System.out.println("Ne moze da se promeni jacina zvuka");
            /*player.jacinaZvuka = 0;*/
        }

    }

    public boolean isJePovecanZvuk() {
        return jePovecanZvuk;
    }

    public void setJePovecanZvuk(boolean jePovecanZvuk) {
        this.jePovecanZvuk = jePovecanZvuk;
    }
}




