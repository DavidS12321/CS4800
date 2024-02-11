public class HourlyEmployee extends Employee {

    private double wage;
    private int hoursWorked;

    public HourlyEmployee (String fName, String lName, String social, double wage, int hours) {
        super(fName, lName, social);
        this.wage = wage;
        this.hoursWorked = hours;
    }

    protected void setWage(double w){
        this.wage = w;
    }

    protected void setHoursWorked (int hours){
        this.hoursWorked = hours;
    }

    protected double getWage(){
        return wage;
    }

    protected int getHoursWorked(){
        return hoursWorked;
    }
}
