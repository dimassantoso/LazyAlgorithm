package DeteksiBuah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Buah> data = new ArrayList<>();
        Buah apel = new Buah();
        Buah pisang = new Buah();
        
        boolean valid = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Panjang : ");
        String panjang = input.nextLine();

        System.out.print("Lebar : ");
        String lebar = input.nextLine();
        
        if (panjang.isEmpty()){
            System.out.println("Data harus diinputkan");
            valid = false;
        }
        
        if (lebar.isEmpty()){
            System.out.println("Data harus diinputkan");
            valid = false;
        }
        
        System.out.println("Data Testing : "+panjang+"|"+lebar);

        data.add(new Buah("panjang", "sedang", "pisang"));
        data.add(new Buah("panjang", "pendek", "pisang"));
        data.add(new Buah("pendek", "pendek", "apel"));
        
        for (Buah temp : data) {
            if(temp.getNamaBuah().equalsIgnoreCase("pisang")){
                if(pisang.getNamaBuah()==null){
                    pisang = temp;
                }
                else{
                    if(!pisang.getPanjang().equalsIgnoreCase(temp.getPanjang()))
                        pisang.setPanjang("?");
                    if(!pisang.getLebar().equalsIgnoreCase(temp.getLebar()))
                        pisang.setLebar("?");
                }
            }
            else{
                if(apel.getNamaBuah()==null){
                    apel = temp;
                }
                else{
                    if(!apel.getPanjang().equalsIgnoreCase(temp.getPanjang()))
                        apel.setPanjang("?");
                    if(!apel.getLebar().equalsIgnoreCase(temp.getLebar()))
                        apel.setLebar("?");
                }
            }
        }
        Buah dataInput = new Buah();
        
        dataInput.setPanjang(panjang.toString());
        dataInput.setLebar(lebar.toString());
        
        if (dataInput.compareTo(pisang)==1){
            dataInput.setNamaBuah(pisang.getNamaBuah());
            System.out.println("Buah ?"+dataInput.getNamaBuah());
        }
        else if(dataInput.compareTo(apel)==1){
            dataInput.setNamaBuah(apel.getNamaBuah());
            System.out.println("Buah ?"+dataInput.getNamaBuah());
        }
        else {
            dataInput.setNamaBuah("?");
            System.out.println("Data Bias, sehingga tidak dapat menarik kesimpulan");
        }
    }
}
