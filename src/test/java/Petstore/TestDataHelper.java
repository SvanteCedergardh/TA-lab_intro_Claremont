package Petstore;

public class TestDataHelper {

    public static Pet getPetWithIdAndName(int id, String name) {

        String[] photoUrls = {"http://Bob the Builder.se", "http://Bob.trash"};

        Pet myPet = new Pet();
        myPet.setId(1337);
        myPet.setName("Bob the builder");
        myPet.setPhotoUrls(photoUrls);
        myPet.setStatus("available");

        return myPet;
    }
}
