package Byggpaket;
//Barnklass av Bostäder
public class Radhus extends Bostäder {
    
    public Radhus(int id, int rum, int bostadsyta, int toalettAntal, int kök, int pris, int tomt, String namn)
    {
        super(id ,rum, bostadsyta, toalettAntal, kök, pris, tomt, namn);
    }

    @Override
    public String toString()
    {
        return "Radhus: \n1. id " + this.id +"\n2. rum " + this.rum + "\n3.bostadsyta " + this.bostadsyta + "\n4. toalettantal " + this.toalettAntal + "\n5. kök " + this.kök + "\n6. pris " + this.pris + "\n7. tomtyta " + this.tomtyta + "\n8. adressnamn " + this.namn ;
    }
}   
