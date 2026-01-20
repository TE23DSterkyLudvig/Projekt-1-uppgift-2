package Byggpaket;
import java.util.ArrayList;

public class Lägenhetshus {
    private int förråd; //hur många förråd som finns
    private int trappor;
    private String namn;
    private Lägenhet lägenhet;
    private ArrayList <Lägenhet> lägenheter;

    public Lägenhetshus(int förråd, int trappor, Lägenhet lägenhet, ArrayList<Lägenhet> lägenheter)
    {
        if(namn == null|| namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("namn får inte vara tom eller mellanslag");
        }
        this.namn = namn;
        this.förråd = gränsCheck(förråd, 10, 20);
        this.trappor = gränsCheck(trappor,1, 6);
        this.lägenhet = lägenhet;
        lägenheter.add(lägenhet);

    }

    public void setFörråd(int förråd) {
        förråd = gränsCheck(förråd,10,20);
        this.förråd = förråd;
    }
    public void setTrappor(int trappor)
    {
        trappor = gränsCheck(trappor, 1,6);
    }

    public void setNamn(String namn)
    {
       if(namn == null|| namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("namn får inte vara tom eller mellanslag");
        }  
        this.namn = namn;
    }


    public int getFörråd() {
        return this.förråd;
    }

    public int getTrappor()
    {
        return this.trappor;
    }

    public String getNamn() {
        return this.namn;
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
