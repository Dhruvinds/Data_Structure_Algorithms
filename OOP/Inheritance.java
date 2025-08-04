// Inheritance

class Vehicle {

    String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }

    public void honk() {
        System.out.println("Honk!!!!!!!");
    }
}

class Car extends Vehicle {

    public Car(String numberOfCar) {
        super(numberOfCar);
    }

}

class Bus extends Vehicle {

    public Bus(String numberOfCar) {
        super(numberOfCar);
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Car car = new Car("GJ05CAR9173");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("GJ05BUS9173");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
