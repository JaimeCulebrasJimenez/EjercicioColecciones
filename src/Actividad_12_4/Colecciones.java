package Actividad_12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones {

    public static void main(String[] args) {
        int num;
        Collection<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();

            if (num != -1) {
                numeros.add(num);
            }

        } while (num != -1);

        System.out.println(numeros.toString());

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        
        System.out.println("");
        
        for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if (next % 3 == 0) {
                iterator.remove();
            }
            
        }
        
        System.out.println(numeros.toString());

    }

}
