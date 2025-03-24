package Actividad_12_20;

import java.util.Scanner;

public class Actividad_12_20 {

    public static void main(String[] args) {
        int opcion, num;
        Scanner sc = new Scanner(System.in);
        Supercola cola = new Supercola();

        do {
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    num = sc.nextInt();
                    cola.encolarcola1(num);
                    break;
                case 2:
                    num = sc.nextInt();
                    cola.encolarcola2(num);
                    break;
                case 3:
                    cola.desencolarcola1();
                    break;
                case 4:
                    cola.desencolarcola2();
                    break;
            }
        } while (opcion > 0);

    }
}
