package test;

import clases.Producto;

import java.util.Scanner;
public class TestProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        System.out.println("PRIMER PRODUCTO");
        System.out.print("Nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.print("Precio: ");
        p1.setPrecio(sc.nextDouble());
        System.out.print("Stock: ");
        p1.setStock(sc.nextInt());
        sc.nextLine();

        System.out.println("SEGUNDO PRODUCTO");
        System.out.print("Nombre: ");
        p2.setNombre(sc.nextLine());
        System.out.print("Precio: ");
        p2.setPrecio(sc.nextDouble());
        System.out.print("Stock: ");
        p2.setStock(sc.nextInt());

        System.out.println("Primer producto\n" + p1);
        System.out.println("Segundo producto\n" + p2);

        sc.close();
    }
}
