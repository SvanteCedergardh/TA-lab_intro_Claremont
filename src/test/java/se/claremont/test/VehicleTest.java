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
}
