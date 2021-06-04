// name class added.
public class Name {
    private String firstName;
    private String lastName;
    public Name(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getName(){
        return  firstName+" "+lastName;
    }

}