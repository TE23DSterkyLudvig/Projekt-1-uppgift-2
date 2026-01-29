package Byggpaket;

//Barnklass av Bostäder
public class Villa extends Bostäder {
    
    private Boolean bilplats;


    

    public Villa(int id, int rum, int bostadsyta, int toalettAntal, int kök,int pris ,int tomtyta , String namn, Boolean bilplats)
    {
        super( id, rum, bostadsyta, toalettAntal, kök, pris,  tomtyta, namn);

         this.bilplats = true;
    }

    public void setBilplats(Boolean bilplats)
    {
        if(bilplats != true || bilplats != false)
        {
            throw new IllegalArgumentException("Du har inte valt satn eller falskt om man har bilplats.");
        }
        else if(bilplats == true)
        {
            this.bilplats = true;
        }
         else if(bilplats == false)
        {
            this.bilplats = false;
        }
    }

    


    public Boolean getBilplats() {
        return this.bilplats;
    }

    @Override
    public String toString()
    {
        return "Villa: \n1. id " + this.id +"\n2. rum " + this.rum + "\n3.bostadsyta " + this.bostadsyta + "\n4. toalettantal " + this.toalettAntal + "\n5. kök " + this.kök + "\n6. pris " + this.pris + "\n7. tomtyta " + this.tomtyta + "\n8. adressnamn " + this.namn + "\n9. bilplats " + this.bilplats;
    }
    

}
