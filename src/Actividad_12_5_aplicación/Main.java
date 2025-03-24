package Actividad_12_5_aplicación;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        comparadorEdad c1 = new comparadorEdad();
        comparadorNombre c2 = new comparadorNombre();
        
        
        TreeSet<Cliente> conjuntoCliente = new TreeSet<>();
        
        Cliente cliente1 = new Cliente("12345678A", "Juan", "1985/03/15");
        Cliente cliente2 = new Cliente("23456789B", "Ana", "1990/07/22");
        Cliente cliente3 = new Cliente("34567890C", "Luis", "1982/11/05");
        
        conjuntoCliente.add(cliente1);
        conjuntoCliente.add(cliente2);
        conjuntoCliente.add(cliente3);
        
        TreeSet<Cliente> conjuntoCliente2 = new TreeSet(c1);
        conjuntoCliente2.addAll(conjuntoCliente);
        
        TreeSet<Cliente> conjuntoCliente3 = new TreeSet(c2);
        conjuntoCliente3.addAll(conjuntoCliente);
        
        System.out.println(conjuntoCliente + "\n" + conjuntoCliente2 + "\n" + conjuntoCliente3);
        
        
    }
}
