package Actividad_12_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Actividad_12_5 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        Collection<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i != 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(lista);

        for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();

            if (lista2.contains(next) == false) {
                lista2.add(next);
            }
        }
        
        System.out.println(lista2);
    }
}
