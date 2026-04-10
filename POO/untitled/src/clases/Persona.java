package clases;

public class Persona {
    private String nombre = "Juan";
    private String cedula;
    private double estatura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCedula() {
        return cedula;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public String mostrar() {
        return "Nombre: " + nombre +"\nCédula: " + cedula + "\nEstatura: " + estatura;
    }
}
