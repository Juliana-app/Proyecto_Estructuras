public class Nodo {
    public int dato;
    public Nodo anterior;
    public Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
