package adapter;

public class ComPortTemperatureSensorDallas implements ITemperatureSensor {

    @Override
    public void readTemperatureByComPort() {
        System.out.println("read data from Dallas");
    }

}
