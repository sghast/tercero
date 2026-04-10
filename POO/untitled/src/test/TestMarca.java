package test;

import clases.Marca;

public class TestMarca {
    public static void main(String[] args) {
        Marca x = new Marca();
        Marca y = null;
        try {
            System.out.println(y.imprimir());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
