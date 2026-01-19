package Byggpaket;

public class Lägenhet {
    private int lägenhetsYta;
    private int möbler;
    private int balkong;
    private int köksyta;
    private int sängar;
    private int pris;
    private int rum;
    

    public Lägenhet(int lägenhetsyta, int möbler, int balkong, int köksyta, int sängar)
    {
        this.lägenhetsYta = gränsCheck(lägenhetsYta, 200, 80 );
        this.möbler = gränsCheck(möbler, 12, 4);
        this.balkong = gränsCheck(balkong, 2, 1);
        this.köksyta = gränsCheck(köksyta, 40, 20);
        this.sängar = gränsCheck(sängar, 8, 2);
        this.pris = gränsCheck(pris, 450000, 2000000);
        this.rum = gränsCheck(rum, 5, 1);
    }

    public void setBalkong(int balkong) {
        balkong = gränsCheck(balkong, 2, 1);
        this.balkong = balkong;
    }
    public void setKöksyta(int köksyta) {
        köksyta = gränsCheck(köksyta, 40, 20);
        this.köksyta = köksyta;
    }
    public void setLägenhetsYta(int lägenhetsYta) {
        lägenhetsYta = gränsCheck(lägenhetsYta, 200, 80 );
        this.lägenhetsYta = lägenhetsYta;
    }
    public void setMöbler(int möbler) {
        möbler = gränsCheck(möbler, 12, 4);
        this.möbler = möbler;
    }
    public void setPris(int pris) {
        pris = gränsCheck(pris, 450000, 2000000);
        this.pris = pris;
    }
    public void setSängar(int sängar) {
        sängar = gränsCheck(sängar, 8, 2);
        this.sängar = sängar;
    }

    public int getBalkong() {
        return this.balkong;
    }
    public int getKöksyta() {
        return this.köksyta;
    }
    public int getLägenhetsYta() {
        return this.lägenhetsYta;
    }
    public int getMöbler() {
        return this.möbler;
    }
    public int getPris() {
        return this.pris;
    }
    public int getRum() {
        return this.rum;
    }
    public int getSängar() {
        return this.sängar;
    }





    public int gränsCheck(int checkvärde, int övre, int undre)
    {
       if(checkvärde > övre || checkvärde < undre)
        {
            throw new IllegalArgumentException(checkvärde + " får inte vara större än " + övre + " eller mindre än " + undre);
        }
        return checkvärde;
    }
}
