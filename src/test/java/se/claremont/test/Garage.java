package se.claremont.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Garage {

    String address;
    Vehicle[] vehicles;

    public Garage(String address) {
        this.address = address;
    }

    public void setSizeOfGarage(int parkingLots) {

        this.vehicles = new Vehicle[parkingLots];
    }

    public void parkVehicle(int place, Vehicle vehicle) {

        vehicles[place] = vehicle;
    }

    public Vehicle checkVehicle(int place) {

        return vehicles[place];
    }

    public void changeParkingSpace(int parkingSpace, Vehicle vehicle) {

        vehicles[parkingSpace] = vehicle;
    }

    public int getNumberOfCarsWithValueOver(int price) {

        int numberOfCars = 0;

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null && vehicles[i].getPrice() > price) {

                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    public Vehicle getMostExpensiveCar() {

        //Set initialized vehicle to null
        Vehicle mostExpensiveCar = new Vehicle("Dummy", "Dummy");
        mostExpensiveCar.setPrice(0);

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null && vehicles[i].getPrice() > mostExpensiveCar.getPrice()) {

                mostExpensiveCar = vehicles[i];
            }
        }
        return mostExpensiveCar;
    }
    //New implementation with Stream().filter()
    public int getNumberOfCarsUsingStreamWithValueOver(int price) {

        return (int)Arrays.stream(vehicles)
                .filter(vehicle -> vehicle != null)
                .filter(vehicle -> vehicle.getPrice() > price)
                .count();
    }

    //New implementation with Stream()
    public Vehicle getMostExpensiveCarUsingStream() {

        return  Arrays.stream(vehicles)
                .filter(vehicle -> vehicle != null)
                .max((vehicle1, vehicle2) -> vehicle1.getPrice() - vehicle2.getPrice())
                .orElseThrow(() -> new RuntimeException("No vehicle found"));
    }
}
