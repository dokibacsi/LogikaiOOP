package logikaifeladat;

import java.util.Scanner;
import model.Lada;

public class LadaKezeles {
    private Lada lada1;
    private Lada lada2;
    private Lada lada3;

    public Lada[] LadaKezeles() {
        lada1 = new Lada("Én rejtem a kincset!", "Arany", false,1);
        lada2 = new Lada("Nem én rejtem!", "Ezüst", true,2);
        lada3 = new Lada("az arany hazudik!", "Bronz", false,3);
        Lada[] ladak={lada1,lada2,lada3};
        return ladak; 
    }

    public void ladaAdatokMegjelenitese() {
        System.out.println("előtted van 3 láda :");
        String crateEmoji = "\uD83D\uDCE6"; // Ez a láda emoji Unicode kódja
        System.out.println("1."+crateEmoji + " " + "2."+crateEmoji + " " + "3."+crateEmoji);
        for (Lada LadaKezele : LadaKezeles()) {
            System.out.println(LadaKezele);
        }
        beker(LadaKezeles());
    }

    private void beker(Lada[] lada) {
        System.out.println("Csak az egyik állítás igaz");
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik ládában van a kincs? (1-2-3): ");
        int szam = sc.nextInt()-1;
        
        if (lada[szam].isKincs()){
            System.out.println("A válasz jó");
        }else{
            System.out.println("A válasz nem jó");
       
    }
        
    }
    

    
}