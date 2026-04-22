package test;

import clases.Persona;
import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Persona p1 = new Persona();
        p1.setNombre(datos.nextLine());
        p1.setCedula(datos.nextLine());
        p1.setEstatura(datos.nextDouble());

        System.out.println(p1.mostrar());

        datos.close();
    }
}
