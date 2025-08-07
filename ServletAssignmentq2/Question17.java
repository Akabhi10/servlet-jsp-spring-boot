package Wiproan;

class Vehicle {
    String color;
    int wheels;
    String model;

    public Vehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Model: " + model);
    }
}

class Truck extends Vehicle {
    public Truck(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void loadCapacity() {
        System.out.println("Truck can carry heavy loads.");
    }
}

class Bus extends Vehicle {
    public Bus(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void passengerCapacity() {
        System.out.println("Bus can carry 50 passengers.");
    }
}

class Car extends Vehicle {
    public Car(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    public void carType() {
        System.out.println("This is a private car.");
    }
}
public class Question17 {

	public static void main(String[] args) {
		
		        Truck truck = new Truck("Red", 6, "TATA HeavyDuty");
		        Car car = new Car("Black", 4, "Hyundai i20");
		        Bus bus = new Bus("White", 6, "Volvo AC");

		        System.out.println("=== Truck Details ===");
		        truck.showDetails();
		        truck.loadCapacity();

		        System.out.println("\n=== Car Details ===");
		        car.showDetails();
		        car.carType();

		        System.out.println("\n=== Bus Details ===");
		        bus.showDetails();
		        bus.passengerCapacity();

	}

}
