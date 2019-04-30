package bridge;

public class Selector extends DbProcessor {
    public Selector(DbProcessorImpl impl) {
        super(impl);
    }

    public void select() {
        connect();
        query();
    }
}
