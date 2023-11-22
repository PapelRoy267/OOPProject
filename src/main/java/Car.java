// Inheritance
class Car extends Vehicle {
    private int numDoors;
    private String engine;
   //This is a constructor
    public Car(String name, int speed, int doors) {
        super(name, speed);
        this.numDoors = doors;
    }
    // Overloading
    public Car(String name, int speed, int doors,String engine) {
        super(name, speed);
        this.numDoors = doors;
        this.engine = engine;
    }


    // Polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Car Name: " + getVehicleName());
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
        System.out.println("Number of Doors: " + numDoors);
    }

    @Override
    public void displayInfo2() {
        System.out.println("Car Name: " + getVehicleName());
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Name of Engine : " + engine);
    }

}



