package Byggpaket;
import java.util.ArrayList;
import java.util.Scanner;

public class Lägenhetshus {
    private int förråd; //hur många förråd som finns
    private int trappor;
    private String namn;
    private Lägenhet lägenhet;
    private ArrayList <Lägenhet> lägenheter;

    Scanner tb = new Scanner(System.in);

    public Lägenhetshus(int förråd, int trappor, String namn ,Lägenhet lägenhet, ArrayList<Lägenhet> lägenheter)
    {
        if(namn == null|| namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("namn får inte vara tom eller mellanslag");
        }
        this.namn = namn;
        this.förråd = gränsCheck(förråd, 20, 10, tb);
        this.trappor = gränsCheck(trappor,6, 1, tb);
        this.lägenhet = lägenhet;
        lägenheter.add(lägenhet);

    }

    public void setFörråd(int förråd) {
        förråd = gränsCheck(förråd,20,10, tb);
        this.förråd = förråd;
    }
    public void setTrappor(int trappor)
    {
        trappor = gränsCheck(trappor, 6,1, tb);
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





    public static int gränsCheck(int checkvärde, int övre ,int undre, Scanner tb )
    {
        while(true)
        { 
            try{
            

            if(checkvärde > övre || checkvärde < undre)
            {
               throw new IllegalArgumentException(  " Värde får inte vara större än" + övre + " och inte mindre än" + undre);
                
            }
            else
            {
                return checkvärde;
            }

            }
            catch (Exception e) 
            {
                System.out.println("Ange nytt värde");
                checkvärde = tb.nextInt();
                continue;
            }


        }
    }

    public int antalBilar()
    {
        return lägenheter.size();
    }

}
