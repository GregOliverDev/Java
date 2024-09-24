import ControlMethods.IControlMethod;
import SmartDevices.ISmartDevice;

import java.util.List;

public class Room {
    private List<ISmartDevice> iSmartDevices;
    private IControlMethod iControlMethod;

    public Room(List<ISmartDevice> iSmartDevices, IControlMethod iControlMethod) {
        this.iSmartDevices = iSmartDevices;
        this.iControlMethod = iControlMethod;
    }

    public void setiControlMethod(IControlMethod iControlMethod) {
        this.iControlMethod = iControlMethod;
    }

    public ISmartDevice getiSmartDevices(int i) {
        for (int index = 0; index < iSmartDevices.size(); index++) {
            if ( index == i) {
                return this.iSmartDevices.get(index);
            }
        }
        return null;
    }

    public void onDevice(ISmartDevice iSmartDevice){
        this.iControlMethod.sendCommand(iSmartDevice.turnOn());
    }

    public void offDevice(ISmartDevice iSmartDevice){
        this.iControlMethod.sendCommand(iSmartDevice.turnOff());
    }

    public void statusDevice(ISmartDevice iSmartDevice){
        this.iControlMethod.sendCommand(iSmartDevice.status());
    }
}
