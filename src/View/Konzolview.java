package view;

import model.Lada;
import java.util.Scanner;

public class Konzolview {

    private Scanner scanner;

    public Konzolview() {
        this.scanner = new Scanner(System.in);
    }

    public void displayChests(Lada[] ladak) {
        System.out.println("Előtted van 3 láda:");
        String crateEmoji = "\uD83D\uDCE6"; // Láda emoji Unicode kódja
        System.out.println("1." + crateEmoji + " " + "2." + crateEmoji + " " + "3." + crateEmoji);
        for (Lada lada : ladak) {
            System.out.println(lada);
        }
    }

    public int getUserChoice() {
        System.out.println("Csak az egyik állítás igaz. Melyik ládában van a kincs? (1-2-3): ");
        return scanner.nextInt() - 1; // Adjusting for array indexing
    }

    public void displayResult(boolean correct) {
        if (correct) {
            System.out.println("A válasz jó.");
        } else {
            System.out.println("A válasz nem jó.");
        }
    }
}
