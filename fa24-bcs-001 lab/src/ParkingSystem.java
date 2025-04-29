public class ParkingSystem {
    private ParkingSystem instance =null;
    private String campusName;
    private Supervisor supervisor;
    private ParkingZone zone1;
    private ParkingZone zone2;
    private PermitHolder permitHolder1;
    private PermitHolder permitHolder2;

    private ParkingSystem(String campusName, Supervisor supervisor) {
        this.campusName = campusName;
        this.supervisor = supervisor;
    }
    public ParkingSystem psMaker(String campusName,Supervisor supervisor){
        if(instance!=null){
           System.out.print("object already exists");
           return instance;
        }
        if(instance==null){
            instance= psMaker(campusName,supervisor);
        }
        return instance;
    }

    public void addZone(ParkingZone z){
        if (zone1==null) {zone1=z;}
        if (zone2==null) {zone2=z;}
    }
    public void addPermitHolder(PermitHolder p){
        if (permitHolder1==null) {permitHolder1=p;}
        if (permitHolder2==null) {permitHolder2=p;}
    }

    @Override
    public String toString() {
        return "ParkingSystem{" +
                "instance=" + instance +
                ", campusName='" + campusName + '\'' +
                ", supervisor=" + supervisor +
                ", zone1=" + zone1 +
                ", zone2=" + zone2 +
                ", permitHolder1=" + permitHolder1 +
                ", permitHolder2=" + permitHolder2 +
                '}';
    }
}
