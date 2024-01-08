
package logikaifeladat;

public class Allitas {
    private int allitas;

    public Allitas(int allitas) {
        this.allitas = allitas;
    }

    public int getAllitas() {
        return allitas;
    }

    public void setAllitas(int allitas) {
        this.allitas = allitas;
    }

    @Override
    public String toString() {
        return "A(z) " + allitas +" állítás";
    }
    
}
