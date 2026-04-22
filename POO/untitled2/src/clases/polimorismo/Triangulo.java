package clases.polimorismo;

public class Triangulo implements Area {
    @Override
    public double calcularArea(double... valor) {
        return (valor[0]*valor[1])/2;
    }
}
