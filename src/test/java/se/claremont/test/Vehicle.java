package se.claremont.test;

public class Vehicle {

    private String make;
    private String model;
    private String owner;
    private int price;

    public Vehicle(String make, String model) {

        this.make = make;
        this.model = model;
    }
    public void setPrice(int price) {

        this.price = price;
    }

    public void changeOwnerShip(String newOwner) {

        owner = newOwner;
    }

    public String getOwner() {

        return owner;
    }
    public int getPrice() {

        return price;
    }
}
