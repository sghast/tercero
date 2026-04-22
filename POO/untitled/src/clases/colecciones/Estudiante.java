package clases.colecciones;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String correo;
    private int semeste;

    public Estudiante (String codigo, String nombre, String correo, int semeste) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.semeste = semeste;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSemeste(int semeste) {
        this.semeste = semeste;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", semeste=" + semeste +
                '}';
    }
}
