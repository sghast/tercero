package test;

import clases.colecciones.Estudiante;
import clases.colecciones.RepasoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestColecciones {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<Estudiante>();
        RepasoList repaso = new RepasoList(lista);

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos estudiantes desea agregar?\n> ");
        int nEstudiantes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("Estudiante " + (i+1));
            System.out.print("\tCódigo: ");
            String codigo = sc.nextLine();
            System.out.print("\tNombre: ");
            String nombre = sc.nextLine();
            System.out.print("\tCorreo: ");
            String correo = sc.nextLine();
            System.out.print("\tSemestre: ");
            int semestre = sc.nextInt();
            sc.nextLine();

            repaso.agregarEstudiante(new Estudiante(codigo, nombre, correo, semestre));
        }

        repaso.recorrerEstudiante();

        System.out.print("Ingrese el CÓDIGO del estudiante a modificar: ");
        String modificar = sc.nextLine();
        repaso.modificarEstudiante(modificar);

        repaso.recorrerEstudiante();

        System.out.print("Ingrese el CÓDIGO del estudiante a eliminar: ");
        String eliminar = sc.nextLine();
        repaso.eliminarEstudiante(eliminar);

        repaso.recorrerEstudiante();
    }
}