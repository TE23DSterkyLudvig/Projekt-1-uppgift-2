import java.util.Scanner;
import java.util.ArrayList;
import Byggpaket.*;

public class App extends Mainfunktioner {
    public static void main(String[] args) throws Exception {
    
    Scanner tb = new Scanner(System.in); // tar in värden.
        
    ArrayList <Bostäder> beställningar = new ArrayList<Bostäder>(); // lagrar beställningar
    
    
    int menyval = 0; // när man gör val i menyn
    int byggnadsVal = 0;        // vilken fastighet
    Mainfunktioner mekanik = new Mainfunktioner();   // så att jag kan använda Mainmetoderna
    int id = 0;                                     // så att jag ska kunna ta bort bostäder.
    int totalsumma = 0;


    int tomtyta =0;
    int rum = 0;
    int bostadsyta = 0;
    int toalettAntal = 0;
    int kök = 0;
    int pris = 0;
    String namn = ""; // adressnamn
    Boolean bilplats = true;
    int bilplatsYta = 0;
    int förrådsyta = 0;
    int lägenhetsYta = 0;
    int möbler = 0;
    int balkong = 0;
    int köksyta = 0;
    int sängar = 0;

    
    
    

    

    //skriver ut menyen och man får göra ett val utifrån att lägga beställ, ta bort beställ , list beställ och lista vinst.
    while(true)
    {
        System.out.println("Välkommen till Luddes Fastighets och bostadsbyrå!");
        System.out.println
        (
            "1. Lägg till beställning \n2. Ta bort beställning \n3. Lista beställningar \n4. Lista vinst \n5. avsluta program \n Ange val i."
        ); 

        menyval = tb.nextInt();
               
        menyval = gränsCheck(menyval, 5,1,tb);
 
        switch(menyval)
        {
            // om man väljer att köpa en fastighet
            case 1: 
            byggnadsVal = byggnadsValet(byggnadsVal, tb);
            Bostäder bostad;
            switch(byggnadsVal)
            {
                case 1:
                    bostad = mekanik.villaKöp(id,rum,bostadsyta, toalettAntal, tomtyta, kök, pris, namn, bilplats, tb );
                    beställningar.add(bostad);
                    System.out.println("Lagt till en villabeställning");
                    break;

                case 2:
                    bostad = mekanik.radhusKöp(id,rum,bostadsyta, toalettAntal, tomtyta, kök, pris, namn, tb );
                    beställningar.add(bostad);
                    System.out.println("Lagt till en radhusbeställning");
                    break;

                case 3:
                    bostad = mekanik.garageKöp(id, bilplatsYta, förrådsyta, pris, namn, tb);
                    beställningar.add(bostad);
                    System.out.println("Lagt till en garagebeställning");
                    break;

                case 4:
                    bostad = mekanik.lägenhetsköp(id, lägenhetsYta, möbler, balkong, köksyta, sängar, pris, rum);
                    beställningar.add(bostad);
                    System.out.println("lagt till lägenhetsbeställning");
                    break;
            }
            break;
            // Om man vill ta bort en bostad
            case 2:
                System.out.println("Ange det id på den fastighet som ska tas bort");
                id = tb.nextInt();
                id = gränsCheck(id,999999999, 0, tb);

                for (int i = 0; i < beställningar.size(); i++) 
                {
                    if(beställningar.get(i).getId() == id)
                    {
                        beställningar.remove(i);
                        System.out.println("Beställning borttagen");
                        break;
                    }
                }
                break;
                // Listar alla bostäder
            case 3:
                for (int i = 0; i < beställningar.size(); i++) 
                {
                    System.out.println(beställningar.get(i));
                }
                break;
                // listar totalsumman
            case 4:

                for (int i = 0; i < beställningar.size() ; i++) 
                {
                    totalsumma += beställningar.get(i).getPris();
                }
                System.out.println(totalsumma);      
                 // nollställa om man vill göra om listning
                break;
                // stänger ned programmet.
            case 5:
                System.out.println("Stänger ner");
                System.exit(0);
                tb.close();
                break;
        }
    }


    


    }

    //Köparen får bestämma den bostad som passar bäst
    public static int byggnadsValet(int byggnadsVal, Scanner tb)
    {
        while (true) 
        {
           try 
           {
            
            System.out.println("Vilken typ av fastighet vill du ha? \n1.Villa \n2.Radhus \n3.Garage \n4.Lägenhet \n Skriv det nummer som den eftertraktade bostaden har!");
            byggnadsVal = tb.nextInt();
            tb.nextLine();

            if(byggnadsVal > 4 || byggnadsVal < 1)
            {
                System.out.println("Val får inte vara större än 4 men mindre än 1");
                tb.nextLine();
                continue;
            }

            else
            {
                
                switch (byggnadsVal)
                {
                    case 1:
                    System.out.println("valde villa \n...");
                    break;
                    case 2:
                    System.out.println("valde radhus \n...");
                    break;
                    case 3:
                    System.out.println("valde garage \n...");
                    break;
                    case 4:
                    System.out.println("valde lägenhet \n...");
                    break;
                }
                return byggnadsVal;
            } 

           } 
           catch (Exception e) 
           {
             System.out.println("Val får inte vara bokstäver eller mellanslag");
             tb.nextLine();
             continue;
           }
        }
    }
    
    // inskickade int-värden checkas med deras gränser
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
