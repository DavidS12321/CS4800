public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    protected Employee(String fName, String lName, String social){
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurity = social;
    }

    protected void setFirstName (String fName) {
        this.firstName = fName;
    }
    protected void setLastName (String lName) {
        this.firstName = lName;
    }

    protected void setSocialSecurity (String social) {
        this.socialSecurity = social;
    }

    protected String getFirstName () {
        return firstName;
    }

    protected String getLastName () {
        return lastName;
    }

    protected String getSocialSecurity () {
        return socialSecurity;
    }
}
