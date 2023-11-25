public class Main {

    public static void main(String[] args) {
        // Creating objects
        Car myCar = new Car("Toyota", 180, 4);
        myCar.displayInfo();

        Car mycar2 = new Car("BMW", 200, 4);
        mycar2.displayInfo();

        //System.out.println("BMW  " + mycar2);


        Car newCar = new Car("mercedes", 220, 4, "Germany");
        newCar.displayInfo2();

        Motorcycle myMotorcycle = new Motorcycle("honda", 245, "Electric", "indonesia");
        newCar.displayInfo2();


    }



}
