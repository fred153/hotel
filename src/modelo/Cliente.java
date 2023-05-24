package modelo;

public class Cliente {
    private String nombre;
    private long tel;
    private long id;
    private double numH=0;
    private boolean lim;
    private boolean comi;
    private boolean renta;
    public Cliente() {
    }
    public Cliente(String nombre, long id, long tel, double numH,boolean lim, boolean comi, boolean renta) {
        this.nombre = nombre;
        this.id = id;
        this.tel = tel;
        this.numH= numH;
        this.comi=comi;
        this.lim=lim;
        this.renta=renta;
    }

    public boolean isLim() {
        return lim;
    }

    public void setLim(boolean lim) {
        this.lim = lim;
    }

    public boolean isComi() {
        return comi;
    }

    public void setComi(boolean comi) {
        this.comi = comi;
    }

    public boolean isRenta() {
        return renta;
    }

    public void setRenta(boolean renta) {
        this.renta = renta;
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
