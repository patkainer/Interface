package campus02.kainer.LogisticManager;

import java.util.ArrayList;


public class Logisticmanager {

    ArrayList<Moveable> moveables = new ArrayList<>();

    public void addmoveables(Moveable moveable)
    {
        this.moveables.add(moveable);
    }

    public void moveAll(String destination)
    {
        for (Moveable moveable : moveables) {

            moveable.move(destination);

        }
    }

}
