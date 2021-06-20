package pt.unl.fct.di.bmon;

public class Bonsai {

    String name;
    int humidity_value, luminosity_value, moisture_value, temperature_value;

    public Bonsai(String name, int humidity_value, int luminosity_value, int moisture_value, int temperature_value){
        this.name = name;
        this.humidity_value = humidity_value;
        this.luminosity_value = luminosity_value;
        this.moisture_value = moisture_value;
        this.temperature_value = temperature_value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHumidity_value(int humidity_value) {
        this.humidity_value = humidity_value;
    }

    public void setLuminosity_value(int luminosity_value) {
        this.luminosity_value = luminosity_value;
    }

    public void setMoisture_value(int moisture_value) {
        this.moisture_value = moisture_value;
    }

    public void setTemperature_value(int temperature_value) {
        this.temperature_value = temperature_value;
    }

    public String getName() {
        return name;
    }

    public int getHumidity_value() {
        return humidity_value;
    }

    public int getLuminosity_value() {
        return luminosity_value;
    }

    public int getMoisture_value() {
        return moisture_value;
    }

    public int getTemperature_value() {
        return temperature_value;
    }
}
