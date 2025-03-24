package Acticidad_12_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pila<T> {

    Collection<T> pila = new ArrayList<>();

    void apilar(T num) {
        pila.add(num);
    }

    void desapilar() {
        for (Iterator<T> iterator = pila.iterator(); iterator.hasNext();) {
            T next = iterator.next();
            if (iterator.hasNext() == false) {
                   iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        String pila2 = "";

        for (Object object : pila) {
            pila2 += " " + object;
        }

        return pila2;
    }

}
