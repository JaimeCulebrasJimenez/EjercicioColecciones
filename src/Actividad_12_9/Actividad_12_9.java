package Actividad_12_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad_12_9 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Integer num;

        do {
            num = sc.nextInt();
            if (num > 0) {
                lista.add(num);
            }
        } while (num != -1);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.println(i);
                lista.set(i, lista.get(i)*100);
            }   
        }
        
        System.out.println(lista);
    }
}
