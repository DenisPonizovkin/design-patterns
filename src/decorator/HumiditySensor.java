package decorator;

public class HumiditySensor implements SensorBoard {
    @Override
    public void read() {
        System.out.println("Read from " + this.getClass().getName());
    }
}
