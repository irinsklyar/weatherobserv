package com.nix.observ;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setData(23,45,67);
    }
}
