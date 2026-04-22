package clases.polimorismo;

public class Trole implements InterfaceAuto {
    @Override
    public int devolverNumLlantas() {
        return 12;
    }

    @Override
    public int devolverNumAsientos() {
        return 60;
    }

    public int devolverNumVagones() {
        return 3;
    }
}
