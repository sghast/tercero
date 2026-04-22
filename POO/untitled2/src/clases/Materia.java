package clases;

public class Materia {
    private String nombre;
    private int nCreditos;

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setnCreditos (int nCreditos) {
        this.nCreditos = nCreditos;
    }

    public String getNombre () {
        return nombre;
    }

    public int getnCreditos () {
        return nCreditos;
    }
}
