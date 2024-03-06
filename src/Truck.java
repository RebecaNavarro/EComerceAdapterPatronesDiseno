public class Truck implements Vehicle{

    public Truck(){}

    @Override
    public void accelerate() {
        System.out.println("El camión acelera");
    }

    @Override
    public void decelerate() {
        System.out.println("El camión frena");
    }

    @Override
    public void start() {
        System.out.println("EL camión avanza");
    }

    @Override
    public void stop() {
        System.out.println("EL camión para");
    }
}
