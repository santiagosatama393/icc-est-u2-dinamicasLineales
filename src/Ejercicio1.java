import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
    //metodo que devuelve una cadena de texto invertida
    //texto - computacion
    //return- noicatupmoc
    //usando solo pilas 
    public String invertString(String texto){
        Deque<Character> pila = new ArrayDeque<>();
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        String invertido = "";
        while(!pila.isEmpty()){
            invertido += pila.pop();
        }
        return invertido;
    }
}
