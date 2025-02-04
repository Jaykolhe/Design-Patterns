package Strategy;


interface DriveStrategy{

    void drive();
}

class NormalDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}

class SpecialDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("SpecialDriveStrategy");
    }
}
class Vehicle{

    DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.drive();
    }
}

class SportsCar extends Vehicle{


    public SportsCar() {
        super(new SpecialDriveStrategy());
    }

    public void drive() {
        strategy.drive();
    }
}

class PassengerCar extends Vehicle{


    public PassengerCar() {
        super(new NormalDriveStrategy());
    }
    public void drive() {
        strategy.drive();
    }
}

class OffRoad extends Vehicle{


    public OffRoad() {
        super(new SpecialDriveStrategy());
    }

    public void drive() {
        strategy.drive();
    }
}


public class Main {

    public static void main(String[] args) {


        Vehicle vehicle = new PassengerCar();
        vehicle.drive();

        vehicle = new OffRoad();
        vehicle.drive();

        vehicle = new SportsCar();
        vehicle.drive();
    }



}
