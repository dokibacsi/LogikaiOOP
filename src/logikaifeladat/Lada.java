
package logikaifeladat;

public class Lada {
    private String allitas, anyag;
    private int index;
    private boolean kincs;

    public Lada(String allitas, String anyag, boolean kincs,int index) {
        this.allitas = allitas;
        this.index=index;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    @Override
    public String toString() {
        return "A(z) "+index +". egy " + anyag + " 📦(láda) állítísa: "+ allitas ;
    }

    
    
}
