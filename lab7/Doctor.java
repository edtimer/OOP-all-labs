public class Doctor {
    private String staffID;
    private Name name;
    public Doctor(String staffID,String firstName,String lastName){
        this.staffID = staffID;
        name = new Name(firstName,lastName);
    }
    public String getName(){
        return name.getName();
    }
}