public class Doctor {
    private String staffID;
    private Name name;
    public Doctor(String firstName,String lastName,String staffID){
        this.staffID = staffID;
        name = new Name(firstName,lastName);
    }
    public String getFullName(){
        return name.getFullName();
    }
}