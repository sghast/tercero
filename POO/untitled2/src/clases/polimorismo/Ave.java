package clases.polimorismo;

public class Ave implements Comportamiento {
    @Override
    public String formaMovilizar() {
        return "Vuela";
    }
}
