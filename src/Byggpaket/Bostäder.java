package Byggpaket;

public abstract class Bostäder 
{
    protected int rum;
    protected int bostadsyta;
    protected int toalettAntal;
    protected int kök;
    protected int tomtyta;
    protected int pris;
    protected String namn;  //alltså adressnamn

    public Bostäder(int rum, int bostadsyta, int toalettAntal, int kök, int tomtyta, int pris, String namn)
    {

        // kontrollerar alla variabler utifrån de krav som finns för alla bostäder
        if(rum > 7 || rum < 4)
        {
            throw new IllegalArgumentException("mellan 4 och 7 rum!");
        }
        
        if(bostadsyta > 230 || bostadsyta < 230)
        {
            throw new IllegalArgumentException("bostads yta måste vara imellan 170 och 230!");
        }

        if (toalettAntal > 2 || toalettAntal < 1)
        {
            throw new IllegalArgumentException("toalettantal måste vara mellan 1 och 2");
        }

        if (kök != 1)
        {
            throw new IllegalArgumentException("Finns bara ett kök!");
        }

        if(tomtyta > 1000 || tomtyta < 400)
        {
            throw new IllegalArgumentException("Tomtyta måste vara melllan 400 och 1000 kvm!");
        }

        if(namn == null || namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("Måste ha ett adressnamn");
        }

        this.rum = rum;
        this.bostadsyta = bostadsyta;
        this.toalettAntal = toalettAntal;
        this.kök = kök;
        this.tomtyta = tomtyta;
        this.pris = pris;
        this.namn = namn;
    }
    
    public void setBostadsyta(int bostadsyta) {
       
    }
    public void setKök(int kök) {
       
    }
    public void setNamn(String namn) {
       
    }
    public void setPris(int pris) {
      
    }
    public void setRum(int rum) {
     
    }
    public void setToalettAntal(int toalettAntal) {
       
    }
    public void setTomtyta(int tomtyta) {
      
    }

}
