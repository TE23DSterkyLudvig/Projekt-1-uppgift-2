package Byggpaket;

import java.util.Scanner;

public class Lägenhet {
    private int lägenhetsYta;
    private int möbler;
    private int balkong;
    private int köksyta;
    private int sängar;
    private int pris;
    private int rum;
    Scanner tb = new Scanner(System.in);
    

    public Lägenhet(int lägenhetsyta, int möbler, int balkong, int köksyta, int sängar)
    {
        
        this.lägenhetsYta = gränsCheck(lägenhetsYta, 200, 80, tb); 
        this.möbler = gränsCheck(möbler, 12, 4, tb);
        this.balkong = gränsCheck(balkong, 2, 1, tb);
        this.köksyta = gränsCheck(köksyta, 40, 20, tb);
        this.sängar = gränsCheck(sängar, 8, 2, tb);
        this.pris = gränsCheck(pris, 450000, 2000000, tb);
        this.rum = gränsCheck(rum, 5, 1, tb);
    }

    public void setBalkong(int balkong) {
        balkong = gränsCheck(balkong, 2, 1,tb);
        this.balkong = balkong;
    }
    public void setKöksyta(int köksyta) {
        köksyta = gränsCheck(köksyta, 40, 20, tb);
        this.köksyta = köksyta;
    }
    public void setLägenhetsYta(int lägenhetsYta) {
        lägenhetsYta = gränsCheck(lägenhetsYta, 200, 80 , tb);
        this.lägenhetsYta = lägenhetsYta;
    }
    public void setMöbler(int möbler) {
        möbler = gränsCheck(möbler, 12, 4, tb);
        this.möbler = möbler;
    }
    public void setPris(int pris) {
        pris = gränsCheck(pris, 450000, 2000000, tb);
        this.pris = pris;
    }
    public void setSängar(int sängar) {
        sängar = gränsCheck(sängar, 8, 2, tb);
        this.sängar = sängar;
    }

    public int getBalkong() {
        return this.balkong;
    }
    public int getKöksyta() {
        return this.köksyta;
    }
    public int getLägenhetsYta() {
        return this.lägenhetsYta;
    }
    public int getMöbler() {
        return this.möbler;
    }
    public int getPris() {
        return this.pris;
    }
    public int getRum() {
        return this.rum;
    }
    public int getSängar() {
        return this.sängar;
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
