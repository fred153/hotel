package modelo;
public class Modelo {
    Listas lis=new Listas();
    double z=0;
    public Modelo() {
    }
    public Cliente agregarC(String nombre, String id, String tel){
    if(id.matches("\\d+")&&tel.matches("\\d+")){
        z=z+0.5;
        lis.ingresar(new Cliente(nombre,Long.parseLong(id),Long.parseLong(tel),z));
    return new Cliente(nombre,Long.parseLong(id),Long.parseLong(tel),z);
    }
    else{
        return null;
    }
}

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public void retirarC(String num){
        if(num.matches("\\d+")){
    lis.pop1(Double.parseDouble(num));
    z--;
    }
    }
    public Cliente encontrarC(String a){
        if(a.matches("\\d+")){
         return lis.encontrar(Integer.parseInt(a));
        }
        else {
        return null;
        }
    }
}