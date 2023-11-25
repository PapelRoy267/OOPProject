// Abstract class

abstract class Vehicle {

    private String vehicleName;
    private int maxSpeed;

    public Vehicle(String name, int speed) {
        this.vehicleName = name;
        this.maxSpeed = speed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Abstract method
    public abstract void displayInfo();
    public abstract void displayInfo2();


}





