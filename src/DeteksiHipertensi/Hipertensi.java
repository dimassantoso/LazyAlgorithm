package DeteksiHipertensi;

public class Hipertensi implements Comparable<Hipertensi> {
    private String umur;
    private String kegemukan;
    private String hipertensi;
    
    public Hipertensi(){
        
    }

    public Hipertensi(String umur, String kegemukan, String hipertensi) {
        this.umur = umur;
        this.kegemukan = kegemukan;
        this.hipertensi = hipertensi;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getKegemukan() {
        return kegemukan;
    }

    public void setKegemukan(String kegemukan) {
        this.kegemukan = kegemukan;
    }

    public String getHipertensi() {
        return hipertensi;
    }

    public void setHipertensi(String hipertensi) {
        this.hipertensi = hipertensi;
    }

    @Override
    public int compareTo(Hipertensi hipertensi) {
        if ((this.getUmur().equalsIgnoreCase(hipertensi.getUmur()) || hipertensi.getUmur().equalsIgnoreCase("?"))&&
                (this.getKegemukan().equalsIgnoreCase(hipertensi.getKegemukan()) || hipertensi.getKegemukan().equalsIgnoreCase("?")))
            return 1;
        else
            return 0;          
    }
}
