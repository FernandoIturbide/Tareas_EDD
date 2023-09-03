public class ListaCircular {
    Nodo cabeza;
    public ListaCircular() {
        this.cabeza = null;
    }
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza; 
        } else {
            nuevoNodo.siguiente = cabeza;
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
        }
    }
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        do {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != cabeza) {
                System.out.print(" <-> ");
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }
    public void eliminar(int valor) {
        if (cabeza == null) {
            return; 
        }
        Nodo actual = cabeza;
        Nodo anterior = null;
        do {
            if (actual.dato == valor) {
                if (actual == cabeza) {
                    if (cabeza.siguiente == cabeza) {
                        cabeza = null; 
                    } else {
                        cabeza = cabeza.siguiente; 
                        Nodo ultimo = obtenerUltimoNodo();
                        ultimo.siguiente = cabeza; 
                    }
                    return;
                }
                anterior.siguiente = actual.siguiente; 
                return; 
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
    private Nodo obtenerUltimoNodo() {
        Nodo ultimo = cabeza;
        while (ultimo.siguiente != cabeza) {
            ultimo = ultimo.siguiente;
        }
        return ultimo;
    }
    public void insertarDespuesDe(int valorExistente, int valorNuevo) {
        Nodo nuevoNodo = new Nodo(valorNuevo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
            return;
        }
        Nodo actual = cabeza;
        do {
            if (actual.dato == valorExistente) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return; 
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
    public void inicializar() {
        agregar(1);
        agregar(2);
        agregar(3);
        imprimir();
    }
    public void revertir() {
        if (cabeza == null || cabeza.siguiente == cabeza) {
            return;
        }
        Nodo actual = cabeza;
        Nodo siguiente = cabeza.siguiente;
        Nodo temp;
        do {
            temp = siguiente.siguiente; 
            siguiente.siguiente = actual; 
            actual = siguiente;
            siguiente = temp;
        } while (siguiente != cabeza);
        cabeza.siguiente = actual;
        cabeza = actual;
    }
}


