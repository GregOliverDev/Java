package ControlMethods;

public class AppControl implements IControlMethod{
    @Override
    public void sendCommand(String command) {
        System.out.println("App control command: "+ command);
    }
}
