package model;

import view.Konzolview;

public class LadaKezeles {
    private Lada[] ladak;
    private Konzolview view;

    public LadaKezeles(Konzolview view) {
        this.view = view;
        initializeLadak();
    }

    private void initializeLadak() {
        // Initialize your Lada objects here
        ladak = new Lada[3];
        ladak[0] = new Lada("Én rejtem a kincset!", "Arany", false, 1);
        ladak[1] = new Lada("Nem én rejtem!", "Ezüst", true, 2);
        ladak[2] = new Lada("az arany hazudik!", "Bronz", false, 3);
    }

    public void startGame() {
        view.displayChests(ladak);
        int userChoice = view.getUserChoice();
        view.displayResult(ladak[userChoice].isKincs());
    }
}
