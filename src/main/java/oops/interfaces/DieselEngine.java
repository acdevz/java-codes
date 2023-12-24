package oops.interfaces;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel engine started!");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stopped!");
    }

    @Override
    public void accelerate() {
        System.out.println("Diesel engine accelerated!");
    }
}
