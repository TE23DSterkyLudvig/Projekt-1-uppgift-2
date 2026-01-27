package Byggpaket;
import java.util.Scanner;

public class Mainfunktioner 
{
    Scanner tb = new Scanner(System.in);

    public Bostäder villaKöp( Bostäder bostad, int rum, int bostadsyta, int toalettAntal, int tomtyta, int kök, int pris, String namn, Boolean bilplats)
    {
        System.out.println("vill köpa villa!");
        System.out.println("Ange Rum mellan 4 och 7");
        rum = tb.nextInt();
        rum = gränsCheck(rum, 7, 4, tb);


        System.out.println("Ange bostadsyta mellan 170 och 230 kvm");
        bostadsyta = tb.nextInt();
        bostadsyta = gränsCheck(bostadsyta, 230, 170, tb);
        

        System.out.println("Ange antal toaletter mellan 1 och 2");
        toalettAntal = tb.nextInt();
        toalettAntal = gränsCheck(toalettAntal, 2, 1, tb);


        System.out.println("endast 1 kök möjligt, skriv in");
        kök = tb.nextInt();
        kök = gränsCheck(kök, 1, 1, tb);


        System.out.println("Ange tomtyta mellan 400 och 1000");
        tomtyta = tb.nextInt();
        tomtyta = gränsCheck(tomtyta, 1000, 400, tb);


        System.out.println("Ange pris mellan 500000 och 15000000");
        pris = tb.nextInt();
        pris = gränsCheck(pris, 15000000, 500000, tb);

        bilplats = true;

       while (true) 
        {
        
          try 
          {
            System.out.println("ange adressnamn");
            namn = tb.nextLine(); 
            if(namn == null || namn.trim().isEmpty())
            {
                throw new IllegalArgumentException("Inte tom eller bara mellanrum!");
            }
            else
            {
                break;
            }
          } 
          catch (Exception e) 
          {
            tb.nextLine();
             continue;            
          }
        }

        bostad = new Villa(rum, bostadsyta, toalettAntal, kök, pris, tomtyta, namn, bilplats);

        return bostad;

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
