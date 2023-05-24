package modelo;
public class Listas <T>{
     Nodo<T> Head;
    int size;
public Listas() {
        this.Head = null;
        this.size = 0;
    }
    public Nodo<T> getHead() {
        return Head;
    }
    public int getSize() {
        return size;
    }
    public void setHead(Nodo<T> Head) {
        this.Head = Head;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty(){
        if(this.Head==null){
        return true;
        }
        return false;
    }
    public void imprimir1(){
    imprimir(this.getHead());
    }
    public void imprimir(Nodo<T> n1){
        if(n1==null){
            return;
        }
        System.out.println((n1.getElemento()).toString());
        imprimir(n1.getSiguiente());
    }
    public void pop1(double a){
        System.out.println(this.Head.getElemento());
        Nodo<T> aux=new Nodo<>();
        Nodo<T> aux1=new Nodo<>();
        aux=this.getHead();
        aux1.setElemento((T)new Cliente(" ",0,0,a,false,false,false));
        if(isEmpty()){
            return;
        }
        else{
        Cliente este=new Cliente();
        Cliente este1=new Cliente();
        este= (Cliente) aux1.getElemento();
        este1= (Cliente) aux.getElemento();
            if(este.getNumH()==este1.getNumH()){
             this.Head.setElemento(this.Head.getSiguiente().getElemento());
             this.setSize(this.getSize()-1);
             aux1=null;
            }
            while(aux.getElemento()!=null){
                aux=aux.getSiguiente();
                este1= (Cliente) aux.getElemento();
                if(este.getNumH()==este1.getNumH()){
                    if(aux.getSiguiente()==null){
                        aux.setSiguiente(null);
                        this.setSize(this.getSize()-1);
                        aux1=null;
                    }
                    else{
                    aux.setElemento(aux.getSiguiente().getElemento());
                        this.setSize(this.getSize()-1);
                        aux1=null;
                    }
                }
            }
        }
    }
public Cliente encontrar(double a) {
    return encontrar1(this.getHead(), a);
}

private Cliente encontrar1(Nodo<T> n1, double a) {
    Nodo<T> aux = n1;
    while (aux != null) {
        Cliente este = (Cliente) aux.getElemento();
        if (este.getNumH() == a) {
            return este;
        }
        aux = aux.getSiguiente();
    }
    return null;
}
    public void ingresar(T element) {
    Nodo<T> nuevo = new Nodo<>();
    nuevo.setElemento(element);

    if (isEmpty()) {
        setHead(nuevo);
    } else {
        Nodo<T> aux = getHead();
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
    }

    setSize(getSize() + 1);
}
}
