package bridge;

public class SqlLIte implements DbProcessorRealisation {
    @Override
    public String createConnectStrnig() {
        return this.getClass().getName() + ": create connect string";
    }

    @Override
    public String createQueryStrnig() {
        return this.getClass().getName() + ": create query string";
    }
}
