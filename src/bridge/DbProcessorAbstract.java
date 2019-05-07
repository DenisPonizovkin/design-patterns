package bridge;

public abstract class DbProcessorAbstract {

    private final DbProcessorRealisation mBridge;

    public DbProcessorAbstract(DbProcessorRealisation impl) {
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
