package Acticidad_12_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cola {

    Collection<Integer> cola = new ArrayList<>();

    void encolar(Integer num) {
        cola.add(num);
    }

    void desencolar() {
        Iterator<Integer> iterator = cola.iterator();
        if (iterator.hasNext() == true) {
            Integer next = iterator.next();
            iterator.remove();
        }

    }

    @Override
    public String toString() {
        String cola2 = "";

        for (Object object : cola) {
            cola2 += " " + object;
        }

        return cola2;
    }

}
