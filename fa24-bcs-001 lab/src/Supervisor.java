public class Supervisor extends Person {
    private int yearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
