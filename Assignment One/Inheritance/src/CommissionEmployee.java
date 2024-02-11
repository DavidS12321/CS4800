public class CommissionEmployee extends Employee {

    private int commissionRate;
    private double grossSales;

    public CommissionEmployee (String fName, String lName, String social, int rate, double sales) {
        super(fName, lName, social);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    protected void setCommissionRate(int rate){
        this.commissionRate = rate;
    }

    protected void setGrossSales (double sales){
        this.grossSales = sales;
    }

    protected int getCommissionRate(){
        return commissionRate;
    }

    protected double getGrossSales(){
        return grossSales;
    }
}
