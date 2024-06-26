/*********************************************************************************************************************************
* File: CityDaily.java                                                                                                           *
* Author: Bradford Torpey                                                                                                        *
* Purpose: This file is used to store the daily weather data of a city and return the data when needed.                          *
**********************************************************************************************************************************/

package c.finalweatherproject;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bradf
 */
public class CityDaily { // Daily weather data fields
    private int dt;
    private int sunrise;
    private int sunset;
    private int moonrise;
    private int moonset;
    private double moonphase;
    private String summary;
    private double temp;
    private double tempMin;
    private double tempMax;
    private double tempNight;
    private double tempEve;
    private double tempMorn;
    private double feelsLikeDay;
    private double feelsLikeNight;
    private double feelsLikeEve;
    private double feelsLikeMorn;
    private int pressure;
    private int humidity;
    private double dewPoint;
    private double windSpeed;
    private int windDeg;
    private double windGust;
    private String weatherMain;
    private String weatherDesc;
    private int clouds;
    private double uvi;
    private double pop;
    private String day;

    // Constructor
    public CityDaily(int dt, int sunrise, int sunset, int moonrise, int moonset, double moonphase, String summary,
                     double temp, double tempMin, double tempMax, double tempNight, double tempEve,
                     double tempMorn, double feelsLikeDay, double feelsLikeNight, double feelsLikeEve,
                     double feelsLikeMorn, int pressure, int humidity, double dewPoint, double windSpeed,
                     int windDeg, double windGust, String weatherMain, String weatherDesc, int clouds, double uvi, double pop) {
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonphase = moonphase;
        this.summary = summary;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempNight = tempNight;
        this.tempEve = tempEve;
        this.tempMorn = tempMorn;
        this.feelsLikeDay = feelsLikeDay;
        this.feelsLikeNight = feelsLikeNight;
        this.feelsLikeEve = feelsLikeEve;
        this.feelsLikeMorn = feelsLikeMorn;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weatherMain = weatherMain;
        this.weatherDesc = weatherDesc;
        this.clouds = clouds;
        this.uvi = uvi;
        this.pop = pop;
        this.day = getCurrentDayOfWeek(dt); // Get the day of the week based on the epoch time
    }
    
    /**
     * This method is used to return the daily weather data in a string format
     */
    @Override
    public String toString() {
        return "CityDaily{" +
                "dtraw=" + dt +
                ", dt=" + resolveHourFromEpoch(dt) +
                ", day=" + getCurrentDayOfWeek(dt) +
                ", sunrise=" + resolveHourFromEpoch(sunrise) + " " + sunrise +
                ", sunset=" + resolveHourFromEpoch(sunset) + " " + sunset +
                ", moonrise=" + resolveHourFromEpoch(moonrise) +
                ", moonset=" + resolveHourFromEpoch(moonset) +
                ", moonphase=" + moonphase +
                ", summary='" + summary + '\'' +
                ", temp=" + getFahrenheit(temp) +
                ", tempMin=" + getFahrenheit(tempMin) +
                ", tempMax=" + getFahrenheit(tempMax) +
                ", tempNight=" + getFahrenheit(tempNight) +
                ", tempEve=" + getFahrenheit(tempEve) +
                ", tempMorn=" + getFahrenheit(tempMorn) +
                ", feelsLikeDay=" + getFahrenheit(feelsLikeDay) +
                ", feelsLikeNight=" + getFahrenheit(feelsLikeNight) +
                ", feelsLikeEve=" + getFahrenheit(feelsLikeEve) +
                ", feelsLikeMorn=" + getFahrenheit(feelsLikeMorn) +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dewPoint=" + dewPoint +
                ", windSpeed=" + windSpeed +
                ", windDeg=" + windDeg +
                ", windGust=" + windGust +
                ", weatherMain='" + weatherMain + '\'' +
                ", weatherDesc='" + weatherDesc + '\'' +
                ", clouds=" + clouds +
                ", uvi=" + uvi +
                ", pop=" + pop + 
                '}';
    }
    /**
     * This method is used to resolve the hour from the epoch time
     * @param epoch - The epoch time
     * @return String - The hour
     */
    private String resolveHourFromEpoch(int epoch) {
        // Convert epoch time to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(epoch), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm"); // Format the hour and minute parts
        String hour = dateTime.format(formatter); 
        
        return hour;
    }
    /**
     * This method is used to convert Kelvin to Fahrenheit
     * @param k - The temperature in Kelvin
     * @return int - The temperature in Fahrenheit
     */
    private int getFahrenheit(double k) {
        return (int) Math.rint((k - 273.15) * 9/5 + 32);
    }
    
    /**
     * This method is used to get the day of the week based on the epoch time
     * @param dt - The epoch time
     * @return String - The day of the week
     */
    private String getCurrentDayOfWeek(int dt) {
        LocalDate date = LocalDate.ofEpochDay(dt / (24 * 60 * 60)); // Convert epoch time to LocalDate
        DayOfWeek dayOfWeek = date.getDayOfWeek(); // Get the day of the week
        String day = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Get the day of the week in full text
        return day;
    }

    // Getters
    public int getDt() {return dt;}
    
    public String getDay() { return day; }
    
    public int getSunrise() { return sunrise; }
    
    public double getPop() { return pop;}

    public int getSunset() { return sunset; }

    public int getMoonrise() { return moonrise; }

    public int getMoonset() { return moonset; }

    public double getMoonphase() { return moonphase; }

    public String getSummary() { return summary; }

    public double getTemp() { return temp; }

    public double getTempMin() { return tempMin; }

    public double getTempMax() { return tempMax; }

    public double getTempNight() { return tempNight; }

    public double getTempEve() { return tempEve; }

    public double getTempMorn() { return tempMorn; }

    public double getFeelsLikeDay() { return feelsLikeDay; }

    public double getFeelsLikeNight() { return feelsLikeNight; }

    public double getFeelsLikeEve() { return feelsLikeEve; }

    public double getFeelsLikeMorn() { return feelsLikeMorn; }

    public int getPressure() { return pressure; }

    public int getHumidity() { return humidity; }

    public double getDewPoint() { return dewPoint; }

    public double getWindSpeed() { return windSpeed; }

    public int getWindDeg() { return windDeg; }

    public double getWindGust() { return windGust; }

    public String getWeatherMain() { return weatherMain; }

    public String getWeatherDesc() { return weatherDesc; }

    public int getClouds() { return clouds; }

    public double getUvi() { return uvi; }
}

