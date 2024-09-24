import ControlMethods.AppControl;
import ControlMethods.IControlMethod;
import ControlMethods.RemoteControl;
import ControlMethods.VoiceControl;
import SmartDevices.ISmartDevice;
import SmartDevices.SmartCamera;
import SmartDevices.SmartLight;
import SmartDevices.SmartThermostat;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        var devices = new ArrayList<ISmartDevice>();
        devices.add(new SmartCamera());
        devices.add(new SmartLight());
        devices.add(new SmartThermostat());

        IControlMethod iControlMethod = new AppControl();

        Room room = new Room(devices, iControlMethod);

        System.out.println();
        room.onDevice(room.getiSmartDevices(0));
        room.onDevice(room.getiSmartDevices(1));

        System.out.println();
        room.setiControlMethod(new VoiceControl());
        room.offDevice(room.getiSmartDevices(0));
        room.offDevice(room.getiSmartDevices(2));

        System.out.println();
        room.setiControlMethod(new RemoteControl());
        room.statusDevice(room.getiSmartDevices(0));
        room.statusDevice(room.getiSmartDevices(1));
        room.statusDevice(room.getiSmartDevices(2));

    }
}