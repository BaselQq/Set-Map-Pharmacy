package org.example;

public class Medication {

    private String name;
    private double Price;
    private boolean availability;

    public Medication(String name, double price, boolean availability) {
        this.name = name;
        Price = price;
        this.availability = availability;
    }

    public Medication() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", availability=" + availability +
                '}';
    }
}
