package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.ENUM.Zad1;

public class Weather {

    int dayOfYear;
    int temperature;
    int pressure;
    Season season; // enum jest częścią większej całości

    public Weather(int dayOfYear, int temperature, int pressure, Season season) {
        this.dayOfYear = dayOfYear;
        this.temperature = temperature;
        this.pressure = pressure;
        this.season = season;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Season getSeason() {
        return season;
    }
}
