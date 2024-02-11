public class Main {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Flying Dutchman", "1650");
        ships[1] = new CruiseShip("Royal Caribbean", "2015", 3000);
        ships[2] = new CargoShip("The Cargo", "1990", 40000);

        for (Ship ship: ships) {
            ship.printDetails();
            System.out.println();
        }
    }
}