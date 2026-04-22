package clases.polimorismo;

public class Rectangulo implements Area, Perimetro {
    @Override
    public double calcularArea(double... valor) {
        return valor[0]*valor[1];
    }

    @Override
    public double calcularPerimetro(double... valor) {
        return (2*valor[0])+(2*valor[1]);
    }
}
