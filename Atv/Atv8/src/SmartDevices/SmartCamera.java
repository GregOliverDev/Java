package SmartDevices;

public class SmartCamera implements ISmartDevice{
    public String statusCamera;

    @Override
    public String turnOn() {
        return statusCamera = "Camera on";
    }

    @Override
    public String turnOff() {
        return statusCamera = "Camera off";
    }

    @Override
    public String status() {
        return "Status: " + statusCamera;
    }
}
