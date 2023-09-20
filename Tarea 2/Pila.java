import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(Object elemento) {
        elementos.add(elemento);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
    public void imprimir (){
        System.out.println(elementos);
    }
}
