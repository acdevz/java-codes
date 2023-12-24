package oops.design.car;

public abstract class Car {
    private Engine engine;
    private float mileage;
    private float horsepower;
    private float price;
    //...

    public abstract void render();
    public abstract void playSound();

    public void setMileage(float newMileage) {
        if (newMileage <= 0) {
            System.err.println("Mileage cannot be negative!");
        }
        this.mileage = newMileage;
    }

    public float getMileage() {
        return this.mileage;
    }
    //...
}
// New Cars extend Car
