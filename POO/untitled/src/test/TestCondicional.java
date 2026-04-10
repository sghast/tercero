package test;

import clases.Condicional;
import java.util.Scanner;

public class TestCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Condicional mayorDeEdad = new Condicional();
//        System.out.print("Ingresa la edad: ");
//        int edad = sc.nextInt();
//
//        if (edad > 0 && edad < 110) {
//            if (!mayorDeEdad.validarEdad(edad)) System.out.println("Menor de edad");
//            else System.out.println("Mayor de edad");
//        } else System.out.print("Fuera de rango");

//        System.out.print("Primer número: ");
//        double n1 = sc.nextDouble();
//        System.out.print("Segundo número: ");
//        double n2 = sc.nextDouble();
//
//        if (n2 == 0) System.out.print("No es posible dividir entre 0");
//        else {
//            Condicional prueba = new Condicional();
//            double resutado = prueba.dividir(n1, n2);
//            System.out.printf("%.2f%n", resutado);
//        }

        System.out.print("Credito o contado?\n> ");
        String tipo = sc.nextLine();
        Condicional pago = new Condicional();
        if (tipo.equalsIgnoreCase("credito") || tipo.equalsIgnoreCase("contado")) System.out.println(pago.validarPago(tipo));
        else System.out.println("Forma de pago inválida");

        sc.close();
    }
}
