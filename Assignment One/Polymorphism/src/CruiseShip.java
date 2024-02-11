public class CruiseShip extends Ship {

    private int maxPassengers;

    protected  CruiseShip(String name, String yearBuilt, int passengers){
        super(name, yearBuilt);
        this.maxPassengers = passengers;
    }

    protected void setMaxPassengers(int passengers){
        this.maxPassengers = passengers;
    }

    protected int getMaxPassengers(){
        return maxPassengers;
    }

    @Override
    protected void printDetails(){
        System.out.println("Ship Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Maximum Passenger Capacity: " + getMaxPassengers());
    }
}
