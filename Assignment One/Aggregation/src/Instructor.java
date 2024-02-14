public class Instructor {

    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String fName, String lName, String officeNumber){
        this.firstName = fName;
        this.lastName = lName;
        this.officeNumber = officeNumber;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}