package Acticidad_12_17;

public class Main {
    public static void main(String[] args) {
        
        Pila<Integer> pila1 = new Pila<>();
        pila1.apilar(3);
        pila1.apilar(6);
        pila1.apilar(10);
        pila1.apilar(3);
        
        System.out.println(pila1);
        
        pila1.desapilar();
        pila1.desapilar();
        
        System.out.println(pila1);
    }
    
}
