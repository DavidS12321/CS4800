public class CargoShip extends Ship {

    private int cargoCapacity;

    protected CargoShip(String name, String yearBuilt, int capacity){
        super(name, yearBuilt);
        this.cargoCapacity = capacity;
    }

    protected void setCargoCapacity(int capacity){
        this.cargoCapacity = capacity;
    }

    protected int getCargoCapacity(){
        return cargoCapacity;
    }

    @Override
    protected void printDetails(){
        System.out.println("Ship Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Cargo Capacity (in tons): " + getCargoCapacity());
    }
}
