package controller;

import model.LadaKezeles;
import view.Konzolview;

public class Controller {

    public static void main(String[] args) {
        Konzolview view = new Konzolview();
        LadaKezeles ladaKezeles = new LadaKezeles(view);
        ladaKezeles.startGame();
    }
}
