import java.util.Scanner;
import java.util.ArrayList;
import Byggpaket.*;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner tb = new Scanner(System.in); // tar in värden.
        
    Bostäder[] beställningar = new Bostäder[50];
    int byggnadAntal = 0;
    int menyval;

    while(true)
    {
        System.out.println("Välkommen till Luddes Fastighets och bostadsbyrå!");

        while(true){
            try 
            {
               System.out.println
               (
                "1. Lägg till beställning \n2. Ta bort beställning \n3. Lista beställningar \n4. Lista vinst"
               ); 

               menyval = tb.nextInt();

               if(menyval > 4 || menyval < 1)
               {
                System.out.println("Menyvalet får inte vara mindre än 1 eller större än 4");
                tb.nextLine();
                continue;
               }

               else
               {
                tb.nextLine();
                break;
               }
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

            case 2:

            case 3:

            case 4:
            
        }
    }





    }






}
