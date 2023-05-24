package modelo;
public class Cola<T> extends Listas{
    Nodo<T> Last;
    public Cola() {
        this.Last=null;
    }
    public Nodo<T> getLast() {
        return Last;
    }
    public void setLast(Nodo<T> Last) {
        this.Last = Last;
    }
    public void insert(T element){
    Nodo<T>item =new Nodo<>();
    item.setElemento(element);
    if(this.isEmpty()){
        this.setHead(item);
        this.setLast(item);
    }
    else{
    this.getLast().setSiguiente(item);
    this.setLast(item);
    }
    int tam=super.getSize();
    this.setSize(tam+1);
    }
    public int obteSize1() {
        if(size==0){
            return 0; 
        }
        return this.obteSize2(this.getHead(),0);
    }
    public int obteSize2(Nodo<T> item,int c) {
        if(item==null){
            return c; 
        }
        return obteSize2(item.getSiguiente(),c+1);
    }
}