package oops.interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void apply() {
        System.out.println("Brake applied!");
    }

    @Override
    public void release() {
        System.out.println("Brake released!");
    }

    @Override
    public void start() {
        System.out.println("Engine started!");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped!");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerated!");
    }
}
