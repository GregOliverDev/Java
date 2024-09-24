package SmartDevices;

public class SmartLight implements ISmartDevice{
    public String statusLight;

    @Override
    public String turnOn() {
        return statusLight = "Light on";
    }

    @Override
    public String turnOff() {
        return statusLight = "Light off";
    }

    @Override
    public String status() {
        return "Status: " + statusLight;
    }
}