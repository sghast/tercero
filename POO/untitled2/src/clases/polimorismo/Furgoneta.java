package clases.polimorismo;

public class Furgoneta implements InterfaceAuto {
    @Override
    public int devolverNumLlantas() {
        return 4;
    }

    @Override
    public int devolverNumAsientos() {
        return 10;
    }
}
