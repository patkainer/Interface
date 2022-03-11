package listkart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

        Collections.sort(kk, new Comparator<Kart>() {
            @Override
            public int compare(Kart o1, Kart o2) {

                return Integer.compare(o1.getNumArticles(),o2.getNumArticles());
            }
        });

        Collections.sort(kk, (p1, p2) -> p1.getUsername().compareTo(p2.getUsername()));
        System.out.println("kk = " + kk);
        Collections.sort(kk, Comparator.comparing(Kart::getUsername));
        System.out.println("kk = " + kk);
    }
}