package Petstore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;
import se.claremont.test.Vehicle;

import java.io.IOException;

import static Petstore.TestDataHelper.getPetWithIdAndName;

public class PetStoreTest {

    @Test
    public void putPetInPetStore() throws UnirestException, JsonProcessingException {

        Pet myPet = getPetWithIdAndName(1337, "Bob the Builder");

        new PetStoreClient().putPetInPetStore(myPet);
    }
    @Test
    public void getPetInPetStore() throws UnirestException, IOException {

        Pet storedPet = new PetStoreClient().getPetFromPetStoreById(1337);

        Assert.assertEquals( "Bob the builder",storedPet.getName());
    }
    @Test
    public void serializeVehicle() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String myVolvo = mapper.writeValueAsString(new Vehicle("Volvo", "v40"));

        System.out.println(myVolvo);
    }
    @Test
    public void deSerializeVehicle() throws IOException {

        String myVolvoJson = "{\"make\":\"Volvo\",\"model\":\"v40\",\"owner\":null,\"price\":0}";
        ObjectMapper mapper = new ObjectMapper();

        Vehicle myVolvo = mapper.readValue(myVolvoJson, Vehicle.class);

        Assert.assertEquals("v40", myVolvo.getModel());
    }
}
