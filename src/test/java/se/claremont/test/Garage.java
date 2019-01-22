package se.claremont.test;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    String address;
    Vehicle[] vehicles;// = new Vehicle[10];
    //List<Vehicle> vehicles = new ArrayList<Vehicle>();

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

        Vehicle mostExpensiveCar = new Vehicle("Dummy", "Dummy");
        mostExpensiveCar.setPrice(0);

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null && vehicles[i].getPrice() > mostExpensiveCar.getPrice()) {

                mostExpensiveCar = vehicles[i];
            }
        }
        return mostExpensiveCar;
    }
    public List<Vehicle> convertArrayToList() {

        List<Vehicle> parkingLots = new ArrayList<Vehicle>();

        return parkingLots;
    }








    //Change implementation to Stream()
    public int usingStreamToGetNumberOfCarsWithValueOver(int price) {

        int numberOfCars = 0;

        List<Vehicle> vehicles = new ArrayList<Vehicle>();



        return numberOfCars;
    }
    //Change the implementation to Stream()
    public Vehicle usingStreamToGetMostExpensiveCar() {

        Vehicle firetruck = new Vehicle("Mercedez", "Firetruck");

        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        return firetruck;

    }
}
