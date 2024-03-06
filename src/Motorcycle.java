public class Motorcycle implements Vehicle{

    public Motorcycle(){}

    @Override
    public void accelerate() {
        System.out.println("La moto acelera");
    }

    @Override
    public void decelerate() {
        System.out.println("La moto frena");
    }

    @Override
    public void start() {
        System.out.println("La moto avanza");
    }

    @Override
    public void stop() {
        System.out.println("La moto para");
    }
}
