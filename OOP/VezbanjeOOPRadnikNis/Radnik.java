package VezbanjeOOPRadnikNis;

public class Radnik {
    private String jmbg;
    private String punoIme;
    private int deca;
    private int sss;
    private int radniStaz;

    public Radnik(String jmbg,
                  String punoIme,
                  int deca,
                  int sss,
                  int radniStaz) {
        this.jmbg = jmbg;
        this.punoIme = punoIme;
        this.deca = deca;
        this.radniStaz = radniStaz;
    }

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getJmbg() {
        return this.jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getDeca() {
        return this.deca;
    }

    public void setDeca(int deca) {
        this.deca = deca;
    }

    public int getSss() {
        return this.sss;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    public int getRadniStaz() {
        return this.radniStaz;
    }

    public void setRadniStaz(int i) {
        this.radniStaz = radniStaz;
    }

    public double minuliRad() {
        double m = 0;
        if (this.radniStaz < 10) {
            m = 0.05;
        } else if (this.radniStaz < 20) {
            m = 0.075;
        } else {
            m = 0.1;
        }
        return m;
    }

    public double koficijentSlozenosti() {
        double k = 1.0;
        switch (this.sss) {
            case 1:
                k = 1.03;
                break;
            case 2:
                k = 1.65;
                break;
            case 3:
                k = 2.00;
                break;
            case 4:
                k = 2.27;
                break;
            case 5:
                k = 2.88;
                break;
            case 6:
                k = 3.09;
                break;
            case 7:
                k = 3.40;
                break;
            case 8:
                k = 4.12;
                break;
        }
        return k;
    }
    public double plata(){
        double mr=this.minuliRad();
        double ks=this.koficijentSlozenosti();
        return 25000+(ks+mr)*10000;

    }
    public boolean kreditnoSpsoban(){
        return this.plata()>50000;
    }


}



