
package logikaifeladat;

import java.util.Arrays;
public class Allitasok {
    private String[] allitasok;

    public Allitasok(String[] allitasok) {
        this.allitasok = allitasok;
    }

    public String[] getAllitasok() {
        return allitasok;
    }

    public void setAllitasok(String[] allitasok) {
        this.allitasok = allitasok;
    }

    @Override
    public String toString() {
        return "Logikaifeladat{" + "allitasok=" + allitasok + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Arrays.deepHashCode(this.allitasok);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Allitasok other = (Allitasok) obj;
        return Arrays.deepEquals(this.allitasok, other.allitasok);
    }
    
    
    
}
