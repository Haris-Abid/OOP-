import java.util.Arrays;

public class ParkingZone {

    private static int zoneId=1;
    private Vehicle vehicles []=new Vehicle[5];
    private int vehicleCount;

    public ParkingZone(Vehicle[] vehicle) {
        this.vehicles = vehicle;
        vehicleCount=0;
        zoneId++;
    }

    public void addVehicle(Vehicle v){

        if (vehicleCount<=5){
            vehicles[vehicleCount]=v;
            vehicleCount++;
        }
    }

    @Override
    public String toString() {
        return "ParkingZone{" +
                "vehicles=" + Arrays.toString(vehicles) +
                ", vehicleCount=" + vehicleCount +
                '}';
    }
}
