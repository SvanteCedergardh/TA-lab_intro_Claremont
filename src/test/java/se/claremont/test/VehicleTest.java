package se.claremont.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    @Test
    public void changeOwnerOfVehicle(){

        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        myVehicle.changeOwnerShip("Bob");
        assertEquals("Bob", myVehicle.getOwner());
    }

    @Test
    public void parkCarAndCheckVehicle() {

        Vehicle vehicle1 = new Vehicle("Messerschmidt", "V8");
        Garage garage = new Garage("Birger Jarlsgatan");

        garage.parkVehicle(3,vehicle1);

        assertEquals(vehicle1, garage.checkVehicle(3));
    }
    @Test
    public void getNumberOfExpensiveCars() {

        Vehicle vehicle1 = new Vehicle("Messerschmidt", "V8");
        Vehicle vehicle2 = new Vehicle("Jaguar", "S-type");
        Vehicle vehicle3 = new Vehicle("Volvo", "XC90");
        Garage garage = new Garage("Birger Jarlsgatan");
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
        ford.setPrice(195000);
        volvo.setPrice(149900);
        Garage corporateGarage = new Garage("Birger Jarlsgatan 7");

        corporateGarage.parkVehicle(5, ford);
        corporateGarage.parkVehicle(9, volvo);

        corporateGarage.changeParkingSpace(3, ford);

        assertEquals(ford, corporateGarage.checkVehicle(3));
    }
}
