public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String fName, String lName, String social, double weeklySal) {
        super(fName, lName, social);
        this.weeklySalary = weeklySal;
    }

    protected void setWeeklySalary(double wkSal) {
        this.weeklySalary = wkSal;
    }

    protected double getWeeklySalary(){
        return weeklySalary;
    }

}