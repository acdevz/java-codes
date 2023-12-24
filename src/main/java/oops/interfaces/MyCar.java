package oops.interfaces;

public class MyCar {
    private Engine engine = new DieselEngine();
    private Media player = new MusicSystem();

    private Brake brake = new Brake() {
        @Override
        public void apply() {
            System.out.println("Brake applied!");
        }

        @Override
        public void release() {
            System.out.println("Brake released!");
        }
    };

    void start() {
        engine.start();
    }

    void play(){
        player.start();
    }
}
