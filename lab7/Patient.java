//patient class
public class Patient {
    private String patientID;
    private Name name;
    private int age;
    private String gender;
    private Address address;
    private HealthInfo pHealth;
    private Doctor doctor;

    public Patient(String patientID, String firstName, String lastName, String gender, Address address, int age, int h, int w) {
        this.patientID = patientID;
        Name name = new Name(firstName, lastName);
        this.gender = gender;
        this.address = address;
        this.age = age;
        pHealth = new HealthInfo(h, w);
    }

}