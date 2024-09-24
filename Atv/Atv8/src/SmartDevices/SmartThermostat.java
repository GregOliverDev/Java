package SmartDevices;

public class SmartThermostat implements ISmartDevice{
    public String statusThermostat;

    @Override
    public String turnOn() {
        return statusThermostat = "Thermostat on";
    }

    @Override
    public String turnOff() {
        return statusThermostat = "Thermostat off";
    }

    @Override
    public String status() {
        return "Status: " + statusThermostat;
    }
}