class Student {

    private String name;
    private float gpa;
    private String city;
    private long phone;
    private String regNo;
    private static int count = 1;

    // Constructor
    Student(String n, float g, String c, long p) {
        name = n;
        gpa = g;
        city = c;
        phone = p;
        regNo = String.format("FA24-BCS-%03d", count);
        count++;
    }

    // Getters and Setters
    public String getRegNo() {
        return regNo;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGpa(float g) {
        gpa = g;
    }

    public float getGpa() {
        return gpa;
    }

    public void setCity(String c) {
        city = c;
    }

    public String getCity() {
        return city;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long p) {
        phone = p;
    }
}

class User {
    static String userName = "Haris001";
    static String password = "fa24-bcs-001";
}



