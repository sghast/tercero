package test;

import clases.polimorismo.Circulo;
import clases.polimorismo.Cuadrado;
import clases.polimorismo.Rectangulo;
import clases.polimorismo.Triangulo;

public class TestFigura {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        System.out.println(cuadrado.calcularArea(10));
        System.out.println(cuadrado.calcularPerimetro(2));
        System.out.println(rectangulo.calcularArea(8, 6));
        System.out.println(triangulo.calcularArea(2, 9));
        System.out.println(circulo.calcularArea(10));
    }
}
