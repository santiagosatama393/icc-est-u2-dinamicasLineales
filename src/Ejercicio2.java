import java.util.ArrayDeque;

public class Ejercicio2 {

    public boolean esPalindromo(String texto) {

        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        String invertido = "";

        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }
        if (texto.equals(invertido)) {
            return true;
        } else {
            return false;
        }
    }

}