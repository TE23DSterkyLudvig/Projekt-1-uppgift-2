package Byggpaket;

import java.util.Scanner;

public class Garage extends Bostäder implements Garagefunktioner  {

    private int bilplatsYta;
    private int förrådsyta;
    Scanner tb = new Scanner(System.in);

    public Garage(int bilplatsYta, int förrådsyta, int pris, String namn)
    {
        super(0,0,0,0,pris,0,namn);

        this.förrådsyta = gränsCheck(förrådsyta, 20, 5, tb);
        this.bilplatsYta = gränsCheck(bilplatsYta, 30, 15, tb);
    }

    public void setBilplatsYta( int bilplatsYta)
    {
        this.bilplatsYta = gränsCheck(bilplatsYta, 30, 15, tb);
    }

    public void setFörrådsyta(int förrådsyta)
    {
        this.förrådsyta = gränsCheck(förrådsyta, 20, 5, tb);
    }

    
    public int getBilplatsYta() 
    {
        return this.bilplatsYta;
    }

    public int setFörrådsyta()
    {
        return this.förrådsyta;
    }

    @Override
    public void tändaLampor()
    {
        System.out.println("Lamporna tänds!");
    }

    @Override
    public void öppnaGaragedörr()
    {
        System.out.println("Garagedörr öppnas!");
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
}
