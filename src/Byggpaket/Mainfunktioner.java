package Byggpaket;
import java.util.Scanner;

//Metoder för App.java som att till exempel köpa fastighet
public class Mainfunktioner 
{

    Scanner  tb = new Scanner(System.in);
    // om man köper villa

    public Bostäder villaKöp( int id, int rum, int bostadsyta, int toalettAntal, int tomtyta, int kök, int pris, String namn, Boolean bilplats, Scanner tb)
    {
        System.out.println("vill köpa villa!");
        System.out.println("Ange id för beställning i siffor");
        id = tb.nextInt();
        id = gränsCheck(id, 999999999, 0, tb);

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
        tb.nextLine();
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
             continue;            
          }
        }

        Villa villa = new Villa(id,rum, bostadsyta, toalettAntal, kök, pris, tomtyta, namn, bilplats);

        return villa;

    }

//om man köper radhus
    public Bostäder radhusKöp (int id,  int rum, int bostadsyta, int toalettAntal, int tomtyta, int kök, int pris, String namn, Scanner tb)
    {
        System.out.println("vill köpa radhus!"); 
        System.out.println("Ange id för beställning i siffor");
        id = tb.nextInt();
        id = gränsCheck(id, 999999999, 0, tb);

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


        tb.nextLine();
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
             continue;            
          }
        }

        Radhus radhus = new Radhus(id,rum, bostadsyta, toalettAntal, kök, pris, tomtyta, namn);

        return radhus;
    }

// om man köper garage
    public Bostäder garageKöp( int id,int bilplatsYta, int förrådsyta, int pris, String namn, Scanner tb)
    {   
        System.out.println("Vill köpa garage!");
        System.out.println("Ange id för beställning i siffor");
        id = tb.nextInt();
        id = gränsCheck(id, 999999999, 0, tb);

        System.out.println("Ange yta för bilplatsyta i kvm mellan 30 och 15 kvm");
        bilplatsYta = tb.nextInt();
        bilplatsYta = gränsCheck(bilplatsYta, 30, 15, tb);

        System.out.println("ange yta för förråd i kvm mellan 20 och 5 kvm");
        förrådsyta = tb.nextInt();
        förrådsyta = gränsCheck(förrådsyta, 20, 5, tb);

        System.out.println("Ange pris mellan 500000 och 15000000");
        pris = tb.nextInt();
        pris = gränsCheck(pris, 15000000, 500000, tb);

        tb.nextLine();
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
             continue;            
          }
        }

        Garage garage = new Garage(id, bilplatsYta, förrådsyta, pris, namn);

        return garage;
    }

// om man köper lägenhet
    public Bostäder lägenhetsköp(int id, int lägenhetsyta, int möbler, int balkong, int köksyta, int sängar, int pris, int rum)
    {
        System.out.println("vill köpa lägenhet!"); 
        System.out.println("Ange id för beställning i siffor");
        id = tb.nextInt();
        id = gränsCheck(id, 999999999, 0, tb);

        System.out.println("Ange lägenhetsyta i kvm mellan 200 och 80 ");
        lägenhetsyta = tb.nextInt();
        lägenhetsyta = gränsCheck(lägenhetsyta, 200, 80, tb); 

        System.out.println("ange antal möbler mellan 12 och 4");
        möbler = tb.nextInt();
        möbler = gränsCheck(möbler, 12, 4, tb);

        System.out.println("ange antal balkonger mellan 2 och 1 balkonger");
        balkong = tb.nextInt();
        balkong = gränsCheck(balkong, 2, 1, tb);

        System.out.println("Ange köksyta i dm^3 mellan 40 och 20 dm^3");
        köksyta = tb.nextInt();
        köksyta = gränsCheck(köksyta, 40, 20, tb);

        System.out.println("Ange antal sängar mellan 8 och 2 sängar");
        sängar = tb.nextInt();
        sängar = gränsCheck(sängar, 8, 2, tb);

        System.out.println("Ange pris mellan 1000000  och 4000000  kr");
        pris = tb.nextInt();
        pris = gränsCheck(pris, 4000000, 1000000, tb);

        System.out.println("Ange rum mellan 1 och 5");
        rum = tb.nextInt();
        rum = gränsCheck(rum, 5, 1, tb);

        Lägenhet lägenhet = new Lägenhet(id, lägenhetsyta, möbler, balkong, köksyta, sängar, pris, rum);
        
        return lägenhet;
    }
    
   
   //gränscheck
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
