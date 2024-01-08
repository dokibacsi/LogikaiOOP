package logikaifeladat;

import java.util.Scanner;

public class LadaKez {
    private Lada ladaEgy;
    private Lada ladaKetto;
    private Lada ladaHarom;

    public LadaKez() {
        this.ladaEgy = new Lada("1. állítás", "fa", false);
        this.ladaKetto = new Lada("2. állítás", "kő", false);
        this.ladaHarom = new Lada("3. állítás", "arany", true);
    }
    
    private void ladaDatas(){
        System.out.print(ladaEgy);
        System.out.print(ladaKetto);
        System.out.print(ladaHarom);
        beker();
    }
    
    private void beker(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Adj meg egy számot (1-2-3): ");
        int bekertSzam = scn.nextInt();
        
        if(bekertSzam == 1){
            System.out.println("A válasz hibás!!");
        }
        if(bekertSzam == 2){
            System.out.println("A válasz hibás!!");
        }
        if(bekertSzam == 3){
            System.out.println("A válasz jóóóó!!");
        }
    }
    
    
    
    
}
