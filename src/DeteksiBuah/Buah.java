package DeteksiBuah;

public class Buah implements Comparable<Buah>{

    private String panjang;
    private String lebar;
    private String namaBuah;

    public Buah() {

    }

    public Buah(String panjang, String lebar, String namaBuah) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.namaBuah = namaBuah;
    }

    public String getPanjang() {
        return panjang;
    }

    public void setPanjang(String panjang) {
        this.panjang = panjang;
    }

    public String getLebar() {
        return lebar;
    }

    public void setLebar(String lebar) {
        this.lebar = lebar;
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    @Override
    public String toString() {
        return "Buah{" + "panjang=" + panjang + ", lebar=" + lebar + ", namaBuah=" + namaBuah + '}';
    }

    @Override
    public int compareTo(Buah buah) {
        if ((this.getPanjang().equalsIgnoreCase(buah.getPanjang()) || buah.getPanjang().equalsIgnoreCase("?"))&&
                (this.getLebar().equalsIgnoreCase(buah.getLebar()) || buah.getLebar().equalsIgnoreCase("?")))
            return 1;
        else
            return 0;
    }
    
}
