package bridge;

public class Selector extends DbProcessorAbstract {
    public Selector(DbProcessorRealisation impl) {
        super(impl);
    }

    public void select() {
        connect();
        query();
    }
}
