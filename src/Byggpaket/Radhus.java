package Byggpaket;
//Barnklass av Bostäder för radhus
public class Radhus extends Bostäder {
    
    // konstruktor för radhus
    public Radhus(int id, int rum, int bostadsyta, int toalettAntal, int kök, int pris, int tomt, String namn)
    {
        super(id ,rum, bostadsyta, toalettAntal, kök, pris, tomt, namn);
    }

    // SKriver ut alla värden för instansen.
    @Override
    public String toString()
    {
        return "Radhus: \n1. id " + this.id +"\n2. rum " + this.rum + " rum\n3.bostadsyta " + this.bostadsyta + " kvm\n4. toalettantal " + this.toalettAntal + " stycken\n5. kök " + this.kök + " kök\n6. pris " + this.pris + " kr\n7. tomtyta " + this.tomtyta + " kvm\n8. adressnamn " + this.namn ;
    }
}   
