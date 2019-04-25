package facade;

public class Engine {

    void on() {
        System.out.println(this.getClass().getName() + ": on");
    }

    void off() {
        System.out.println(this.getClass().getName() + ": off");
    }

}
