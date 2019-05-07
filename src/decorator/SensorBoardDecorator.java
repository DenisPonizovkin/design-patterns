package decorator;

public class SensorBoardDecorator implements SensorBoard {

    private final SensorBoard mBoard;

    public SensorBoardDecorator() {
        mBoard = null;
    }

    public SensorBoardDecorator(SensorBoard mBoard) {
        this.mBoard = mBoard;
    }

    @Override
    public void read() {
        mBoard.read();
    }

    public void request(String name) throws Exception {
        SensorBoard board = null;
        switch (name) {
            case ("temp"):
                board = new TemperatureSensor();
                break;
            case ("humidity"):
                board = new HumiditySensor();
                break;
            default:
                throw new Exception("Unknown sensor");
        }
        board.read();
    }
}
