/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnjoySport;

/**
 *
 * @author acer
 */
public class EnjoySport implements Comparable<EnjoySport> {

    private String sky;
    private String airTemp;
    private String humidity;
    private String wind;
    private String water;
    private String forecast;
    private String enjoySport;

    public EnjoySport() {

    }

    public EnjoySport(String sky, String airTemp, String humidity, String wind, String water, String forecast, String enjoySport) {
        this.sky = sky;
        this.airTemp = airTemp;
        this.humidity = humidity;
        this.wind = wind;
        this.water = water;
        this.forecast = forecast;
        this.enjoySport = enjoySport;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(String airTemp) {
        this.airTemp = airTemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getEnjoySport() {
        return enjoySport;
    }

    public void setEnjoySport(String enjoySport) {
        this.enjoySport = enjoySport;
    }

    @Override
    public String toString() {
        return "EnjoySport{" + "sky=" + sky + ", airTemp=" + airTemp + ", humidity=" + humidity + ", wind=" + wind + ", water=" + water + ", forecast=" + forecast + ", enjoySport=" + enjoySport + '}';
    }

    @Override
    public int compareTo(EnjoySport enjoySport) {
        if ((this.getSky().equalsIgnoreCase(enjoySport.getSky()) || enjoySport.getSky().equalsIgnoreCase("?"))&&
                (this.getAirTemp().equalsIgnoreCase(enjoySport.getAirTemp()) || enjoySport.getAirTemp().equalsIgnoreCase("?")) &&
                (this.getHumidity().equalsIgnoreCase(enjoySport.getHumidity()) || enjoySport.getHumidity().equalsIgnoreCase("?")) &&
                (this.getWind().equalsIgnoreCase(enjoySport.getWind()) || enjoySport.getWind().equalsIgnoreCase("?")) &&
                (this.getWater().equalsIgnoreCase(enjoySport.getWater()) || enjoySport.getWater().equalsIgnoreCase("?")) &&
                (this.getForecast().equalsIgnoreCase(enjoySport.getForecast()) || enjoySport.getForecast().equalsIgnoreCase("?")))
            return 1;
        else
            return 0;
    }

}
