package logikaifeladat;

import java.util.Scanner;

public class LadaKezeles {
    private Lada lada1;
    private Lada lada2;
    private Lada lada3;

    public LadaKezeles() {
        lada1 = new Lada("Meglepetés láda", "fa", false);
        lada2 = new Lada("Meglepetés láda", "kő", false);
        lada3 = new Lada("Meglepike láda", "arany", true);
    }

    public void ladaAdatokMegjelenitese() {
        System.out.println(lada1);
        System.out.println(lada2);
        System.out.println(lada3);
        beker();
    }

    private void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy számot 1-től 3-ig: ");
        int szam = sc.nextInt();
        
        if (szam == 1){
            System.out.println("A válasz jó");
        }else if(szam == 2){
            System.out.println("A válasz nem jó");
        }else if(szam == 3){
            System.out.println("A válasz nem jó");
        }
    }

    
}