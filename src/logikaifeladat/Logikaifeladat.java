package logikaifeladat;

import logikaifeladat.View.LadaViewGui;

public class Logikaifeladat {

    public static void main(String[] args) {

//        new LadaKezeles().ladaAdatokMegjelenitese();
        LadaKezeles lista=new LadaKezeles();
        logikaifeladat.View.LadaViewGui A= new LadaViewGui(lista.LadaKezeles());
    }
}
