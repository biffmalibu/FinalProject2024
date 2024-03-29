/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bradf
 */
public class CityHourly {
    private int dt;
    private double curTemp;
    private double feelsLike;
    private int pressure;
    private int humidity;
    private double dewPoint;
    private double uvi;
    private int clouds;
    private int visibility;
    private double windSpeed;
    private int windDegrees;
    private double windGust;

    private int weatherId;
    private String weatherMain;
    private String weatherDesc;

    // Constructor
    public CityHourly(int dt, double curTemp, double feelsLike, int pressure, int humidity, double dewPoint, double uvi,
                      int clouds, int visibility, double windSpeed, int windDegrees, double windGust,
                      int weatherId, String weatherMain, String weatherDesc) {
        this.dt = dt;
        this.curTemp = curTemp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDegrees = windDegrees;
        this.windGust = windGust;
        this.weatherId = weatherId;
        this.weatherMain = weatherMain;
        this.weatherDesc = weatherDesc;
    }
    @Override
    public String toString() {
        return "CityHourly{" +
                "dt=" + dt +
                ", curTemp=" + curTemp +
                ", feelsLike=" + feelsLike +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dewPoint=" + dewPoint +
                ", uvi=" + uvi +
                ", clouds=" + clouds +
                ", visibility=" + visibility +
                ", windSpeed=" + windSpeed +
                ", windDegrees=" + windDegrees +
                ", windGust=" + windGust +
                ", weatherId=" + weatherId +
                ", weatherMain='" + weatherMain + '\'' +
                ", weatherDesc='" + weatherDesc + '\'' +
                '}';
    }
    // Getters
    public int getDt() { return dt; }

    public double getCurTemp() { return curTemp; }

    public double getFeelsLike() { return feelsLike; }

    public int getPressure() { return pressure; }

    public int getHumidity() { return humidity; }

    public double getDewPoint() { return dewPoint; }

    public double getUvi() { return uvi; }

    public int getClouds() { return clouds; }

    public int getVisibility() { return visibility; }

    public double getWindSpeed() { return windSpeed; }

    public int getWindDegrees() { return windDegrees; }

    public double getWindGust() { return windGust; }

    public int getWeatherId() { return weatherId; }

    public String getWeatherMain() { return weatherMain; }

    public String getWeatherDesc() { return weatherDesc; }
}

