package campus02.kainer.LogisticManager;

import java.util.Objects;

public class Shirt implements Moveable {
    private String brand;
    private String color;
    private String weight;

    public Shirt(String brand, String color, String weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return Objects.equals(brand, shirt.brand) && Objects.equals(color, shirt.color) && Objects.equals(weight, shirt.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, weight);
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color+brand+weight+destination);

    }
}
