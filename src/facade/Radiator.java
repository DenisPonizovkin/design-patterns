package facade;

public class Radiator {
    void on() {
        System.out.println(this.getClass().getName() + ": on");
    }

    void off() {
        System.out.println(this.getClass().getName() + ": off");
    }
}
