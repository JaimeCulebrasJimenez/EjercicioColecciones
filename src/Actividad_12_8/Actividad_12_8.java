package Actividad_12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Actividad_12_8 {
    public static void main(String[] args) {
        Comparator c = new Comparator();
        
        Collection<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i != 20; i++) {
            lista.add((int) (Math.random()* 10 + 1));
        }
        
        System.out.println("Lista original:" + lista);
        
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        
        lista.removeAll(lista);
        lista.addAll(Arrays.asList(tabla));
        
        System.out.println("Lista creciente:" + lista);
        
        tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla, c);
        
        lista.removeAll(lista);
        lista.addAll(Arrays.asList(tabla));
        
        System.out.println("Lista decreciente:" + lista);
        
        
        
        
    }

    
}
