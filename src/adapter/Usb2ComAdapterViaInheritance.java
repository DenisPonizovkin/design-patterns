package adapter;

import com.sun.management.UnixOperatingSystemMXBean;

public class Usb2ComAdapterViaInheritance implements ITemperatureSensor {

    private final UsbPortTemperatureSensor usb = new UsbPortTemperatureSensor();

    @Override
    public void readTemperatureByComPort() {
        System.out.print("(com => usb) via inheritance: ");
        usb.readTempByUsbPort();
    }
}
