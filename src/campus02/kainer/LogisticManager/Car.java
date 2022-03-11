package campus02.kainer.LogisticManager;

import java.util.Objects;

public class Car implements Moveable
{
    private String type;
    private String color;
    private int weight;

    public Car(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && Objects.equals(type, car.type) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, weight);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {

        System.out.println(color+type+weight+destination);

    }
}

