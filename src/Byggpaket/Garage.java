package Byggpaket;

public class Garage extends Bostäder  {

    private int bilplatsYta;
    private int förrådsyta;

    public Garage(int bilplatsYta, int förrådsyta, int pris, String namn)
    {
        if (bilplatsYta > 30 || bilplatsYta < 30)
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
}
