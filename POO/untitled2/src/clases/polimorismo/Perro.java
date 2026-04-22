package clases.polimorismo;

public class Perro implements Comportamiento {
    @Override
    public String formaMovilizar() {
        return "Camina";
    }
}
