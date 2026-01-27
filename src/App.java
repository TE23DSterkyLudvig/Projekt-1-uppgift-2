import java.util.Scanner;
import java.util.ArrayList;
import Byggpaket.*;

public class App extends Mainfunktioner {
    public static void main(String[] args) throws Exception {
    
    Scanner tb = new Scanner(System.in); // tar in värden.
        
    Bostäder[] beställningar = new Bostäder[50]; // lagrar beställningar
    Bostäder bostad ;
    int byggnadAntal = 0;
    int menyval = 0;
    int byggnadsVal = 0;

    int tomtyta;
    int rum;
    int bostadsyta;
    int toalettAntal;
    int kök;
    int pris;
    String namn;
    Boolean bilplats;
    int bilplatsYta;
    int förrådsyta;
    int lägenhetsYta;
    int möbler;
    int balkong;
    int köksyta;
    int sängar;
    
    

    

    //skriver ut menyen och man får göra ett val utifrån att lägga beställ, ta bort beställ , list beställ och lista vinst.
    while(true)
    {
        System.out.println("Välkommen till Luddes Fastighets och bostadsbyrå!");

 //       while(true){
 //           try 
  //          {
               System.out.println
               (
                "1. Lägg till beställning \n2. Ta bort beställning \n3. Lista beställningar \n4. Lista vinst \n5. avsluta program \n Ange val i."
               ); 

               menyval = tb.nextInt();
               
               menyval = gränsCheck(menyval, 5,1,tb);

               
     //       } 

          //  catch (Exception e) 
          //  {

           // }
            //}

        
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
            
            System.out.println("Vilken typ av fastighet vill du ha? \n1.Villa \n2.Radhus \n3.Garage \n4.Lägenhet \n Skriv det nummer som den eftertraktade bostaden har!");
            byggnadsVal = tb.nextInt();
            tb.nextLine();

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
