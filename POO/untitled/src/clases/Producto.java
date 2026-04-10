package clases;

public class Producto {
    private String nombre;
    private double precio;
    private  int stock;

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }

    public void setPrecio (double precio) {
        if (precio > 0) this.precio = precio;
        else System.out.println("No se admiten valores negativos");
    }
    public double getPrecio () {
        return precio;
    }

    public void setStock (int stock) {
        if (stock > 0) this.stock = stock;
        else System.out.println("No se admiten valores negativos");
    }
    public int getStock() {
        return stock;
    }

    public String mostrar() {
        return "Nombre: " + nombre + "\nPrecio: $" + precio + "\nStock: " + stock;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre +
                "\nprecio=" + precio +
                "\nstock=" + stock;
    }
}
