package se.claremont.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarageTest {


    @Test
    public void parkCarAndCheckVehicle() {

        Vehicle vehicle1 = new Vehicle("Messerschmidt", "V8");
        Garage garage = new Garage("Birger Jarlsgatan");

        garage.setSizeOfGarage(10);

        garage.parkVehicle(3,vehicle1);

        assertEquals(vehicle1, garage.checkVehicle(3));
    }

    @Test
    public void getNumberOfExpensiveCars() {

        Vehicle vehicle1 = new Vehicle("Messerschmidt", "V8");
        Vehicle vehicle2 = new Vehicle("Jaguar", "S-type");
        Vehicle vehicle3 = new Vehicle("Volvo", "XC90");

        Garage garage = new Garage("Birger Jarlsgatan");

        garage.setSizeOfGarage(10);

        vehicle1.setPrice(999);
        vehicle2.setPrice(2500);
        vehicle3.setPrice(1500);
        garage.parkVehicle(3,vehicle1);
        garage.parkVehicle(5,vehicle2);
        garage.parkVehicle(8,vehicle3);

        assertEquals(2, garage.getNumberOfCarsWithValueOver(1000));
    }
    @Test
    public void verifyNewParkingSpace() {

        Vehicle ford = new Vehicle("Ford", "Focus");
        Vehicle volvo = new Vehicle("Volvo", "v70 Turbo");

        Garage corporateGarage = new Garage("Birger Jarlsgatan 7");
        corporateGarage.setSizeOfGarage(15);

        corporateGarage.parkVehicle(5, ford);
        corporateGarage.parkVehicle(9, volvo);

        corporateGarage.changeParkingSpace(3, ford);

        assertEquals(ford, corporateGarage.checkVehicle(3));
    }
    @Test
    public void checkForMostExpensiveCarInGarage() {

        Vehicle messerschmidt = new Vehicle("Messerschmidt", "V6");
        Vehicle jaguar = new Vehicle("Jaguar", "XK");
        Vehicle fiat = new Vehicle("Fiat", "Punto");
        Vehicle trabant = new Vehicle("Trabant", "V12");

        Garage designGarage = new Garage("Vällingbygaraget");
        designGarage.setSizeOfGarage(12);

        messerschmidt.setPrice(64561);
        jaguar.setPrice(68035);
        fiat.setPrice(12595);
        trabant.setPrice(49510);

        designGarage.parkVehicle(2,messerschmidt);
        designGarage.parkVehicle(4,jaguar);
        designGarage.parkVehicle(7,fiat);
        designGarage.parkVehicle(9,trabant);

        assertEquals(jaguar, designGarage.getMostExpensiveCar());
    }
    @Test
    public void getNumberOfExpensiveCarsUsingStream() {

        Vehicle vehicle1 = new Vehicle("Messerschmidt", "V8");
        Vehicle vehicle2 = new Vehicle("Jaguar", "S-type");
        Vehicle vehicle3 = new Vehicle("Volvo", "XC90");

        Garage garage = new Garage("Birger Jarlsgatan");

        garage.setSizeOfGarage(10);

        vehicle1.setPrice(999);
        vehicle2.setPrice(2500);
        vehicle3.setPrice(1500);
        garage.parkVehicle(3,vehicle1);
        garage.parkVehicle(5,vehicle2);
        garage.parkVehicle(8,vehicle3);

        assertEquals(2, garage.getNumberOfCarsUsingStreamWithValueOver(1000));

    }
    @Test
    public void checkForMostExpensiveCarInGarageUsingStreamM() {

        Vehicle messerschmidt = new Vehicle("Messerschmidt", "V6");
        Vehicle jaguar = new Vehicle("Jaguar", "XK");
        Vehicle fiat = new Vehicle("Fiat", "Punto");
        Vehicle trabant = new Vehicle("Trabant", "V12");

        Garage designGarage = new Garage("Vällingbygaraget");
        designGarage.setSizeOfGarage(12);

        messerschmidt.setPrice(64561);
        jaguar.setPrice(68035);
        fiat.setPrice(12595);
        trabant.setPrice(49510);

        designGarage.parkVehicle(2,messerschmidt);
        designGarage.parkVehicle(4,jaguar);
        designGarage.parkVehicle(7,fiat);
        designGarage.parkVehicle(9,trabant);

        assertEquals(jaguar, designGarage.getMostExpensiveCarUsingStream());
    }
}