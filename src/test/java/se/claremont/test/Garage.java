package se.claremont.test;

public class Garage {

    String address;
    //private int numberOfParkingSpaces;
    Vehicle[] vehicles = new Vehicle[10];

    public Garage(String address) {
        this.address = address;
    }
    /*
    public void setNumberOfParkingSpaces(int numberOfParkingSpaces) {

        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }
    */

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
}
