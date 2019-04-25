package facade;

public class FacadeStarter {

    private final CoolingController mCoolingController = new CoolingController();
    private final Engine mEngine = new Engine();
    private final FuelInjector mFuelInjector = new FuelInjector();

    public void start() {
        mCoolingController.on();
        mEngine.on();
        mFuelInjector.on();
        mFuelInjector.inject();
    }
}
