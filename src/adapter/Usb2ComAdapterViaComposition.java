package adapter;

public class Usb2ComAdapterViaComposition extends UsbPortTemperatureSensor implements ITemperatureSensor {
    @Override
    public void readTemperatureByComPort() {
        System.out.print("(com => usb) via composition: ");
        readTempByUsbPort();
    }

    @Override
    public void readTempByUsbPort() {
        super.readTempByUsbPort();
    }
}
