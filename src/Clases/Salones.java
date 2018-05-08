package Clases;

public class Salones {

    private String nombre;
    private long codigo;

    public Salones(String nombre, long codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public String toString() {
        return nombre;
    }

}
