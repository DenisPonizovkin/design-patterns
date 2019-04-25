package facade;

public class CoolingController {

    private final TempSensor mTempSensor = new TempSensor();
    private final Radiator mRadiator = new Radiator();


    void on() {
        System.out.println(this.getClass().getName() + ": on");
        mTempSensor.init();
    }

    void off() {
        System.out.println(this.getClass().getName() + ": off");
    }

    void cool() {
        System.out.println(this.getClass().getName() + ": cool");
    }

}
