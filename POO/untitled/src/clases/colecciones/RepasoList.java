package clases.colecciones;

import java.util.List;
import java.util.Scanner;

public class RepasoList {
    Scanner sc = new Scanner(System.in);
    // atributo
    private final List<Estudiante> lista;

    public RepasoList(List<Estudiante> lista) {
        this.lista = lista;
    }

    public void recorrerEstudiante () {
        for (Estudiante x : lista) {
            System.out.println(x);
        }
    }

    public void agregarEstudiante (Estudiante e) {
        lista.add(e);
    }

    public void eliminarEstudiante(String id) {
        for (Estudiante e : lista) {
            if (e.getCodigo().equalsIgnoreCase(id)) {
                lista.remove(e);
                System.out.println("Estudiante eliminado");
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    public void modificarEstudiante(String modificar) {
        for (Estudiante e : lista) {
            if (e.getCodigo().equalsIgnoreCase(modificar)) {
                System.out.print("\tNuevo nombre: ");
                String nombre = sc.nextLine();
                e.setNombre(nombre);
                System.out.print("\tNuevo correo: ");
                String correo = sc.nextLine();
                e.setCorreo(correo);
                System.out.print("\tNuevo semestre: ");
                int semestre = sc.nextInt();
                e.setSemeste(semestre);
                System.out.println("Estudiante modificado");
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }
}
