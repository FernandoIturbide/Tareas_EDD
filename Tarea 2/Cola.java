import java.util.LinkedList;

public class Cola {
    private LinkedList<Object> elementos;

    public Cola() {
        elementos = new LinkedList<>();
    }

    public void enqueue(Object elemento) {
        elementos.addLast(elemento);
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.removeFirst();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.getFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
    public void imprimir(){
        System.out.println(elementos);
    }
}
