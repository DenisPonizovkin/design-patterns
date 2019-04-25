import adapter.*;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void demoFacade() {
        System.out.println("\n============ DEMO FACADE ============");
        facade.FacadeDemo.demo();
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        demoFacade();
        demoAdapterRealisation();
    }

    private static void demoAdapterRealisation() {
        System.out.println("\n============ ADAPTER FACADE ============");
        List<ITemperatureSensor> devices = new ArrayList<ITemperatureSensor>();
        devices.add(new ComPortTemperatureSensorDallas());
        devices.add(new ComPortTemperatureSensorOven());
        devices.add(new ComPortTemperatureSensorTexasInstruments());
        devices.add(new Usb2ComAdapterViaInheritance());
        devices.add(new Usb2ComAdapterViaComposition());

        for (ITemperatureSensor d: devices) {
            d.readTemperatureByComPort();
        }
        System.out.println("========================================");
    }
}
