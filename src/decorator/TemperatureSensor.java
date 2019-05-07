package decorator;

public class TemperatureSensor implements SensorBoard {
    @Override
    public void read() {
        System.out.println("Read from " + this.getClass().getName());
    }
}
