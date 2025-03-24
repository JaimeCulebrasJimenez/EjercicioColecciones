package Actividad_12_7;

import java.util.ArrayList;
import java.util.Collection;

public class Actividad_12_7 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList();
        Collection<Integer> c = new ArrayList<>();
        c.add(5);
        
        for (int i = 0; i != 100; i++) {
            lista.add((int) (Math.random()* 10 + 1));
        }
        
        System.out.println(lista);
        
        lista.removeAll(c);
        
        System.out.println(lista);
    }

}
