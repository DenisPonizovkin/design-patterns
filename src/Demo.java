import adapter.*;
import bridge.MySQL;
import bridge.PostgreSQL;
import bridge.Selector;
import decorator.SensorBoardDecorator;
import decorator.TemperatureSensor;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void demoFacade() {
        System.out.println("\n============ DEMO FACADE ============");
        facade.FacadeDemo.demo();
        System.out.println("=====================================");
    }

    public static void main(String[] args) throws Exception {
        demoFacade();
        demoAdapterRealisation();
        demoBridge();
        demoDecorator();
    }

    private static void demoDecorator() throws Exception {
        System.out.println("\n============ DEMO FACADE ============");
        {
            SensorBoardDecorator sbd = new SensorBoardDecorator(new TemperatureSensor());
            sbd.read();
        }
        {
            SensorBoardDecorator sbd = new SensorBoardDecorator();
            sbd.request("humidity");
        }
        System.out.println("=====================================");
    }

    private static void demoBridge() {
        Selector ps = new Selector(new PostgreSQL());
        Selector ms = new Selector(new MySQL());

        ps.select();
        ms.select();
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
