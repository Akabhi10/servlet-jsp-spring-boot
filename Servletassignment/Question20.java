package Wiproan;


abstract class BaseVehicle20 {
    abstract void startEngine();
    abstract void stopEngine();
}

class CarVehicle20 extends BaseVehicle20 {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends BaseVehicle20 {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Question20 {
    public static void main(String[] args) {
        BaseVehicle20 car = new CarVehicle20();
        BaseVehicle20 bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}

