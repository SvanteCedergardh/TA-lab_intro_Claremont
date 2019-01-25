package Petstore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;
import se.claremont.test.Vehicle;

import java.io.IOException;

public class PetStoreTest {

    @Test
    public void putPetInPetStore() throws UnirestException, JsonProcessingException {

        String[] photoUrls = {"http://Bob the Builder.se", "http://Bob.trash"};

        Pet myPet = new Pet();
        myPet.setId(1337);
        myPet.setName("Bob the builder");
        myPet.setPhotoUrls(photoUrls);

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
