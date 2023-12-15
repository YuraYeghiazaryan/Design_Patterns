public class ConcreteRemote implements Remote{
    Device device;
    public ConcreteRemote(){};
    public ConcreteRemote(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        if(this.device.isTurnOn())
            this.device.turnOff();
        else this.device.turnOn();
        System.out.println("ashxatec");
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void channelUp() {

    }

    @Override
    public void channelDown() {

    }
}
