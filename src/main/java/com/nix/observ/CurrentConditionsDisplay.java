package com.nix.observ;

import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayEl {
   Observable observable;
   private float temp;
   private float hum;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData =(WeatherData)o;
            this.temp=weatherData.getTemp();
            this.hum=weatherData.getHum();
            display();
        }
    }

    public void display(){
        System.out.println("currant conditions: " +temp+";  "+hum);
    }
}
