package presa_9;

import java.util.ArrayList;
import java.util.List;

interface Vehicle {
    void start();
    void stop();
    void displayInfo();
}

class Car implements Vehicle {
    private String brand;

    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Машина начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Машина останавливает движение");
    }

    @Override
    public void displayInfo() {
        System.out.print("Машина марки " + brand);
    }
}


class Bike implements Vehicle {
    private String type;

    Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Велосипед начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед останавливает движение");
    }

    @Override
    public void displayInfo() {
        System.out.print("Велосипед типа " + type);
    }
}

class Motorcycle implements Vehicle {
    private int engineCapacity;

    Motorcycle(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        System.out.println("Мотоцикл начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл останавливает движение");
    }

    @Override
    public void displayInfo() {
        System.out.print("Мотоцикл с объемом двитателя " + engineCapacity);
    }
}

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        vehicle.displayInfo();
        System.out.println(" добавлен в гараж" );
    }

    public void startAll() {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

    public void stopAll() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }
    }



    public static void main(String[] args) {
        Car car = new Car("BMW");
        Bike bike = new Bike("горный");
        Motorcycle motorcycle = new Motorcycle(2500);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(bike);
        garage.addVehicle(motorcycle);

        garage.startAll();
        garage.stopAll();


    }
}

