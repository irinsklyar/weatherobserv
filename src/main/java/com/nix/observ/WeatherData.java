package com.nix.observ;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float hum;
    private int press;

    public void dataChanged() {
        setChanged();
        notifyObservers();
    }

    public void setData(float temp, float hum, float press) {
        this.temp = temp;
        this.hum = hum;
        this.hum = hum;
        dataChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHum() {
        return hum;
    }

    public float getPress() {
        return press;
    }

}
