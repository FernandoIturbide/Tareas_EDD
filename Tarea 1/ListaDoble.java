public class ListaDoble{
    Nodo cabeza;
    Nodo cola;
    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo; 
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo; 
            cola = nuevoNodo; 
        }
    }
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }
            actual = actual.siguiente;
        }
        System.out.println(); 
    }
    public void revertir() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }
        Nodo actual = cabeza;
        Nodo siguiente = null;
        
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = actual.anterior;
            actual.anterior = siguiente;
            
            actual = siguiente;
        }
        Nodo temp = cabeza;
        cabeza = cola;
        cola = temp;
    }
    
    public void eliminar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    }
                } else if (actual == cola) {
                    cola = actual.anterior;
                    if (cola != null) {
                        cola.siguiente = null;
                    }
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return; 
            }
            actual = actual.siguiente;
        }
    }
    public void insertarDespuesDe(int valorExistente, int valorNuevo) {
        Nodo nuevoNodo = new Nodo(valorNuevo);
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valorExistente) {
                nuevoNodo.anterior = actual;
                nuevoNodo.siguiente = actual.siguiente;
                if (actual == cola) {
                    cola = nuevoNodo;
                } else {
                    actual.siguiente.anterior = nuevoNodo;
                }
                actual.siguiente = nuevoNodo;
                return; 
            }
            actual = actual.siguiente;
        }
    }
    public void inicializar() {
        agregar(1);
        agregar(2);
        agregar(3);
        imprimir();
    }
}
