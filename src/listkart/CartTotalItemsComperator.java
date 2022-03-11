package listkart;

import java.util.Comparator;

public class CartTotalItemsComperator implements Comparator<Kart> {
    @Override
    public int compare(Kart o1, Kart o2) {
        return Integer.compare(o1.getTotalItems(),o2.getTotalItems());
    }
}
