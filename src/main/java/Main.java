public class Main {

    public static void main(String[] args) {
        // Creating objects
        Car myCar = new Car("Toyota", 180, 4);
        myCar.displayInfo();

        Car mycar2 = new Car("BMW", 200, 4);

        System.out.println("BMW  " + mycar2);
        mycar2.displayInfo();

        Car newCar = new Car("newCar", 220, 4, "Japanese");
        newCar.displayInfo2();

        Motorcycle myMotorcycle = new Motorcycle("Honda", 200, "Sport");

        System.out.println("Get the car name : " + myCar.getVehicleName());

        System.out.println("----------------------");

        // Polymorphism - calling displayInfo() of Motorcycle
        myMotorcycle.displayInfo();
    }



}
