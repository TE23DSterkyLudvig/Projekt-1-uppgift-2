package Byggpaket;

import java.util.Scanner;
//Barnklass av Bostäder för garage
public class Garage extends Bostäder implements Garagefunktioner  {

    private int bilplatsYta;
    private int förrådsyta;
    Scanner tb = new Scanner(System.in);
    
    //konstruktor för garage

    public Garage(int id,int bilplatsYta, int förrådsyta, int pris, String namn)
    {
        super(id, 4 ,170,1,1,pris,400,namn);
        // behöver ingen check på dessa värden då jag gör kontroll i Mainfunktioner
        this.förrådsyta = förrådsyta;
        this.bilplatsYta = bilplatsYta;
    }

    // set metoder
    public void setBilplatsYta( int bilplatsYta)
    {
        this.bilplatsYta = gränsCheck(bilplatsYta, 30, 15, tb);
    }

    public void setFörrådsyta(int förrådsyta)
    {
        this.förrådsyta = gränsCheck(förrådsyta, 20, 5, tb);
    }

    //get metoder
    public int getBilplatsYta() 
    {
        return this.bilplatsYta;
    }

    public int setFörrådsyta()
    {
        return this.förrådsyta;
    }
    // implementerad garagemetod
    @Override
    public void tändaLampor()
    {
        System.out.println("Lamporna tänds!");
    }
    // implementerad garagemetod
    @Override
    public void öppnaGaragedörr()
    {
        System.out.println("Garagedörr öppnas!");
    }

    // gränscheck
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

    // skriver ut alla värden av instansen
    @Override
    public String toString()
    {
        return "Garage: \n1. id " + this.id + "\n2. bilplatsyta " + this.bilplatsYta + " kvm\n3. förrådsyta " + this.förrådsyta + " kvm\n4. pris  " + getPris() + " kr\n5. adressnamn " + this.namn ;
    }
}
