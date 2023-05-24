package modelo;

public class Cliente {
    private String nombre;
    private long tel;
    private long id;
    private double numH=0;
    public Cliente() {
    }
    public Cliente(String nombre, long id, long tel, double numH) {
        this.nombre = nombre;
        this.id = id;
        this.tel = tel;
        this.numH= numH;
    }

    public double getNumH() {
        return numH;
    }

    public void setNumH(double numH) {
        this.numH = numH;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getTel() {
        return tel;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }

}
