package listkart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoKart {

    public static void main(String[] args) {
        Kart kart1 = new Kart("Hans", 23, 23, 525.3);
        Kart kart2 = new Kart("Franz", 23, 23, 4548);
        Kart kart3 = new Kart("Karl", 23, 23, 123);

        ArrayList<Kart> kk = new ArrayList<>();
        kk.add(kart1);
        kk.add(kart2);
        kk.add(kart3);
        Collections.sort(kk);
        System.out.println("kk = " + kk);

        Collections.sort(kk,new CartTotalItemsComperator());
        System.out.println("kk = " + kk);

        Collections.sort(kk, new CartUsernameComperator());
        System.out.println("kk = " + kk);

    }
}