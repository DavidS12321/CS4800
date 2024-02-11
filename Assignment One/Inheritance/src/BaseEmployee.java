public class BaseEmployee extends Employee {

    private double baseSalary;

    public BaseEmployee (String fName, String lName, String social, double salary) {
        super(fName, lName, social);
        this.baseSalary = salary;
    }

    protected void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    protected double getBaseSalary(){
        return baseSalary;
    }
}
