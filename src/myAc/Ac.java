package myAc;

public class Ac {


    public int getTemperature = 16;
    private int temperature = 16;

    public void increaseTemperature() {
        if (isOn){
            temperature++;
        }
        if (temperature > 30){
            temperature = 30;
        }
    }


    public int getTemperature(){
        return temperature;
    }
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnoff() {
        isOn = false;
    }
}
