package modelo;
public class Modelo {
    public Modelo() {
    }
    public boolean agregarC(String nombre, String id, String tel){
    if(id.matches("\\d+")&&tel.matches("\\d+")){
    return true;
    }
    else{
        return false;
    }
    }
}