package clases.polimorismo;

public class Cuadrado implements Area, Perimetro {
    @Override
    public double calcularArea(double... valor) {
        return valor[0] * valor[0];
    }

    @Override
    public double calcularPerimetro(double... valor) {
        return 4*valor[0];
    }
}
