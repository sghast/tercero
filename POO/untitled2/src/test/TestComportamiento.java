package test;

import clases.polimorismo.Ave;
import clases.polimorismo.Perro;
import clases.polimorismo.Pez;

public class TestComportamiento {
    public static void main(String[] args) {
        Ave ave = new Ave();
        Perro perro = new Perro();
        Pez pez = new Pez();

        System.out.println("El ave " + ave.formaMovilizar());
        System.out.println("El pez " + pez.formaMovilizar());
        System.out.println("El perro " + perro.formaMovilizar());
    }
}
