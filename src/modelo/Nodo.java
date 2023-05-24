package modelo;
public class Nodo <T> {
    T elemento;
    Nodo<T>siguiente;
public Nodo(){
 elemento =null;
 siguiente =null;
}
    public T getElemento() {
        return elemento;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}