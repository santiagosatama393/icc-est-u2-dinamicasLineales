import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);

        System.out.println("\nEjercicio 1:");
        System.out.println(invertido);

        Ejercicio2 ejercicio2 = new Ejercicio2();

        String palabra1 = "radar";
        String palabra2 = "computacion";

        System.out.println("\nEjercicio 2:");
        System.out.println(palabra1 + ": " + ejercicio2.esPalindromo(palabra1.toLowerCase()));
        System.out.println(palabra2 + ": " + ejercicio2.esPalindromo(palabra2.toLowerCase()));
    }

    private static void runStack() {
        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        String elemento = pila.pop();

        System.out.println("\nPila Stack:");
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();

        pila2.push("a");
        pila3.push("A");

        System.out.println("Pila ArrayDeque: " + pila2);
        System.out.println("Pila LinkedList: " + pila3);
    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();

        cola.offer("jose");
        cola.offer("andres");
        cola.offer("ana");

        System.out.println("\nCola Queue:");
        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendiendo a " + cliente);
        }
    }

    private static void runLinkedList() {
        System.out.println("Enlazada/LinkedList");

        LinkedList<String> nombres = new LinkedList<>();

        System.out.println("Esta vacia: " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(2));
        System.out.println(nombres.getLast());

        System.out.println(nombres.peek());
        System.out.println(nombres.size());

        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
}