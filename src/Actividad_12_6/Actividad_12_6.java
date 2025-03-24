package Actividad_12_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Actividad_12_6 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList();
        
        for (int i = 0; i != 100; i++) {
            lista.add((int) (Math.random()*10 + 1));
        }
        
        System.out.println(lista);
        
        for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if (next == 5) {
                iterator.remove();
            }
        }
        
        System.out.println(lista);
    }
}
