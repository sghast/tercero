package clases.polimorismo;

public class Moto implements  InterfaceAuto {
    @Override
    public int devolverNumLlantas() {
        return 2;
    }

    @Override
    public int devolverNumAsientos() {
        return 1;
    }
}
