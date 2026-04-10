package clases;

public class Condicional {
//    public boolean validarEdad(int edad) {
//        if (edad < 18) return false;
//        else return true;
//    }

//    public double dividir (double n1, double n2) {
//        return n1/n2;
//    }

    public String validarPago (String tipo) {
        if (tipo.equalsIgnoreCase("credito")) return "Descuento: 25%";
        else return "Descuento: 2%";
    }
}
