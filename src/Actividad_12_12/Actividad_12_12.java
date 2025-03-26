package Actividad_12_12;

import java.util.HashSet;
import java.util.Set;

public class Actividad_12_12 {

    static <E> Set<E> union(Set<E> conj1, Set<E> conj2) {
        Set<E> conj3 = new HashSet<>(conj1);
        conj3.addAll(conj2);
        return conj3;
    }

    static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2) {
        Set<E> conj3 = new HashSet<>(conj1);
        conj3.retainAll(conj2);
        return conj3;
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        Set<Integer> conjunto2 = new HashSet<Integer>();

        conjunto1.add(2);
        conjunto1.add(6);
        conjunto1.add(7);
        conjunto1.add(1);
        
        conjunto2.add(1);
        conjunto2.add(9);
        conjunto2.add(3);
        conjunto2.add(8);
        
        System.out.println(union(conjunto1, conjunto2));
        System.out.println(interseccion(conjunto1, conjunto2));

    }
}
