package listkart;

import java.util.Collections;
import java.util.Objects;

public class Kart implements Comparable<Kart>{
    private String username;
    private int numArticles;
    private int totalItems;
    private double totalAmount;

    public Kart(String username, int numArticles, int totalItems, double totalAmount) {
        this.username = username;
        this.numArticles = numArticles;
        this.totalItems = totalItems;
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kart kart = (Kart) o;
        return numArticles == kart.numArticles && totalItems == kart.totalItems && Double.compare(kart.totalAmount, totalAmount) == 0 && Objects.equals(username, kart.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, numArticles, totalItems, totalAmount);
    }

    @Override
    public String toString() {
        return "Kart{" +
                "username='" + username + '\'' +
                ", numArticles=" + numArticles +
                ", totalItems=" + totalItems +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public int compareTo(Kart o) {
        /*if (this.totalAmount > o.totalAmount)
            return 1;
        else if (this.totalAmount < o.totalAmount)
            return -1;
*/
        return Double.compare(o.getTotalAmount(),this.getTotalAmount());
    }


}
