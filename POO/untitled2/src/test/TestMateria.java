package test;

import clases.Materia;
import java.util.Scanner;

public class TestMateria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Materia materia = new Materia();
        materia.setNombre("POO");
        materia.setnCreditos(3);

        System.out.println(materia.getNombre() + "\n" + materia.getnCreditos());
        sc.close();
    }
}
