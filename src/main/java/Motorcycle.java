 public class Motorcycle  extends  Vehicle {

     private String bikeType;
     private String bikeEngine;

     public Motorcycle(String name, int speed, String type) {
         super(name, speed);
         this.bikeType = type;
     }

     public Motorcycle(String name, int speed, String type, String bikeEngine) {
         super(name, speed);
         this.bikeType = type;
         this.bikeEngine = bikeEngine;
     }

     // Polymorphism
     @Override
     public void displayInfo() {
         System.out.println("Motorcycle Name: " + getVehicleName());
         System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
         System.out.println("Bike Type: " + bikeType);
     }

     @Override
     public void displayInfo2() {
         System.out.println("Motorcycle Name: " + getVehicleName());
         System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
         System.out.println("Bike Type: " + bikeType);
         System.out.println("Bike Engine: " + bikeEngine);
     }

 }
