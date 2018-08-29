package DeteksiHipertensi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Hipertensi> data = new ArrayList<>();
        Hipertensi ya = new Hipertensi();
        Hipertensi tidak = new Hipertensi();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Umur : ");
        String umur = input.nextLine();

        System.out.print("Kegemukan : ");
        String kegemukan = input.nextLine();
                
        System.out.println("Data Testing : "+umur+"|"+kegemukan);

        data.add(new Hipertensi("muda", "gemuk", "tidak"));
        data.add(new Hipertensi("muda", "sangat gemuk", "tidak"));
        data.add(new Hipertensi("paruh baya", "gemuk", "tidak"));
        data.add(new Hipertensi("paruh baya", "terlalu gemuk", "ya"));
        data.add(new Hipertensi("tua", "terlalu gemuk", "ya"));
        
        for (Hipertensi temp : data) {
            if(temp.getHipertensi().equalsIgnoreCase("ya")){
                if(ya.getHipertensi()==null){
                    ya = temp;
                }
                else{
                    if(!ya.getUmur().equalsIgnoreCase(temp.getUmur()))
                        ya.setUmur("?");
                    if(!ya.getKegemukan().equalsIgnoreCase(temp.getKegemukan()))
                        ya.setKegemukan("?");
                }
            }
            else{
                if(tidak.getHipertensi()==null){
                    tidak = temp;
                }
                else{
                    if(!tidak.getUmur().equalsIgnoreCase(temp.getUmur()))
                        tidak.setUmur("?");
                    if(!tidak.getKegemukan().equalsIgnoreCase(temp.getKegemukan()))
                        tidak.setKegemukan("?");
                }
            }
        }
        Hipertensi dataInput = new Hipertensi();
        
        dataInput.setUmur(umur.toString());
        dataInput.setKegemukan(kegemukan.toString());
        
        if (dataInput.compareTo(ya)==1){
            dataInput.setHipertensi(ya.getHipertensi());
            System.out.println("Hipertensi ? "+dataInput.getHipertensi());
        }
        else if(dataInput.compareTo(tidak)==1){
            dataInput.setHipertensi(tidak.getHipertensi());
            System.out.println("Hipertensi ? "+dataInput.getHipertensi());
        }
        else {
            dataInput.setHipertensi("?");
            System.out.println("Data Bias, sehingga tidak dapat menarik kesimpulan");
        }
    }
}
