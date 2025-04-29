public class PermitHolder extends Person {

    private int permitId;

    public PermitHolder(String name, int permitId) {
        super(name);
        this.permitId = permitId;
    }

    public int getPermitId() {
        return permitId;
    }

    @Override
    public String toString() {
        return "PermitHolder{" +
                "permitId=" + permitId +
                '}';
    }


}
