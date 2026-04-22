package clases.polimorismo;

public class Circulo implements Area {
    @Override
    public double calcularArea(double... valor) {
        return Math.PI*Math.pow(valor[0], 2);
    }
}
