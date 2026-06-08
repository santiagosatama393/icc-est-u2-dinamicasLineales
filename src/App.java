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
        System.out.println(invertido);
        

        
    }

    private static void runStack() {
       Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();



    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("jose");
        cola.offer("andres");
        cola.offer("ana");
        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atenti a "+ cliente);
        }

        //ofer- agrega al final 
        //peek- devuelve el proimero sin eliminar
        //m poll- devuelve el primero y lo elimina 


    }

    private static void runLinkedList() {
        System.out.println("Enlazada/LinkedList");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Esta vacia"+ nombres.isEmpty());
        System.out.println("Tamanio"+ nombres.isEmpty());

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
