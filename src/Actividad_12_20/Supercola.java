package Actividad_12_20;

import java.util.ArrayList;
import java.util.List;

public class Supercola {

    public List<Integer> cola1 = new ArrayList<>();
    public List<Integer> cola2 = new ArrayList<>();

    public void encolarcola1(int num) {
        cola1.add(num);
    }

    public void encolarcola2(int num) {
        cola2.add(num);
    }

    public void desencolarcola1() {
        if (!cola1.isEmpty()) {
            cola1.remove(0);
        } else if (cola1.isEmpty() && !cola2.isEmpty()) {
            desencolarcola2();
        } else {
            System.out.println("ESTA MAL");
        }
    }

    public void desencolarcola2() {
        if (!cola2.isEmpty()) {
            cola2.remove(0);
        } else if (!cola1.isEmpty() && cola2.isEmpty()) {
            desencolarcola1();
        } else {
            System.out.println("ESTA MAL");
        }
    }
}
