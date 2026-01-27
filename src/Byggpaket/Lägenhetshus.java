package Byggpaket;
import java.util.ArrayList;

public class Lägenhetshus {
    private int förråd; //hur många förråd som finns
    private int trappor;
    private String namn;
    private Lägenhet lägenhet;
    private ArrayList <Lägenhet> lägenheter;

    public Lägenhetshus(int förråd, int trappor, String namn ,Lägenhet lägenhet, ArrayList<Lägenhet> lägenheter)
    {
        if(namn == null|| namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("namn får inte vara tom eller mellanslag");
        }
        this.namn = namn;
        this.förråd = gränsCheck(förråd, 20, 10);
        this.trappor = gränsCheck(trappor,6, 1);
        this.lägenhet = lägenhet;
        lägenheter.add(lägenhet);

    }

    public void setFörråd(int förråd) {
        förråd = gränsCheck(förråd,20,10);
        this.förråd = förråd;
    }
    public void setTrappor(int trappor)
    {
        trappor = gränsCheck(trappor, 6,1);
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





    public int gränsCheck(int checkvärde, int undre, int övre)
    {
      while(true)
        { 
            if(checkvärde > övre || checkvärde < undre)
            {
               System.out.println(checkvärde + " får inte vara större än" + övre + " och inte mindre än" + undre);
            }
            else
            {
                break;
            }
        }
        
        return checkvärde;
    }

    public int antalBilar()
    {
        return lägenheter.size();
    }

}
