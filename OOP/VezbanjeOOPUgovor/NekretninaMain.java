package VezbanjeOOPUgovor;

public class NekretninaMain {
    public static void main(String[] args) {
        FizickoLice milan = new FizickoLice("Milan Jovanovic", "1212", "213", true);
        FizickoLice nikola = new FizickoLice("Nikola", "12345", "1234", true);

        Ugovor ugovor = new Ugovor("Novi Sad", 50000, 2021, 10, 12);
        ugovor.setKupac(milan);
        ugovor.setProdavac(nikola);
        ugovor.stampaj();

    }


}

