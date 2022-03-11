package listkart;

import java.util.Comparator;

public class CartUsernameComperator implements Comparator<Kart> {
    @Override
    public int compare(Kart o1, Kart o2) {
        return o1.getUsername().compareTo(o2.getUsername());
    }
}
