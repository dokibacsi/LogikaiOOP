
package logikaifeladat;

import java.util.Arrays;
public class Lada {
    private String allitas, anyag;
    private boolean kincs;

    public Lada() {
        this("állítás");
    }

    public Lada(String allitas) {
        this(allitas, "fa");
    }
    
    public Lada(String allitas, String anyag) {
        this(allitas, anyag, false);
    }

    public Lada(String allitas, String anyag, boolean kincs) {
        this.allitas = allitas;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    public String getAllitas() {
        return allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    @Override
    public String toString() {
        return "Lada{" + "allitas=" + allitas + ", anyag=" + anyag + ", kincs=" + kincs + '}';
    }
    
    
    
    
}
