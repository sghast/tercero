package test;
import java.util.Scanner;
//solicitar por teclado el codigo, nombre, n° créditos y horario de la materia
public class Test {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Código: ");
        String codigo = datos.nextLine();
        System.out.print("Nombre: ");
        String nombre= datos.nextLine();
        System.out.print("n° créditos: ");
        int ncreditos = datos.nextInt();
        datos.nextLine();//limpiar buffer
        System.out.print("Horario: ");
        String horario = datos.nextLine();

        System.out.printf("%nCódigo: %s%nNombre: %s%nCréditos: %d%nHorario: %s", codigo, nombre, ncreditos, horario);

        datos.close();
    }
}
