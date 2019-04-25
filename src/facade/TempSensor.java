package facade;

public class TempSensor {

    public void getTemp() {
        System.out.println(this.getClass().getName() + ": get temperature");
    }

    public void init() {
        System.out.println(this.getClass().getName() + ": init");
    }
}
