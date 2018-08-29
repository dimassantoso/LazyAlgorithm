package EnjoySport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        List<EnjoySport> data = new ArrayList<>();
        EnjoySport ya = new EnjoySport();
        EnjoySport tidak = new EnjoySport();
        
        boolean valid = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Sky : ");
        String sky = input.nextLine();

        System.out.print("Air Temperature : ");
        String airTemp = input.nextLine();
        
        System.out.print("Humidity : ");
        String humidity = input.nextLine();

        System.out.print("Wind : ");
        String wind = input.nextLine();
        
        System.out.print("Water : ");
        String water = input.nextLine();

        System.out.print("Forecast : ");
        String forecast = input.nextLine();
        
        System.out.println("Data Testing : "+sky+"|"+airTemp+"|"+humidity+"|"+wind+"|"+water+"|"+forecast);

        data.add(new EnjoySport("sunny", "warm", "normal", "strong", "warm", "same", "ya"));
        data.add(new EnjoySport("sunny", "warm", "high", "strong", "warm", "same", "ya"));
        data.add(new EnjoySport("rainy", "cold", "high", "strong", "warm", "change", "tidak"));
        data.add(new EnjoySport("sunny", "warm", "high", "strong", "cool", "change", "ya"));
        
        for (EnjoySport temp : data) {
            if(temp.getEnjoySport().equalsIgnoreCase("ya")){
                if(ya.getEnjoySport()==null){
                    ya = temp;
                }
                else{
                    if(!ya.getSky().equalsIgnoreCase(temp.getSky()))
                        ya.setSky("?");
                    if(!ya.getAirTemp().equalsIgnoreCase(temp.getAirTemp()))
                        ya.setAirTemp("?");
                    if(!ya.getHumidity().equalsIgnoreCase(temp.getHumidity()))
                        ya.setHumidity("?");
                    if(!ya.getWind().equalsIgnoreCase(temp.getWind()))
                        ya.setWind("?");
                    if(!ya.getWater().equalsIgnoreCase(temp.getWater()))
                        ya.setWater("?");
                    if(!ya.getForecast().equalsIgnoreCase(temp.getForecast()))
                        ya.setForecast("?");
                }
            }
            else{
                if(tidak.getEnjoySport()==null){
                    tidak = temp;
                }
                else{
                   if(!tidak.getSky().equalsIgnoreCase(temp.getSky()))
                        ya.setSky("?");
                    if(!tidak.getAirTemp().equalsIgnoreCase(temp.getAirTemp()))
                        ya.setAirTemp("?");
                    if(!tidak.getHumidity().equalsIgnoreCase(temp.getHumidity()))
                        ya.setHumidity("?");
                    if(!tidak.getWind().equalsIgnoreCase(temp.getWind()))
                        ya.setWind("?");
                    if(!tidak.getWater().equalsIgnoreCase(temp.getWater()))
                        ya.setWater("?");
                    if(!tidak.getForecast().equalsIgnoreCase(temp.getForecast()))
                        ya.setForecast("?");
                }
            }
        }
        EnjoySport dataInput = new EnjoySport();
        
        dataInput.setSky(sky.toString());
        dataInput.setAirTemp(airTemp.toString());
        dataInput.setHumidity(humidity.toString());
        dataInput.setWind(wind.toString());
        dataInput.setWater(water.toString());
        dataInput.setForecast(forecast.toString());
        
        if (dataInput.compareTo(ya)==1){
            dataInput.setEnjoySport(ya.getEnjoySport());
            System.out.println("Enjoy Sport ? "+dataInput.getEnjoySport());
        }
        else if(dataInput.compareTo(tidak)==1){
            dataInput.setEnjoySport(tidak.getEnjoySport());
            System.out.println("Enjoy Sport ? "+dataInput.getEnjoySport());
        }
        else {
            dataInput.setEnjoySport("?");
            System.out.println("Data Bias, sehingga tidak dapat menarik kesimpulan");
        }
    }
}
