
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

//dynamic vector declaration
        Vector<Patient> patientList = new Vector<Patient>();

        Address add1 = new Address("Jalan Pahlawan", "Skudai", 81300, "Johor");
        Address add2 = new Address("Jalan Flora", "Skudai", 81300, "Johor");
        Address add3 = new Address("Jalan Bakti", "Skudai", 81300, "Johor");
        Address add4 = new Address("Jalan Mutiara", "Skudai", 81300, "Johor");
        Address add5 = new Address("Jalan Indah", "Skudai", 81300, "Johor");

        Doctor d1 = new Doctor("S0001", "Kumar", "Moorthy");
        Doctor d2 = new Doctor("S0002", "Stephen", "Koh");

        Patient p1 = new Patient("P0001", "Akmal", "Adnan", "Male", add1, 25, 180, 82);
        Patient p2 = new Patient("P0002", "Syafiq", "Yusof", "Male", add2, 24, 186, 80);
        Patient p3 = new Patient("P0003", "Mei Ling", "Koh", "Female", add3, 30, 168, 45);

        p1.attendBy(d1);
        p2.attendBy(d2);
        p3.attendBy(d1);

        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);

        displayRecord(patientList);

        patientList.remove(0);

        displayRecord(patientList);

    }

    /*
        This function display the record of the patient
    */
    public static void displayRecord(Vector<Patient> pL) {

        System.out.println("\nPatient Record Management System");
        System.out.println("================================");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-20s\n", "No", "PatientID", "Name", "Gender", "Address", "Height", "Weight","Attend By");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-20s\n", "--", "---------", "----", "------", "-------", "------", "------","---------");

        for(int i=0; i < pL.size(); i++) {
            System.out.printf("%-5d%-10s%-25s%-10s%-50s%-10d%-10d%-20s\n", (i+1),
                    pL.get(i).getPatientID(),
                    pL.get(i).getName(),
                    pL.get(i).getGender(),
                    pL.get(i).getAddress().getAddress(),
                    pL.get(i).getHeight(),
                    pL.get(i).getWeight(),
                    "Dr. "+ pL.get(i).getDoctor().getName());
        }

        System.out.println("\n-------------------");
        System.out.println("Total Patients: "+ pL.size());
        System.out.println("Adam 2021");
    }
}