package oops.interfaces;

public class MusicSystem implements Media{
    @Override
    public void start() {
        System.out.println("Music system started!");
    }

    @Override
    public void stop() {
        System.out.println("Music system stopped!");
    }
}
