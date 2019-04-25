package adapter;

public class ComPortTemperatureSensorOven implements ITemperatureSensor {
    @Override
    public void readTemperatureByComPort() {
        System.out.println("read data from Oven");
    }
}
