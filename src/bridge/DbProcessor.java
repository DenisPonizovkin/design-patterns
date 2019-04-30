package bridge;

public abstract class DbProcessor {

    private final DbProcessorImpl mBridge;

    public DbProcessor(DbProcessorImpl impl) {
        mBridge = impl;
    }

    private void exec(String q) {
        System.out.println(q);
    }

    // Interface
    public void connect() {
        exec(mBridge.createConnectStrnig());
    }

    public void query() {
        exec(mBridge.createQueryStrnig());
    }

}
