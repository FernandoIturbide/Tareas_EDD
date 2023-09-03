public class ListaEnlazada {
    Nodo cabeza;
    public ListaEnlazada() {
        this.cabeza = null;
    }
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println(); 
    }
    public void inicializar() {
        agregar(1);
        agregar(2);
        agregar(3);
        imprimir();
    }
    public void eliminar(int valor) {
        if (cabeza == null) {
            return; 
        }
        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
    public void insertar(int valor, int posicion) {
        Nodo nuevoNodo = new Nodo(valor);
        if (posicion <= 0) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            int contador = 0;
            while (contador < posicion - 1 && actual != null) {
                actual = actual.siguiente;
                contador++;
            }
            if (actual != null) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
            } else {
                agregar(valor);
            }
        }
    }
    public void revertir() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }
        Nodo previo = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = previo;
            previo = actual;
            actual = siguiente;
        }
        cabeza = previo;
    }
}