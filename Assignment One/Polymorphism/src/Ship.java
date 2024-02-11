public class Ship {

    private String name;
    private String yearBuilt;

    protected Ship(String n, String year){
        this.name = n;
        this.yearBuilt = year;
    }

    protected void setName(String n){
        this.name = n;
    }

    protected void setYearBuilt(String year) {
        this.yearBuilt = year;
    }

    protected String getName(){
        return name;
    }

    protected String getYearBuilt(){
        return yearBuilt;
    }

    protected void printDetails(){
        System.out.println("Ship Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
    }
}
