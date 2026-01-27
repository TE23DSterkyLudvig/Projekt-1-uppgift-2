import java.util.Scanner;
import java.util.ArrayList;
import Byggpaket.*;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner tb = new Scanner(System.in); // tar in värden.
        
    Bostäder[] beställningar = new Bostäder[50]; // lagrar beställningar
    int byggnadAntal = 0;
    int menyval;
    int byggnadsVal = 0;
    

    

    //skriver ut menyen och man får göra ett val utifrån att lägga beställ, ta bort beställ , list beställ och lista vinst.
    while(true)
    {
        System.out.println("Välkommen till Luddes Fastighets och bostadsbyrå!");

        while(true){
            try 
            {
               System.out.println
               (
                "1. Lägg till beställning \n2. Ta bort beställning \n3. Lista beställningar \n4. Lista vinst \n5. avsluta program."
               ); 

               menyval = tb.nextInt();
               tb.nextLine();

               menyval = gränsCheck(menyval, 5,1);

               break;
            } 

            catch (Exception e) 
            {
                System.out.println("inte bokstäver eller mellanslag");
                tb.nextLine();
                continue;
            }
        }

        
        switch(menyval)
        {
            case 1:
            byggnadsVal = byggnadsVal(byggnadsVal, tb);


            case 2:


            case 3:


            case 4:
            

            case 5:
        }
    }





    }

    //Köparen får bestämma den bostad som passar bäst
    public static int byggnadsVal(int byggnadsVal, Scanner tb)
    {
        while (true) 
        {
           try 
           {
            Thread.sleep(1000);
            System.out.println("Vilken typ av fastighet vill du ha? \n1.Villa \n2.Radhus \n3.Garage \n4.Lägenhet \n Skriv det nummer som den eftertraktade bostaden har!");
            byggnadsVal = tb.nextInt();

            if(byggnadsVal > 4 || byggnadsVal < 1)
            {
                System.out.println("Val får inte vara större än 4 men mindre än 1");
                continue;
            }

            else
            {
                tb.nextLine();
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
    
    public static int gränsCheck(int checkvärde, int undre, int övre )
    {
      while(true)
        { 
            if(checkvärde > övre || checkvärde < undre)
            {
               System.out.println(  " Värde får inte vara större än" + övre + " och inte mindre än" + undre);
               continue;
            }
            else
            {
                break;
            }
        }
        
        return checkvärde;
    }

}
