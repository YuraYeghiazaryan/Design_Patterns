public class Tv implements Device{
    private boolean on = false;
    private int volume = 100;
    private int channel = 20;

    @Override
    public boolean isTurnOn() {
        return this.on;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume() {

    }

    @Override
    public void getVolume() {

    }

    @Override
    public void setChannel() {

    }

    @Override
    public void getChannel() {

    }
}
