package Byggpaket;

public class Garage extends Bostäder implements Garagefunktioner  {

    private int bilplatsYta;
    private int förrådsyta;

    public Garage(int bilplatsYta, int förrådsyta, int pris, String namn)
    {
        if (bilplatsYta < 15 || bilplatsYta > 30)
        {
            throw new IllegalArgumentException("Inte större än 30 kvm men inte mindre än 15 kvm");
        }

        if(förrådsyta > 20 || förrådsyta < 5 )
        {
            throw new IllegalArgumentException("inte större än 20 kvm och inte mindre än 5 kvm");
        }

        super(0,0,0,0,pris,0,namn);

        this.förrådsyta = förrådsyta;
        this.bilplatsYta = bilplatsYta;
    }

    public void setBilplatsYta( int bilplatsYta)
    {
        if (bilplatsYta > 30 || bilplatsYta < 15)
        {
            throw new IllegalArgumentException("Inte större än 30 kvm men inte mindre än 15 kvm");
        } 
        this.bilplatsYta = bilplatsYta;
    }

    public void setFörrådsyta(int förrådsyta)
    {
        
        if(förrådsyta > 20 || förrådsyta < 5 )
        {
            throw new IllegalArgumentException("inte större än 20 kvm och inte mindre än 5 kvm");
        }

        this.förrådsyta = förrådsyta;
    }

    
    public int getBilplatsYta() 
    {
        return this.bilplatsYta;
    }

    public int setFörrådsyta()
    {
        return this.förrådsyta;
    }

    @Override
    public void tändaLampor()
    {
        System.out.println("Lamporna tänds!");
    }

    @Override
    public void öppnaGaragedörr()
    {
        System.out.println("Garagedörr öppnas!");
    }
}
