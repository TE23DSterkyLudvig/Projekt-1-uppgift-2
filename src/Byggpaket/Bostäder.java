package Byggpaket;


// Abstract klass som fastiheter utgår från
public abstract class Bostäder 
{
    protected int rum;
    protected int bostadsyta;
    protected int toalettAntal;
    protected int kök;
    protected int pris;
    protected int tomtyta;
    protected String namn;  //alltså adressnamn
    protected int id; //beställningsid

    public Bostäder(int id, int rum, int bostadsyta, int toalettAntal, int kök, int pris, int tomtyta, String namn)
    {

        // kontrollerar alla variabler utifrån de krav som finns för alla bostäder
       
        this.rum = rum;
        this.bostadsyta = bostadsyta;
        this.toalettAntal = toalettAntal;
        this.kök = kök;
        this.tomtyta = tomtyta;
        this.namn = namn;
        this.id = id;
    }
    
    public void setBostadsyta(int bostadsyta) {
       if(bostadsyta > 230 || bostadsyta < 170)
        {
            throw new IllegalArgumentException("bostads yta måste vara imellan 170 och 230!");
        }
        this.bostadsyta = bostadsyta;
    }
    public void setKök(int kök) {
        if (kök != 1)
        {
            throw new IllegalArgumentException("Finns bara ett kök!");
        }
       this.kök = kök;
    }
    public void setNamn(String namn) {
       
        if(namn == null || namn.trim().isEmpty())
        {
            throw new IllegalArgumentException("Måste ha ett adressnamn");
        }
        this.namn = namn;
    }

    public void setRum(int rum) {
        if(rum > 7 || rum < 4)
        {
            throw new IllegalArgumentException("mellan 4 och 7 rum!");
        }
        this.rum = rum;
    }
    public void setToalettAntal(int toalettAntal) {

        if (toalettAntal > 2 || toalettAntal < 1)
        {
            throw new IllegalArgumentException("toalettantal måste vara mellan 1 och 2");
        }
       this.toalettAntal = toalettAntal;
    }
    public void setTomtyta(int tomtyta) {
      
        if(tomtyta > 1000 || tomtyta < 400)
        {
            throw new IllegalArgumentException("Tomtyta måste vara melllan 400 och 1000 kvm!");
        }

        this.tomtyta = tomtyta;
    }

        public void setPris(int pris) 
    {
        if(pris > 15000000 || pris < 500000)
        {
            throw new IllegalArgumentException("Pris för villa för inte överstiga 15 000 000 men inte understiga 500 000!");
        }

        this.pris = pris;
    }

    public void setId(int id)
    {
        if(id > 999999999 || id < 0)
        {
            throw new IllegalArgumentException("id måste vara mellan 999999999 och 0 ");
        }

        this.id = id;
    }


    public int getId()
    {
        return this.id;
    }

    public int getBostadsyta() {
        return this.bostadsyta;
    }
    public int getKök() {
        return this.kök;
    }
    public String getNamn() {
        return this.namn;
    }
    public int getRum() {
        return this.rum;
    }
    public int getToalettAntal() {
        return this.toalettAntal;
    }
    public int getTomtyta() {
        return this.tomtyta;
    }
    public int getPris() {
        return this.pris;
    }

    @Override
    public String toString()
    {
        return"";
    }
}
