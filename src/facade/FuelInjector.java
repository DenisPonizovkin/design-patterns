package facade;

public class FuelInjector {

    private final FuelPump mFuelPump = new FuelPump();

    void on() {
        System.out.println(this.getClass().getName() + ": on");
    }

    void off() {
        System.out.println(this.getClass().getName() + ": off");
    }

    void inject() {
        System.out.println(this.getClass().getName() + ": inject");
        mFuelPump.pump();
    }
}
