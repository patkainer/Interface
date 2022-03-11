package campus02.kainer.LogisticManager;

public class Demo {


    public static void main(String[] args) {
        Logisticmanager logisticmanager = new Logisticmanager();
        Car car = new Car("VW","black",500);
        Shirt shirt = new Shirt("Brada","blue","2gramm");


        logisticmanager.addmoveables(car);
        logisticmanager.addmoveables(shirt);

        logisticmanager.moveAll("Graz");
    }
}
