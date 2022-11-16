package ac;

public class AirConditioner {

    private  int temperature = 16;
    private boolean isOn;

    public boolean isOn(){
        return isOn;
    }
    public void turnOn() {
         isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn){
            temperature++;
        }
        if (temperature > 30){
            temperature = 30;
        }
    }

    public void decreaseTemperature() {
        if (isOn){
            temperature--;
        }
        if (temperature < 16){
            temperature = 16;
        }
    }
}



