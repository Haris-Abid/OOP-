import java.security.PrivateKey;

public class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;

    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }

    public Vehicle shallowCopy(){
        return new Vehicle(this.licensePlate,this.type,this.owner);

    }
    public Vehicle deepCopy(String name){
        Owner newOwner=new Owner(name);
        return new Vehicle(this.licensePlate,this.type,newOwner);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", type='" + type + '\'' +
                ", owner=" + owner +
                '}';
    }
}
