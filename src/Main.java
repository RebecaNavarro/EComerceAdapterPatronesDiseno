import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehiculos");

        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();

        StartVehicle startCommand = new StartVehicle(motorcycle);
        AccelerateVehicle accelerateCommand = new AccelerateVehicle(motorcycle);

        GhostRider ghostRider = new GhostRider(startCommand);

        ghostRider.takeAction(); //el primero que es el start
        ghostRider.setCommand(accelerateCommand);
        ghostRider.takeAction();
        ghostRider.revertAction();

        System.out.println("***************************");

        List<Vehicle> vehicles = List.of(truck,motorcycle);
        StartAllVehicles startAllVehicles = new StartAllVehicles(vehicles);
        startAllVehicles.execute();
        startAllVehicles.revert();

    }
}