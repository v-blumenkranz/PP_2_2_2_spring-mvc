package web.model;

public class Car {
    private String brand;
    private String color;
    private String ownerName;

    public Car(String brand, String color, String ownerName) {
        this.brand = brand;
        this.color = color;
        this.ownerName = ownerName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
