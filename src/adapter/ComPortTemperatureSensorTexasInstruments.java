package adapter;

public class ComPortTemperatureSensorTexasInstruments implements ITemperatureSensor {
    @Override
    public void readTemperatureByComPort() {
        System.out.println("read data from TI");
    }
}
