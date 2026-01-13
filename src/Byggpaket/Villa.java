package Byggpaket;

public class Villa extends Bostäder {
    
    private Boolean bilplats;

    public Villa( int rum, int bostadsyta, int toalettAntal, int kök, int tomtyta, int pris, String namn, Boolean bilplats)
    {
        super(rum, bostadsyta, toalettAntal, kök, tomtyta, pris, namn);
        this.bilplats = true;
    }

    

}
