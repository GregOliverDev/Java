package ControlMethods;

public class RemoteControl implements IControlMethod {
    @Override
    public void sendCommand(String command) {
        System.out.println("Remote control command: "+ command);
    }
}
