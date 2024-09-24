package ControlMethods;

public class VoiceControl implements IControlMethod{
    @Override
    public void sendCommand(String command) {
        System.out.println("Voice control command: "+ command);
    }
}
