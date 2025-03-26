package Actividad_12_10;

import java.util.ArrayList;
import java.util.List;

public class Actividad_12_10 {

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        
        for (int i = 0; i != 10; i++) {
            lista1.add((int) (Math.random()*10+1));
        }
    }

}
