public class Main {
    public static void main(String[] args) {

        Ship ship1 = new Ship("", "");
        ship1.setName("Flying Dutchman");
        ship1.setYearBuilt("1650");

        CruiseShip ship2 = new CruiseShip("", "", 0);
        ship2.setName("Royal Caribbean");
        ship2.setYearBuilt("2015");
        ship2.setMaxPassengers(3000);

        CargoShip ship3 = new CargoShip("", "", 0);
        ship3.setName("The Cargo");
        ship3.setYearBuilt("1990");
        ship3.setCargoCapacity(40000);

        Ship[] ships = {ship1, ship2, ship3};

        for (Ship ship : ships) {
            ship.printDetails();
        }
    }
}