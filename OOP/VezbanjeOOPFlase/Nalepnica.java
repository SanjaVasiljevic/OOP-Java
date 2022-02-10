package VezbanjeOOPFlase;

import java.util.concurrent.atomic.AtomicInteger;

public class Nalepnica {
    protected String naziv;
    protected int id;
    protected static final AtomicInteger count = new AtomicInteger(0);

    public Nalepnica(String naziv) {
        this.naziv = naziv;
        this.id = count.incrementAndGet();
    }

    @Override
    public String toString() {
        return
                "Id=" + id +"\n"+ "Naziv= " + naziv;


    }

    public String getNaziv() {
        return naziv;
    }

    public int getId() {
        return id;
    }

}

